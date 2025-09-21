package binarySearch;

import java.util.Scanner;
//Compare arr[mid] with x: With comparing arr[mid] to x, we can observe 2 different cases:
//Case 1 - If arr[mid] >= x: This condition means that the index mid may be an answer.
// So, we will update the ‘ans’ variable with mid and search in the left half if there is any smaller index that satisfies the same condition. Here, we are eliminating the right half.
//Case 2 - If arr[mid] < x: In this case, mid cannot be our answer and we need to find some
// bigger element. So, we will eliminate the left half and search in the right half for the answer.
public class lowerBound {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int[] arr = {3,5,8,15,19};
        int x = 9;
        System.out.println(lowerB(arr,x));
        //sc.close();
    }

    public static int lowerB(int[] arr, int x){
        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length;
        while (start <= end){
            int mid = (start + end) / 2;
            if (arr[mid] >= x){
                ans = mid;
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
