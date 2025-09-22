package binarySearch;

public class searchElementInRotatedSorted {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;

        System.out.println(searchInRotated(arr, target));
    }
    //brute force is linear search
    //optimal is using binary search
    public static int searchInRotated(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = (start + end) / 2;
            if (arr[mid] == target){
                return mid;
            }

            if (arr[start] <= arr[mid]){
                if (arr[start] <= target && target <= arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] <= target && arr[end] >= target){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}

//The steps are as follows:
//Place the 2 pointers i.e. low and high: Initially, we will place the pointers like this: low will point to the first index, and high will point to the last index.
//Calculate the ‘mid’: Now, inside a loop, we will calculate the value of ‘mid’ using the following formula:
//mid = (low+high) // 2 ( ‘//’ refers to integer division)
//Check if arr[mid] == target: If it is, return the index mid.
//Identify the sorted half, check where the target is located, and then eliminate one half accordingly:
//1. if arr[low] <= arr[mid]: This condition ensures that the left part is sorted.
//a. If arr[low] <= target && target <= arr[mid]: It signifies that the target is in this sorted half. So, we will eliminate the right half (high = mid-1).
//b. Otherwise, the target does not exist in the sorted half. So, we will eliminate this left half by doing low = mid+1.
//2. Otherwise, if the right half is sorted:
//a. If arr[mid] <= target && target <= arr[high]: It signifies that the target is in this sorted right half. So, we will eliminate the left half (low = mid+1).
//b. Otherwise, the target does not exist in this sorted half. So, we will eliminate this right half by doing high = mid-1.
//Once, the ‘mid’ points to the target, the index will be returned.
//This process will be inside a loop and the loop will continue until low crosses high. If no index is found, we will return -1.