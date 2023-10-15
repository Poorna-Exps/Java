package array_programs;

import java.util.Arrays;

public class MinMaxOfArr {

    public static void main(String[] args) {
      long a[] = {3,2,1,56,1000,167};
      //First approach
      getMinMaxThroughSort(a);
      //Second approach
        System.out.print("Min: "+getMinThroughIteration(a)+" and Max: "+getMaxThroughIteration(a));
    }

    //Time complexity:O(nlog(n))
    //Space complexity:O(n)
    static void getMinMaxThroughSort(long a[])
    {
        Arrays.sort(a);
        System.out.print("Min: "+a[0]+" and Max: "+a[a.length-1]);
    }

    //Time complexity:O(n)
    //Space complexity:O(1)
    static long getMinThroughIteration(long a[]){
        long res = a[0];
        for (long a1:a){
            res = Math.min(res,a1);
        }
        return res;
    }

    //Time complexity:O(n)
    //Space complexity:O(1)
    static long getMaxThroughIteration(long a[]){
        long res = a[0];
        for (long a1:a){
            res = Math.max(res,a1);
        }
        return res;
    }
}

