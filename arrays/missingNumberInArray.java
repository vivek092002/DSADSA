package arrays;

import java.util.Scanner;

public class missingNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,4,5};
        System.out.println(missing3(arr));
        sc.close();
    }

    //brute force approach
    //use hashing - we will store all the frequency of the element and then we
    // will see which element has frequency zero
    public static int missing(int[] arr){
        int n = arr.length;
        int[] hash = new int[n+1];
        for(int i = 0 ; i < n - 1 ; i++){
            hash[arr[i]]++;
        }
        for(int i = 1 ; i <= n ; i++){
            if (hash[i] == 0){
                return i;
            }
        }
        return -1;
    }

    //optimal approach 1
    //using the formula
    public static int missing2(int[] arr){
        int n = arr.length;
        int n1 = n + 1;
        int sum = (n1 * (n1 + 1) / 2);

        int sum2 = 0;
        for(int i = 0 ; i < n ; i++){
            sum2 += arr[i];
        }

        return sum - sum2;
    }

    //optimal approach
    //using the XOR function
    public static int missing3(int[] arr){
        int n = arr.length;
        int xor = 0;
        for(int i = 0 ; i < n ; i++){
            xor = xor ^ arr[i];
        }
        int xor2 = 0;
        for(int i = 1 ; i <= n+1 ; i++){
            xor2 = xor2 ^ i;
        }

        return xor ^ xor2;
    }
}
