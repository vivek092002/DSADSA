package arrays;

public class largestNumber {
    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 9, 3, 1};
        System.out.println(largestNumberInArray2(arr));
    }

    //brute force solution
    //we can use sorting as it can sort in descending order and we can return last element
    public static int largestNumberInArray(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr[len - 1];
    }

    //optimal solution
    //O(N)
    public static int largestNumberInArray2(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}