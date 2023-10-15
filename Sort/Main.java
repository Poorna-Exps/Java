package Sort;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Sorting sort;
        int[] arr = {1, 6, 6, 3, 1};
        sort = new SelectionSort();
        System.out.println("Asc:- " + Arrays.toString(sort.sortAsc(arr)));
        System.out.println("Desc:- " + Arrays.toString(sort.sortDesc(arr)));
         //**********************************************************************
        sort = new BubbleSort();
        System.out.println("Asc:- " + Arrays.toString(sort.sortAsc(arr)));
        System.out.println("Desc:- " + Arrays.toString(sort.sortDesc(arr)));
         //**********************************************************************
        sort = new MergeSort();
        System.out.println("Asc:- " + Arrays.toString(sort.sortAsc(arr)));
        System.out.println("Desc:- " + Arrays.toString(sort.sortDesc(arr)));

    }

        // function to check if brackets are balanced

    }


