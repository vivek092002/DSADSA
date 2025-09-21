package arrays;

import java.util.Scanner;

public class maxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(longest(arr));
        sc.close();
    }

    //brute force method
    public static int longest(int[] arr){
        int count = 0;
        int max = 0;
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] == 1){
                count++;
            } else {
                count = 0;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
