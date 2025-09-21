package binarySearch;

import java.util.Scanner;

public class higherBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        System.out.println(upperB(arr,n,x));
        sc.close();
    }

    //optimal solution
    public static int upperB(int[] arr, int n, int x){
        int start = 0;
        int end = n - 1;
        int ans = n;
        while (start <= end){
            int mid = (start + end) / 2;
            if (arr[mid] > x){
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
