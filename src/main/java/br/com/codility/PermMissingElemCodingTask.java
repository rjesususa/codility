package br.com.codility;

public class PermMissingElemCodingTask {

    /*
    *1,2,3,4,5 ...
    */
    private int[] distinctNumbers;

    public PermMissingElemCodingTask(int[] distinctNumbers) {
        this.distinctNumbers = distinctNumbers;
    }

    public int findTheMissingElement() {

        double howManyNumbersHave = distinctNumbers.length + 1;

        /**
         * The nth partial sum is given by a simple formula: (n * (n+1)) / 2
         * source: https://en.wikipedia.org/wiki/Triangular_number
         */
        double totalSum = ((howManyNumbersHave * (howManyNumbersHave + 1)) / 2);


        int missingElement = getMissingElement(totalSum, distinctNumbers);

        return missingElement;
    }

    private int getMissingElement(double sum, int[] array) {
        for (int a : array) {
            sum -= a;
        }

        double missingElement = sum == 0 ? array.length + 1 : sum;

        return (int) missingElement;
    }
}