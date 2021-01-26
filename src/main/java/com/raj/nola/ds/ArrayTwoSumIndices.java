package com.raj.nola.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTwoSumIndices {

    public static void main(String[] args) {

        int[] intArray = new int[]{1, 2, 7, 4, 3, 6, 9, 8, 9, 10};
        int sumtoFind = 17;

        ArrayTwoSumIndices objArrayTwoSumIndices = new ArrayTwoSumIndices();

        List<int[]> sumArrayList = objArrayTwoSumIndices.sumOfArray(intArray, sumtoFind);

        for (int i = 0; i < sumArrayList.size(); i++) {
            System.out.println(Arrays.toString(sumArrayList.get(i)));
        }

    }


    List<int[]> sumOfArray(int[] intArray, int targetSum) {

        List<int[]> rows = new ArrayList<>();


        for (int i = 0; i < intArray.length; i++) {

            for (int j = i + 1; j < intArray.length; j++) {

                if (intArray[i] + intArray[j] == targetSum) {

                    rows.add(new int[]{i, j});
                }
            }
        }


        return rows;
    }
}
