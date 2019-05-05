package br.com.codility;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by rjesus on 05/05/19.
 */
public class BinaryGapCodingTaskTest {


    @Test
    public void returns0WhenTheNumberDoesntHaveBinaryGap() {
        BinaryGapCodingTask binaryGapCodingTask = new BinaryGapCodingTask(32);
        Integer binaryGap = binaryGapCodingTask.getTheLongestBinaryGap();
        assertThat(binaryGap, is(0));
    }

    @Test
    public void returns5WhenTheNumberIs1041() {
        BinaryGapCodingTask binaryGapCodingTask = new BinaryGapCodingTask(1041);
        Integer binaryGap = binaryGapCodingTask.getTheLongestBinaryGap();
        assertThat(binaryGap, is(5));
    }
}