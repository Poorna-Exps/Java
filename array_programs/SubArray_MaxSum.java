package array_programs;

public class SubArray_MaxSum {

    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int subArrSize = 1;
        System.out.println(maxSumOfSubArray(arr,subArrSize));
    }

    //https://www.youtube.com/watch?v=jhW7VwP2Djw&ab_channel=TAPACADEMY
    public static int maxSumOfSubArray(int[] arr, int k){
        int wSum=0,maxSum=-1;
        for(int i=0;i<k;i++){
            wSum = wSum+arr[i];
        }
        for (int i=k;i<arr.length;i++){
            wSum = wSum-arr[i-k]+arr[i];
            maxSum = Math.max(wSum,maxSum);
        }
        return maxSum;
    }
}
