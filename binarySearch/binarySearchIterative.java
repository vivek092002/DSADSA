package binarySearch;

import java.util.Scanner;

public class binarySearchIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int target = 6;
        System.out.println(BS(arr, target));
        sc.close();
    }

    public static int BS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = (start + end) / 2;
            if (arr[mid] < target){
                start = mid + 1;
            } else if (arr[mid] > target){
                end = mid - 1;
            } else if (arr[mid]  == target){
                return mid;
            }
        }
        return -1;
    }
}
