package arrays;

import java.util.*;

public class unionOfTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5};

        System.out.println(union(arr, arr2));

        sc.close();
    }

    //brute force method
    //we can also use set for storing the unique
    public static ArrayList<Integer> union(int[] arr, int[] arr2){
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        int m = arr2.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) +1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (int i = 0 ; i < m ; i++){
            if (map.containsKey(arr2[i])) {
                map.put(arr2[i], map.get(arr2[i]) + 1);
            } else {
                map.put(arr2[i], 1);
            }
        }

        ArrayList<Integer> li = new ArrayList<>();
        for(int it : map.keySet()){
            li.add(it);
        }

        return li;
    }

    //optimised approach

}
