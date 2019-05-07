package br.com.codility;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by rjesus on 07/05/19.
 */
public class MaxCountersCodingTaskTest {

    @Test
    public void returnsAnArrayWithTheCalculatedValuesOfEveryCounterAfterAllOperationsWhenNumberOfCountersIs5() throws Exception {
        MaxCountersCodingTask maxCountersCodingTask = new MaxCountersCodingTask(5, new int[]{3, 4, 4, 6, 1, 4, 4});
        int[] calculatedCounters = maxCountersCodingTask.calculateTheValueOfEveryCounterAfterAllOperations();

        assertThat(calculatedCounters, is(equalTo(new int[]{3, 2, 2, 4, 2})));
    }

    @Test
    public void returnsAnArrayWithTheCalculatedValuesOfEveryCounterAfterAllOperationsWhenTheMaxCounterIsInTheEnd() throws Exception {
        MaxCountersCodingTask maxCountersCodingTask = new MaxCountersCodingTask(5, new int[]{3, 4, 4, 1, 4, 4, 6});
        int[] calculatedCounters = maxCountersCodingTask.calculateTheValueOfEveryCounterAfterAllOperations();

        assertThat(calculatedCounters, is(equalTo(new int[]{4, 4, 4, 4, 4})));
    }

    @Test
    public void returnsAnArrayWithTheCalculatedValuesOfEveryCounterAfterAllOperationsWhenTheMaxCounterIsInTheBeginning() throws Exception {
        MaxCountersCodingTask maxCountersCodingTask = new MaxCountersCodingTask(5, new int[]{6, 4, 4, 1, 4, 4, 3});
        int[] calculatedCounters = maxCountersCodingTask.calculateTheValueOfEveryCounterAfterAllOperations();

        assertThat(calculatedCounters, is(equalTo(new int[]{1, 0, 1, 4, 0})));
    }

    @Test
    public void returnsAnArrayWithTheCalculatedValuesOfEveryCounterAfterAllOperationsWhenHasTwoMaxCounter() throws Exception {
        MaxCountersCodingTask maxCountersCodingTask = new MaxCountersCodingTask(5, new int[]{3, 4, 4, 1, 4, 4, 6, 2, 6});
        int[] calculatedCounters = maxCountersCodingTask.calculateTheValueOfEveryCounterAfterAllOperations();

        assertThat(calculatedCounters, is(equalTo(new int[]{5, 5, 5, 5, 5})));
    }

}