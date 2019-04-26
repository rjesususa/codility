package br.com.codility;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by rjesus on 26/04/19.
 */
public class TapeEquilibriumCodingTaskTest {

    @Test
    public void returnsTheMinimalDifferenceThatCanBeAchievedWhenArraysContainsFiveNumbers() throws Exception {
        TapeEquilibriumCodingTask tapeEquilibriumCodingTask = new TapeEquilibriumCodingTask(new int[]{3, 1, 2, 4, 3});
        int minimalDifference = tapeEquilibriumCodingTask.findsTheMinimalDifference();

        assertThat(1, is(equalTo(minimalDifference)));
    }

    @Test
    public void returnsTheMinimalDifferenceThatCanBeAchievedWhenArraysContainsTwoNumber() throws Exception {
        TapeEquilibriumCodingTask tapeEquilibriumCodingTask = new TapeEquilibriumCodingTask(new int[]{3, 1});
        int minimalDifference = tapeEquilibriumCodingTask.findsTheMinimalDifference();

        assertThat(2, is(equalTo(minimalDifference)));
    }

}