package arrays;

import java.util.Scanner;

public class secondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0 ; i<5 ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(findLargest2(arr));
        sc.close();
    }

    //brute force solution
    // do the sorting and return the second last element which is not equal to the largest
    public static int findLargest(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i ; j < arr.length; j++) {
                if(arr[j] > arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        int largest = arr[arr.length-1];
        for(int i = arr.length - 2 ; i >= 0 ; i--){
           // if (arr[i])
        }
        return 0;
    }


    //better solution
    //first find the largest element and then bypassing the largest element find the second largest.
    //Time Complexity: O(2N), We do two linear traversals in our array
    //Space Complexity: O(1)
    public static int findLargest2(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }

        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] != max){
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    //optimal solution
    //initialize with largest = arr[0] and sLargest = -1 and then traverse through the array if the number is larger than largest then update
    // both and if the number is smaller than largest and greater than sLargest then update the sLargest
    //Time Complexity: O(N), Single-pass solution
    //Space Complexity: O(1)
    public static int findLargest3(int[] arr){
        int largest = arr[0];
        int sLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
             if (arr[i] > largest){
                 sLargest = largest;
                 largest = arr[i];
             } else if(arr[i] < largest && arr[i] > sLargest) {
                 sLargest = arr[i];
             }
        }

        return sLargest;
    }
}
