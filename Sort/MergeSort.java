package Sort;

import java.util.Arrays;
import java.util.List;

//https://www.youtube.com/watch?v=bOk35XmHPKs&t=1083s
public class MergeSort implements Sorting{

    public MergeSort(){
        System.out.println("***********Merge sort***********");
    }
    @Override
    public int[] sortDesc(int[] arr) {
        mergeSortDesc(arr);
        return arr;
    }

    @Override
    public int[] sortAsc(int[] arr) {
        mergeSortAsc(arr);
        return arr;
    }

    private void mergeSortAsc(int[] arr){
        int arrSize = arr.length;
        if(arrSize<2){
            return ;
        }
        int mid = arrSize/2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[arrSize-mid];
        //Create the left array
        System.arraycopy(arr, 0, leftArr, 0, mid);
//        for(int i=0;i<mid;i++){
//            leftArr[i] = arr[i];
//        }
//        System.out.println("Left Arr- "+Arrays.toString(leftArr));
        //Create the right array
        System.arraycopy(arr, mid, rightArr, 0, arrSize-mid);
//        for (int i=mid;i<arrSize;i++){
//            rightArr[i-mid] = arr[i];
//        }
//        System.out.println("Right Arr- "+Arrays.toString(rightArr));
        mergeSortAsc(leftArr);
        mergeSortAsc(rightArr);
        mergeSortAsc(arr,leftArr,rightArr);
    }
    private void mergeSortAsc(int[] arr, int[] leftArr, int[] rightArr){
        int i=0,j=0,k=0;
        while(i<leftArr.length && j<rightArr.length){
            if(leftArr[i]<=rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
//            System.out.println("Combined Arr-"+Arrays.toString(arr));
        }
        while (i<leftArr.length){
            arr[k] = leftArr[i];
            i++;
            k++;
        }
//        System.out.println("Remaining values to the Arr from left Arr- "+Arrays.toString(arr));
        while (j<rightArr.length){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
//        System.out.println("Remaining values to the Arr from right Arr-"+Arrays.toString(arr));
    }

    private void mergeSortDesc(int[] arr){
        int arrSize = arr.length;
        if(arrSize<2){
            return ;
        }
        int mid = arrSize/2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[arrSize-mid];
        //Create the left array
        System.arraycopy(arr, 0, leftArr, 0, mid);
//        for(int i=0;i<mid;i++){
//            leftArr[i] = arr[i];
//        }
//        System.out.println("Left Arr- "+Arrays.toString(leftArr));
        //Create the right array
        System.arraycopy(arr, mid, rightArr, 0, arrSize-mid);
//        for (int i=mid;i<arrSize;i++){
//            rightArr[i-mid] = arr[i];
//        }
//        System.out.println("Right Arr- "+Arrays.toString(rightArr));
        mergeSortDesc(leftArr);
        mergeSortDesc(rightArr);
        mergeSortDesc(arr,leftArr,rightArr);
    }
    private void mergeSortDesc(int[] arr, int[] leftArr, int[] rightArr){
        int i=0,j=0,k=0;
        while(i<leftArr.length && j<rightArr.length){
            if(leftArr[i]>=rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
//            System.out.println("Combined Arr-"+Arrays.toString(arr));
        }
        while (i<leftArr.length){
            arr[k] = leftArr[i];
            i++;
            k++;
        }
//        System.out.println("Remaining values to the Arr from left Arr- "+Arrays.toString(arr));
        while (j<rightArr.length){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
//        System.out.println("Remaining values to the Arr from right Arr-"+Arrays.toString(arr));
    }

}
