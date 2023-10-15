package array_programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfElementsInArray {

    public static void main(String[] args) {
       int[] arr = {1,2,2,2,3,3};
//       frequency_Of_Elements_In_Sorted_Array(arr);
//        frequency_Of_Elements_Using_Map(arr);
        frequency_Of_Elements_In_Array(arr);

    }

    //https://www.youtube.com/watch?v=oEW3fwIRZtQ&ab_channel=TAPACADEMY
    //This methods works for only sorted arrays
    public static void frequency_Of_Elements_In_Sorted_Array(int[] arr){
        int frequency = 1;
        int i;
        for(i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]){
                frequency = frequency+1;
            } else{
                System.out.println("Element "+arr[i-1]+" has occurred "+frequency+" times");
                frequency = 1;
            }
        }
        System.out.println("Element "+arr[i-1]+" has occurred "+frequency+" times");
    }

    public static void frequency_Of_Elements_In_Array(int[] arr){
        int frequency;
        int[] visitedArr = new int[arr.length];
        int visited = -1;
        for(int i=0;i< arr.length;i++){
            frequency = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    frequency ++;
                    visitedArr[j] = visited;
                }
            }
            if(visitedArr[i]!=visited){
                visitedArr[i] = frequency;
            }
        }
        for(int i=0;i<visitedArr.length;i++){
            if(visitedArr[i]!=-1){
                System.out.println(arr[i]+"="+visitedArr[i]);
            }
        }
    }

    public static void frequency_Of_Elements_Using_Map(int[] arr){
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for (int i:arr){
            if(map.containsKey(i)){
                int count = map.get(i)+1;
                map.put(i,count);
            } else{
                map.put(i,1);
            }
        }
        System.out.println("Element occurrences and the frequencies");
        System.out.println(map);
    }
}
