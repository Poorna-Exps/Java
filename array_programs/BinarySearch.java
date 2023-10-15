package array_programs;

import java.util.Arrays;

public class BinarySearch {

    //https://www.youtube.com/watch?v=NFhOrxtXXcM
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        String[] arr1 = {"a,v,b"};
        System.out.println(Arrays.toString(arr1));
        int num = 5;
        System.out.println(+num+" is found in :"+binarySearch(arr,num)+" index");
    }


    static int binarySearch(int[] intArr, int num){
        int start = 0;
        int end = intArr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            int midNumInArr = intArr[mid];
            if(midNumInArr == num){
                return mid;
            }
            if(num<midNumInArr){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }

}
