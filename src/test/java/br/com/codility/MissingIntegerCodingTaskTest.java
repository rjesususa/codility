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
    public void returns1WhenTheArrayContainsNegativeAndZero() {
        MissingIntegerCodingTask missingIntegerCodingTask = new MissingIntegerCodingTask(new int[]{4, 5, 6, 3, 2, 0, -2, -40, -1, 7, 10, -50, 8, -44, 9});
        int missingNumber = missingIntegerCodingTask.retrieveTheSmallestPositiveMissingNumber();
        assertThat(missingNumber, is(1));
    }
}