package arrays;

//https://leetcode.com/problems/sort-colors/description/

import java.lang.reflect.Array;
import java.util.Arrays;

public class sortColors {
    public static void main(String[] args) {
        //int[] arr = new int[5];
        int[] arr = {2, 0, 2, 1, 1, 0};

        System.out.println(Arrays.toString(sort(arr)));
        System.out.println(Arrays.toString(sort2(arr)));
    }

    //brute force solution
    //use sorting algorithm
    public static int[] sort(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    //better solution
    public static int[] sort2(int[] arr){
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                count1++;
            } else if (arr[i] == 1){
                count2++;
            } else {
                count3++;
            }
        }
        for (int i = 0; i < count1; i++) {
            arr[i] = 0;
        }
        for (int i = count1 ; i < count1 + count2 ; i++){
            arr[i] = 1;
        }
        for (int i = count1 + count2; i < count1 + count2 + count3; i++) {
            arr[i] = 2;
        }

        return arr;
    }
}
