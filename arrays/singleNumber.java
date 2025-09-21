package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class singleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(singleNum(arr));
        sc.close();
    }

    //brute force approach
    public static int singleNum(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> it : map.entrySet()){
            if (it.getValue() == 1){
                return it.getKey();
            }
        }
        return -1;
    }

    //optimal approach
    public static int singleNum1(int[] arr){
        int xor = 0;
        for (int i = 0 ; i < arr.length ; i++){
            xor = xor ^ arr[i];
        }
        return xor;
    }
}
