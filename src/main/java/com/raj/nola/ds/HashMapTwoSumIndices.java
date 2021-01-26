package com.raj.nola.ds;

import java.util.*;

public class HashMapTwoSumIndices {

    public static void main(String[] args) {

        int[] intArray = new int[]{1, 2, 7, 4, 3, 6, 9, 8, 9, 10};
        int sumtoFind = 17;

        HashMapTwoSumIndices objHMTwoSumIndices = new HashMapTwoSumIndices();

        List<int[]> sumArrayList = objHMTwoSumIndices.sumOfArray(intArray, sumtoFind);

        for (int i = 0; i < sumArrayList.size(); i++) {
            System.out.println(Arrays.toString(sumArrayList.get(i)));
        }

    }


    List<int[]> sumOfArray(int[] intArray, int targetSum) {

        Map<Integer, Integer> intMap = new HashMap<>();
        List<int[]> rows = new ArrayList<>();


        for (int i = 0; i < intArray.length; i++) {
            int complement = targetSum - intArray[i];

            if (intMap.containsKey(complement)) {
                rows.add(new int[]{i, intMap.get(complement)});
            } else {
                intMap.put(intArray[i], i);
            }
        }

        return rows;

    }
}

