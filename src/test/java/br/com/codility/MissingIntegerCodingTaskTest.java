package br.com.codility;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by rjesus on 08/05/19.
 */
public class MissingIntegerCodingTaskTest {

    @Test
    public void returns1WhenTheArrayContains45632() {
        MissingIntegerCodingTask missingIntegerCodingTask = new MissingIntegerCodingTask(new int[]{4, 5, 6, 3, 2});
        int missingNumber = missingIntegerCodingTask.retrieveTheSmallestPositiveMissingNumber();
        assertThat(missingNumber, is(1));
    }

    @Test
    public void returns6WhenTheArrayContainsNegativeAndZero() {
        MissingIntegerCodingTask missingIntegerCodingTask = new MissingIntegerCodingTask(new int[]{4, 5, 1, 3, 2, 0, -2, -40, -1, 7, 10, -50, 8, -44, 9});
        int missingNumber = missingIntegerCodingTask.retrieveTheSmallestPositiveMissingNumber();
        assertThat(missingNumber, is(6));
    }

    @Test
    public void returns4WhenTheArrayContainsNegativeAndZeroAndRepeatableNumbers() {
        MissingIntegerCodingTask missingIntegerCodingTask = new MissingIntegerCodingTask(new int[]{1, 5, 6, 3, 2, 2, 0, -2, -40, -1, 7, 10, -1, -10, -10 - 50, 8, -44, 9});
        int missingNumber = missingIntegerCodingTask.retrieveTheSmallestPositiveMissingNumber();
        assertThat(missingNumber, is(4));
    }

    @Test
    public void returns6TheNextNaturalNumberWhenTheArrayContainsAllNumbers() {
        MissingIntegerCodingTask missingIntegerCodingTask = new MissingIntegerCodingTask(new int[]{4, 2, 5, 1, 3});
        int missingNumber = missingIntegerCodingTask.retrieveTheSmallestPositiveMissingNumber();
        assertThat(missingNumber, is(6));
    }

    @Test
    public void returns1WhenTheArrayIsMissingMoreThanOneNumberFor4562() {
        MissingIntegerCodingTask missingIntegerCodingTask = new MissingIntegerCodingTask(new int[]{4, 5, 6, 2});
        int missingNumber = missingIntegerCodingTask.retrieveTheSmallestPositiveMissingNumber();
        assertThat(missingNumber, is(1));
    }

    @Test
    public void returns1WhenTheArrayContainsLargeNumbers() {
        MissingIntegerCodingTask missingIntegerCodingTask = new MissingIntegerCodingTask(new int[]{53, 54, 56, 55});
        int missingNumber = missingIntegerCodingTask.retrieveTheSmallestPositiveMissingNumber();
        assertThat(missingNumber, is(1));
    }

    @Test
    public void returns1WhenTheArrayContainsLargeNumbersAndMissingNumberAmongThem() {
        MissingIntegerCodingTask missingIntegerCodingTask = new MissingIntegerCodingTask(new int[]{53, 56, 55});
        int missingNumber = missingIntegerCodingTask.retrieveTheSmallestPositiveMissingNumber();
        assertThat(missingNumber, is(1));
    }

    @Test
    public void returns6WhenTheArrayContainsLargeNumbersAndMissingNumberAmongThem() {
        MissingIntegerCodingTask missingIntegerCodingTask = new MissingIntegerCodingTask(new int[]{53, 56, 55,1,5,2,5,3,-1,5,4});
        int missingNumber = missingIntegerCodingTask.retrieveTheSmallestPositiveMissingNumber();
        assertThat(missingNumber, is(6));
    }
}