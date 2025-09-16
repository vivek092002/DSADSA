package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class rotateArrayByD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =  new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int d = 3;
        rotateByD1(arr, d);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    //brute force method
    //using a temp array
    public static void rotateByD(int[] arr, int d){
        int n = arr.length;
        if (n == 0){
            return;
        }
        d = d % n;
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        //shift the array in front
        for (int i = d; i < n; i++) {
            arr[i-d] = arr[i];
        }

        //put the temp array in the main array
        int j = 0;
        for(int i = n-d; i < n; i++) {
            arr[i] = temp[j];
            j++;
        }
    }

    //optimise method
    //using reversal algorithm
    //time complexity - O(N)
    //space complexity - O(1)
    public static void rotateByD1(int[] arr, int d){
        reverse(arr, 0 , d - 1);
        reverse(arr, d, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static void reverse(int[] arr, int start, int end){
        while (start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
