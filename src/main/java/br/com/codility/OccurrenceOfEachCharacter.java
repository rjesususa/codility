package br.com.codility;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfEachCharacter {

    private String phrase;

    public OccurrenceOfEachCharacter(String characters) {
        this.phrase = characters;
    }

    private int occurrencesOf(Character character) {
        int ocurrency = 0;

        for (Character letter : phrase.toCharArray()) {
            if (letter == character)
                ocurrency++;
        }
        return ocurrency;
    }

    public Map<String, Integer> execute() {
        try {
            Map<String, Integer> occurrencesMap = new HashMap<>();

            for (Character character : phrase.toCharArray()) {
                int occurrences = occurrencesOf(character);
                occurrencesMap.put(character.toString(), occurrences);
            }
            return occurrencesMap;
        } catch (Exception unexpectedException) {
            throw new RuntimeException("Unexpected behavior. Error message: " + unexpectedException.getMessage(), unexpectedException);
        }
    }

    public Map<String, Integer> optimizeExecute() {
        try {
            Map<String, Integer> occurrenceMap = new HashMap<>();
            char[] chars = phrase.toCharArray();

            int sizeOfOccurrencesArray = (chars[0] * chars.length);
            int[] occurrences = new int[sizeOfOccurrencesArray];

            for (Character character : chars) {
                occurrences[character]++;
            }

            for (Character character : chars) {
                occurrenceMap.put(character.toString(), occurrences[character]);
            }

            return occurrenceMap;
        } catch (Exception unexpectedException) {
            throw new RuntimeException("Unexpected behavior. Error message: " + unexpectedException.getMessage(), unexpectedException);
        }
    }
}
