package arrays;

import java.util.HashMap;
import java.util.Map;

public class majorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElements(arr));
    }

    //brute force solution
    //simply using loop
    //We will run a loop that will select the elements of the array one by one.
    //Now, for each element, we will run another loop and count its occurrence in the given array.
    //If any element occurs more than the floor of (N/2), we will simply return it.
    public static int majorityElements(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if (count > arr.length / 2){
                return arr[i];
            }
        }
        return -1;
    }

    //better solution
    public static int majorityElement2(int[] arr){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }
        return -1;
    }
}
