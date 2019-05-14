package br.com.codility;

/**
 * Created by rjesus on 14/05/19.
 */
public class MinAvgTwoSliceCodingTask {
    int[] integers;

    public MinAvgTwoSliceCodingTask(int[] integers) {
        this.integers = integers;
    }

    public int returnsTheSmallestStartingPositionOfSuchASlice() {
        int smallestStartingPosition = 0;
        double minimalAVG = (double) Integer.MAX_VALUE;

        for (int i = 0; i < integers.length; i++) {
            int startPosition = i;
            for (int ii = i + 1; ii < integers.length; ii++) {
                int endPosition = ii;

                int sum = 0;
                int qtdElements = 0;
                for (int iii = startPosition; iii <= endPosition; iii++) {
                    qtdElements++;
                    sum += integers[iii];
                }
                double avg = (double) sum / qtdElements;
                if (avg < minimalAVG) {
                    minimalAVG = avg;
                    smallestStartingPosition = startPosition;
                }
                if (avg == minimalAVG && smallestStartingPosition > startPosition) {
                    smallestStartingPosition = startPosition;
                }
            }
        }

        return smallestStartingPosition;
    }
}
