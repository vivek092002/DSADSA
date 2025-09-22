package binarySearch;

//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

public class minimumInRotatedSorted {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println();
    }

    //brute force method is using linear search
    //optimal approach is using binary search
    public static int mini(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int min = Integer.MAX_VALUE;
        while (start <= end){
            int mid = (start + end) / 2;

            if (arr[start] <= arr[end]){
                    min = Math.min(min, arr[start]);
                    break;
            }

            //see if left part is sorted or not
            if (arr[start] < arr[mid]){
                    min = Math.min(arr[mid], min);
                    start = mid + 1;
            } else {
                //check for the right part
                    min = Math.min(arr[mid], min);
                    end = mid - 1;
            }
        }
        return min;
    }
}

//Place the 2 pointers i.e. low and high: Initially, we will place the pointers like this: low will point to the first index and high will point to the last index.
//Calculate the ‘mid’: Now, inside a loop, we will calculate the value of ‘mid’ using the following formula:
//mid = (low+high) // 2 ( ‘//’ refers to integer division)
//If arr[low] <= arr[high]: In this case, the array from index low to high is completely sorted. Therefore, we can select the minimum element, arr[low].
//Now, if arr[low] < ans, we will update ‘ans’ with the value arr[low] and ‘index’ with the corresponding index low.
//Once this is done, there is no need to continue with the binary search algorithm. So, we will break from this step.
//Identify the sorted half, and after picking the leftmost element, eliminate that half.
//If arr[low] <= arr[mid]:
//This condition ensures that the left part is sorted. So, we will pick the leftmost element i.e. arr[low].
//Now, if arr[low] < ans, we will update ‘ans’ with the value arr[low] and ‘index’ with the corresponding index low.
//After that, we will eliminate this left half(i.e. low = mid+1).
//Otherwise, if the right half is sorted:  This condition ensures that the right half is sorted. So, we will pick the leftmost element i.e. arr[mid].
//Now, if arr[mid] < ans, we will update ‘ans’ with the value arr[mid] and ‘index’ with the corresponding index mid.
//After that, we will eliminate this right half(i.e. high = mid-1).
//This process will be inside a loop and the loop will continue until low crosses high. Finally, we will return the ‘index’ variable that stores the index of the minimum element.