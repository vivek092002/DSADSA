//https://takeuforward.org/data-structure/remove-duplicates-in-place-from-sorted-array/
package arrays;

import java.util.HashSet;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        int n = arr.length;
        System.out.println(remove2(arr,n));
    }

    //brute force approach
    //As hashset do not include duplicates then add all the ele of the arr into tha hashset
    // and the ele of the hashset back into the array
    //Time complexity: O(n*log(n))+O(n)
    //Space Complexity: O(n)
    public static int remove(int[] arr, int n){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        int k = set.size();
        int j = 0;
        for (int x : set){
            arr[j++] = x;
        }
        return k;
    }

    //optimised solution
    //Intuition: We can think of using two pointers ‘i’ and ‘j’, we move ‘j’ till we don't get a number arr[j] which is different from arr[i]. As we got a unique number we will increase the i pointer and update its value by arr[j].
    //Approach:
    //Take a variable i as 0;
    //Use a for loop by using a variable ‘j’ from 1 to length of the array.
    //If arr[j] != arr[i], increase ‘i’ and update arr[i] == arr[j].
    // After completion of the loop return i+1, i.e size of the array of unique elements.
    public static int remove2(int[] arr, int n){
        int i = 0;
        for (int j = 1 ; j < arr.length; j++){
            if (arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}
