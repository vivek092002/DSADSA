package binarySearch;

//https://leetcode.com/problems/search-insert-position/description/

public class searchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 5;
        System.out.println();
    }

    //brute force is using linear search

    //optimal is using lower bound
    public static int searchInsert(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int ans = nums.length;
        while (start <= end){
            int mid = (start + end) / 2;
            if (nums[mid] >= target){
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
