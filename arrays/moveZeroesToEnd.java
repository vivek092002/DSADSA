package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class moveZeroesToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println(Arrays.toString(moveZeroes2(arr)));
        sc.close();
    }

    //brute force method
    //time complexity - O(2N)
    //space complexity - O(N)
    public static void moveZeroes(int[] arr) {
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 0 ; i < arr.length ; i++){
            if(arr[i] != 0){
                li.add(arr[i]);
            }
        }
        //place the elements of the arraylist in the array
        int len = li.size();
        for (int i = 0 ; i < len ; i++){
            arr[i] = li.get(i);
        }

        //now fill all the other space with zeroes
        for(int i = len ; i < arr.length ; i++){
            arr[i] = 0;
        }
    }

    //optimised method - 2 pointer algo
    //First, using a loop, we will place the pointer j. If we don’t find any 0, we will not perform the following steps.
    //After that, we will point i to index j+1 and start moving the pointer using a loop.
    //While moving the pointer i, we will do the following:
    //If a[i] != 0 i.e. a[i] is a non-zero element: We will swap a[i] and a[j]. Now, the current j is pointing to the non-zero element a[i]. So, we will shift the pointer j by 1 so that it can again point to the first zero.
    //Finally, our array will be set in the right manner.

    public static int[] moveZeroes2(int[] arr) {
        int j = -1;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        if(j == -1){
            return arr;
        }

        for(int i = j + 1 ;  i < arr.length ; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        return arr;
    }

}
