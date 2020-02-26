package main.java.com.learning.day4_collections.q7;
//7) Print the elements of an array in the decreasing frequency if 2 numbers have same frequency then print the one which came first.

import java.util.Arrays;
import java.util.Collections;

public class Driver {

    public static void main(String[] args) {
        int arr[] = new int[]{1,1,2,2,3,3,3};
        Arrays.sort(arr);

        int table[][] = new int[arr.length][1];

        int end = 0;
        int arrayIndex = 0;

        for(int start = 0; start < arr.length; start++)
        {
            end = start;

            while(end < arr.length && arr[end++] == arr[start])
            {

            }

            table[arrayIndex++][1] = (end - start);
        }

        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(table[i][1]);
        }

    }

}
