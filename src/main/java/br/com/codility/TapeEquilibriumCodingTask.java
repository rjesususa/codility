package br.com.codility;

public class TapeEquilibriumCodingTask {

    private int[] numbersOnATape;

    public TapeEquilibriumCodingTask(int[] numbersOnATape) {
        this.numbersOnATape = numbersOnATape;
    }

    public int findsTheMinimalDifference() {
        int minimalDifference = Integer.MAX_VALUE;
        int sumOfFirstPart = 0;
        int sumOfSecondPart = sumOfValuesInsideOfTheTap();

        for (int count = 0; count < numbersOnATape.length - 1; count++) {
            int currentNumber = numbersOnATape[count];
            int nextNumber = numbersOnATape[count + 1];
            sumOfFirstPart += currentNumber;

            int difference = Math.abs(sumOfFirstPart - sumOfSecondPart);
            if (minimalDifference > difference) {
                minimalDifference = difference;
            }
            sumOfSecondPart -= nextNumber;
        }

        return minimalDifference;
    }

    private int sumOfValuesInsideOfTheTap() {

        int sumOfValuesInsideOfTheTap = 0;

        for (int count = 1; count < numbersOnATape.length; count++) {
            sumOfValuesInsideOfTheTap += numbersOnATape[count];
        }

        return sumOfValuesInsideOfTheTap;
    }
}