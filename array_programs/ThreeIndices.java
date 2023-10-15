package array_programs;

public class ThreeIndices {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6,8};
        int i = 0, j = 1, k = 2;
        while (k < arr.length) {
           if(arr[i]<arr[j] && arr[j]<arr[k]){
               System.out.println("Three indices are present in "+i+","+j+","+k+" indices and values are "+arr[i]+"<"+arr[j]+"<"+arr[k]);
           } else{
               System.out.println("Not found");
           }
           i++;j++;k++;
        }
    }
}
