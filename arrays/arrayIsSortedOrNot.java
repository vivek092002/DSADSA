package arrays;

import java.util.Scanner;

public class arrayIsSortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(isSortedOrNot(arr));
        sc.close();
    }

    //brute force
    //for brute for solution we can use two loops for traversal and check adjacent element is arr[j] < arr[i]
    //then it is not a sorted array and vice versa.


    //optimal force solution
    //Time Complexity: O(N)
    //
    //Space Complexity: O(1)
    public static boolean isSortedOrNot(int[] arr){
        for (int a = 0; a < arr.length-1; a++) {
            if (arr[a] > arr[a+1]){
                return false;
            }
        }
        return true;
    }
}
