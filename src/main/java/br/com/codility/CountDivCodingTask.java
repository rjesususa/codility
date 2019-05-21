package br.com.codility;

/**
 * Created by rjesus on 20/05/19.
 */
public class CountDivCodingTask {
    int startingFrom;
    int endingAt;
    int divisibleBy;

    public CountDivCodingTask(int startingFrom, int endingAt, int divisibleBy) {
        this.startingFrom = startingFrom;
        this.endingAt = endingAt;
        this.divisibleBy = divisibleBy;
    }

    public int countDivBy() {

        double adjustment = startingFrom % divisibleBy == 0 || endingAt % divisibleBy == 0 ?
                1 : ((double) startingFrom < divisibleBy) ? (double) startingFrom / divisibleBy : 0;

        return (int) (((double) endingAt - startingFrom) / (divisibleBy) + adjustment);
    }
}