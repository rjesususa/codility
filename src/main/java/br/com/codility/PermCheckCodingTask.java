package br.com.codility;

/**
 * Created by rjesus on 01/05/19.
 */
public class PermCheckCodingTask {

    private int[] permutationArray;

    public PermCheckCodingTask(int[] permutationArray) {
        this.permutationArray = permutationArray;
    }

    public Boolean isAPermutationArray() {
        int calcSequential = 0;
        int calcSequentialComparator = 0;

        for (int seq = 1; seq <= permutationArray.length; seq++) {
            int number = permutationArray[seq - 1];
            calcSequentialComparator += (seq * seq);
            calcSequential += (number * number);
        }

        boolean isAPermutationArray = (calcSequential == calcSequentialComparator);
        return isAPermutationArray;
    }

}