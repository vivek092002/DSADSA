package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;

        System.out.println(Arrays.toString(sumTwo(arr,target)));
    }


    //brute force solution
    public static int[] sumTwo(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j){
                    continue;
                }
                if (arr[i] + arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    //better solution
    //use hashmap
    public static int[] sumTwo2(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])){
                return new int[]{i, map.get(target - arr[i])};
            } else {
                map.put(arr[i],i);
            }
        }
        return new int[]{-1,-1};
    }

    //optimal approach
    //use two pointers
    public static boolean sumTwo3(int[] arr, int target){
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            int sum = arr[left] + arr[right];
            if (sum == target){
                return true;
            } else if (sum < target){
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}
