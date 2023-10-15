package Sort;

import java.util.Arrays;

public class Array{

    public static int[] arr = {100,14,46,47,94,94,52,86,94};
    public static void main(String args[]){
        Arrays.sort(arr);
        int length = arr.length;
        int secondHigh = arr[length-2];
        System.out.println("Second highest number:- "+secondHigh);
    }

}
