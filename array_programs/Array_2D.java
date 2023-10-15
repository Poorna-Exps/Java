package array_programs;
/*
We've been asked to write software to process monthly vacation requests.

In this office, vacation requests are approved according to the following rules:
* Requests are granted in the order they are requested.
* Each day can only be granted to two people.

Your function will be passed a list of already approved requests, and a new vacation request. For example:

approved_1 = [
  [3, 6, 11, 15, 20, 23, 25, 28, 29],
  [7, 21, 23, 27, 30]
]
requests_1_1 = [9, 13, 17, 23, 25]

In this case, vacation requests from two other employees (one for each row) have already been approved, and a new request for the 9th, 13th, 17th, 23rd, and 25th has been received. We can only approve a request for a day if it has not been granted twice already. Here, we can approve the 9th, 13th, 17th, and 25th, but the 23rd has been granted twice. So, we would return [9, 13, 17, 25], in any order.

The limit to grant the same day to only two people is a recent policy change, so there can be more than two employees granted the same day. However, we would like to honour the days already granted, but to keep the limit on newer requests. For example,

approved_4 = [
  [1, 3, 4, 5],
  [2, 3, 4, 6],
  [3, 4, 5],
]
requests_4_1 = [1, 2, 3, 4, 5, 6]

would return [1, 2, 6], as they are the only days that would be granted to maximum of two days.

Write a function that takes in a list of already approved requests and a new vacation request, and return the days we can approve from the new request.

All inputs:

approved_1 = [
  [3, 6, 11, 15, 20, 23, 25, 28, 29],
  [7, 21, 23, 27, 30]
]
requests_1_1 = [9, 13, 17, 23, 25]
approved_2 = [
  [1, 2, 5, 20, 21, 25, 30],
  [1, 13, 15, 23, 24],
  [3, 6, 11, 13, 17, 20],
  [2, 14, 15, 16, 18, 26, 30],
  [4, 10, 17, 29]
]
requests_2_1 = [5, 8, 11, 13, 15, 20, 23]
requests_2_2 = [1, 2, 13, 15, 17, 20, 30]
requests_2_3 = [3, 4, 5, 6]
approved_3 = [
  [12, 19, 18, 15, 1],
  [22, 18, 9],
  [17, 19, 9, 2, 21, 3, 6],
  [30, 23, 14]
]
requests_3_1 = [16, 17, 30, 19, 9, 14, 18]
approved_4 = [
  [1, 3, 4, 5],
  [2, 3, 4, 6],
  [3, 4, 5]
]
requests_4_1 = [1, 2, 3, 4, 5, 6]

All test cases (results can be in any order):

approved_requests(approved_1, requests_1_1) => [9, 13, 17, 25]
approved_requests(approved_2, requests_2_1) => [5, 8, 11, 23]
approved_requests(approved_2, requests_2_2) => []
approved_requests(approved_2, requests_2_3) => [3, 4, 5, 6]
approved_requests(approved_3, requests_3_1) => [14, 16, 17, 30]
approved_requests(approved_4, requests_4_1) => [1, 2, 6]

Complexity variables:
N = The number of people in approved
*/

import java.util.*;

public class Array_2D {
    public static void main(String[] argv) {

        int[][] approved_1 = {
                {3, 6, 11, 15, 20, 23, 25, 28, 29},
                {7, 21, 23, 27, 30}
        };
        int[] requests_1_1 = {9, 13, 17, 23, 25};
        int[][] approved_2 = {
                {1, 2, 5, 20, 21, 25, 30},
                {1, 13, 15, 23, 24},
                {3, 6, 11, 13, 17, 20},
                {2, 14, 15, 16, 18, 26, 30},
                {4, 10, 17, 29}
        };
        int[] requests_2_1 = {5, 8, 11, 13, 15, 20, 23};
        int[] requests_2_2 = {1, 2, 13, 15, 17, 20, 30};
        int[] requests_2_3 = {3, 4, 5, 6};
        int[][] approved_3 = {
                {12, 19, 18, 15, 1},
                {22, 18, 9},
                {17, 19, 9, 2, 21, 3, 6},
                {30, 23, 14}
        };
        int[] requests_3_1 = {16, 17, 30, 19, 9, 14, 18};
        int[][] approved_4 = {
                {1, 3, 4, 5},
                {2, 3, 4, 6},
                {3, 4, 5}
        };
        int[] requests_4_1 = {1, 2, 3, 4, 5, 6};

        System.out.println(approved_requests(requests_4_1, approved_4));

        // System.out.println(findCountOfELementInTwoDArray(approved_1));

    }

    public static List<Integer> approved_requests(int[] requestsDates, int[][] approvedDates) {
        List<Integer> list = new ArrayList<>();
        int value;
        int mapValue;
        Map<Integer, Integer> map = findCountOfELementInTwoDArray(approvedDates);
        for (int requestsDate : requestsDates) {
            value = requestsDate;
            if (!map.containsKey(value)) {
                list.add(value);
            }
            for (Integer num : map.keySet()) {
                mapValue = map.get(num);
                if (value == num) {
                    if (mapValue < 2) {
                        list.add(num);
                    }
                }
            }
        }

        return list;

    }

    public static Map<Integer, Integer> findCountOfELementInTwoDArray(int[][] approvedDates) {
        Map<Integer, Integer> map = new HashMap<>();
        int value;
        int mapValue;
        for (int[] approvedDate : approvedDates) {
            for (int j = 0; j < approvedDate.length; j++) {
                value = approvedDate[j];
                //System.out.println("Value of array:"+i+""+j+":"+value);
                if (map.containsKey(value)) {
                    mapValue = map.get(value);
                    map.put(value, mapValue + 1);
                } else {
                    map.put(value, 1);
                }
            }
        }

        return map;

    }


}

