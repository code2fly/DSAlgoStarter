package com.interview;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//amazon interview problem
public class KeyPhrasesProblem {

    public static void main(String[] args) {

        String[] dataFromFile = getDataFromFile("resources/keyphrase_sample_data.txt");

        Map<String, Integer> wordToFrequencyMap = new HashMap<>();

        // list of conjunction
        List<String> wordsToExclude = new ArrayList<>();
        wordsToExclude.add("the");
        wordsToExclude.add("a");
        wordsToExclude.add("by");
        wordsToExclude.add("to");
        wordsToExclude.add("and");
        wordsToExclude.add("of");
        wordsToExclude.add(",");
        wordsToExclude.add(".");
        wordsToExclude.add("is");

        for (String word : dataFromFile) {
            if (wordsToExclude.contains(word.toLowerCase()) || Pattern.matches("\\s", word)) {
                continue;
            }
            wordToFrequencyMap.put(word, wordToFrequencyMap.getOrDefault(word, 0)+1);
        }

        // display words with frequency
        display(wordToFrequencyMap);



    }

    private static void display(Map<String, Integer> wordToFrequencyMap) {
        for (String key :
                wordToFrequencyMap.keySet()) {
            System.out.println(String.format(" { %s : %s }", key, wordToFrequencyMap.get(key)));
        }
    }

    private static String[] getDataFromFile(String fileName) {
        String[] readAllLines = {};
        try {
            readAllLines = new String(Files.readAllBytes(Paths.get(fileName))).split("\\s|\\.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return readAllLines;
    }
}
