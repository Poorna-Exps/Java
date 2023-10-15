package Sort;

public class FindOddOneFromArr1WithArr2 {

    public static void main(String[] args) {
        String [] arr1 ={"Red","Blue","White"};
        String [] arr2 ={"Red","Blue","Yellow"};

        for(int i=0;i<arr1.length;i++){
            boolean isPresent = false;
            for(int j=0;j< arr2.length;j++){
                if(arr1[i].equals(arr2[j])){
                    isPresent = true;
                    break;
                }
            }
            if(!isPresent) {
                System.out.println(arr1[i] + " is not present in the second array");
            }
        }


    }
}
