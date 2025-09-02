//https://takeuforward.org/data-structure/remove-duplicates-in-place-from-sorted-array/
package arrays;

import java.util.HashSet;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        int n = arr.length;
        System.out.println(remove(arr,n));
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
}
