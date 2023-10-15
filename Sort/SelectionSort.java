package Sort;

import java.util.Arrays;

public class SelectionSort implements Sorting{

    public SelectionSort(){
        System.out.print("***********Selection sort***********\n");
    }
    public int[] sortAsc(int[] arr) {
        int temp;
        int arrLen = arr.length;
        if (arrLen > 1) {
            for (int i = 0; i < arrLen; i++) {
                for (int j = i + 1; j < arrLen; j++) {
                    if(arr[j]<arr[i]){
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        return arr;
    }

    public int[] sortDesc(int[] arr) {
        int temp;
        int arrLen = arr.length;
        if (arrLen > 1) {
            for (int i = 0; i < arrLen; i++) {
                for (int j = i + 1; j < arrLen; j++) {
                    if(arr[j]>arr[i]){
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        return arr;
    }
}
