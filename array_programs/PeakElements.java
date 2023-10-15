package array_programs;

import java.util.ArrayList;
import java.util.List;

public class PeakElements {

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 3};

        System.out.println(findPeakElementsIndex(arr));
    }

    public static int findPeakElementsIndex(int[] arr) {
        int arrSize = arr.length;
        if (arrSize == 1 || arr[0] > arr[1]) {
            return 0;
        }
        if (arr[arrSize - 1] > arr[arrSize - 2]) {
            return arrSize - 1;
        }
        int low = 1, high = arrSize - 2;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] > arr[mid - 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
