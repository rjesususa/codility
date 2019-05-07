package br.com.codility;

/**
 * Created by rjesus on 07/05/19.
 */
public class MaxCountersCodingTask {

    int sizeOfArrayOfCounters;
    int[] consecutiveOperations;

    public MaxCountersCodingTask(int sizeOfArrayOfCounters, int[] consecutiveOperations) {
        this.sizeOfArrayOfCounters = sizeOfArrayOfCounters;
        this.consecutiveOperations = consecutiveOperations;
    }

    public int[] calculateTheValueOfEveryCounterAfterAllOperations() {

        int[] counters = new int[sizeOfArrayOfCounters];
        int maxCounter = 0;
        int newIncrement = 0;

        for (int counter : consecutiveOperations) {
            int position = counter - 1;
            if (counter > sizeOfArrayOfCounters) {
                newIncrement = maxCounter;

            } else {

                if (counters[position] < newIncrement) {
                    counters[position] = newIncrement;
                }

                counters[position]++;

                if (counters[position] > maxCounter) {
                    maxCounter = counters[position];
                }
            }
        }

        for (int i = 0; i < counters.length; i++) {
            if (counters[i] < newIncrement) {
                counters[i] = newIncrement;
            }
        }

        return counters;
    }

}