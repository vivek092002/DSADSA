package binarySearch;

import java.util.Scanner;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class firstAndLastPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int[] arr = {3,4,13,13,13,20,40};
        int target = 13;
        System.out.println(firstOccur(arr,target));
        System.out.println(lastOccur(arr,target));
        sc.close();
    }

    //Initially consider the start=0 and the end=n-1 pointers and the result as -1.
    //Till start does not crossover end pointer compare the mid element
    //If the mid element is equal to the key value, store the mid-value in the result and move the start pointer to mid+1(move leftward)
    //Else if the key value is less than the mid element then end= mid-1(move leftward)
    //Else do start = mid+1 (move rightwards)

    public static int firstOccur(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end){
            int mid = (start + end ) / 2;
            if (arr[mid] == target){
                ans = mid;
                end = mid - 1;
            } else if(arr[mid] > target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static int lastOccur(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end){
            int mid = (start + end) / 2;
            if (arr[mid] == target){
                ans = mid;
                start = mid + 1;
            } else if(arr[mid] > target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
