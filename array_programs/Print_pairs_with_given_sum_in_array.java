package array_programs;

import java.util.HashMap;

public class Print_pairs_with_given_sum_in_array {

    public static void main(String[] args) {
        int arr[] = { 1, 5, 7, -1, 5,1};
        int sum = 6;
        printPairs(arr,sum);

    }

    static void printPairs(int[] intArr, int sum){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i:intArr){
            int rem = sum - i;
            if(map.containsKey(rem)){
                int count = map.get(rem);
                for(int y=0;y<count;y++){
                    System.out.println("Pair:- ["+rem+","+i+"]"); //rem is first because it is the first element stores in the map and that is the first value
                }
            }
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
    }

}
