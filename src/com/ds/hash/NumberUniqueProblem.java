package com.ds.hash;

import java.util.*;

public class NumberUniqueProblem {

    public static void main(String[] args) {
        int[] inputArray = {1, 3,5 ,5, 6, 1, 7,8,9,9,10};

        List<Integer> uniqueNumberList = new NumberUniqueProblem().getUniqueNumbers(inputArray);
        System.out.println(uniqueNumberList);

    }

    private List<Integer> getUniqueNumbers(int[] inputArray) {
        Map<Integer, Integer> numberToFrequencyMap = new HashMap<>();
        List<Integer> uniqueNumberList = new ArrayList<>();
        int currentFrequency = 0;

        for (int i = 0; i < inputArray.length; i++) {
            currentFrequency = numberToFrequencyMap.getOrDefault(inputArray[i], 0);
            numberToFrequencyMap.put(inputArray[i], currentFrequency+1);
        }

        for (int key: numberToFrequencyMap.keySet()) {
            if(numberToFrequencyMap.get(key) == 1) {
                uniqueNumberList.add(key);
            }
        }
        return uniqueNumberList;
    }
}
