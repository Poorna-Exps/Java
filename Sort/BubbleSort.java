package Sort;
public class BubbleSort implements Sorting {
    public BubbleSort(){
        System.out.print("***********Bubble sort***********\n");
    }
    @Override
    public int[] sortDesc(int[] arr) {
        int arrLen = arr.length;
        int temp;
        for (int i = 0; i < arrLen; i++) {
            for (int j = 0; j < arrLen - i - 1; j++) {
                if (arr[j + 1] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    @Override
    public int[] sortAsc(int[] arr) {
        int arrLen = arr.length;
        int temp;
        for (int i = 0; i < arrLen; i++) {
            for (int j = 0; j < arrLen - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
