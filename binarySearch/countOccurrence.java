package binarySearch;

//https://takeuforward.org/data-structure/count-occurrences-in-sorted-array/

public class countOccurrence {
    public static void main(String[] args) {
        int[] arr = {2, 2 , 3 , 3 , 3 , 3 , 4};
        int target = 3;
        int n = arr.length;

        System.out.println(count(arr, target));
    }

    public static int count(int[] arr, int target){
        int first = firstOccur(arr, target);
        int last = lastOccur(arr, target);
        return last - first + 1;
    }


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
