package br.com.codility;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by rjesus on 14/05/19.
 */
public class MinAvgTwoSliceCodingTaskTest {

    @Test
    public void returns1AsTheSmallestStartingPositionWhenTheMinimalAverageOfTheSliceIs2() throws Exception {
        MinAvgTwoSliceCodingTask minAvgTwoSliceCodingTask = new MinAvgTwoSliceCodingTask(new int[]{4, 2, 2, 5, 1, 5, 8});
        final int smallestStartingPositionOfSuchASlice = minAvgTwoSliceCodingTask.returnsTheSmallestStartingPositionOfSuchASlice();
        assertThat(smallestStartingPositionOfSuchASlice, is(1));
    }

    @Test
    public void returns2AsTheSmallestStartingPositionWhenTheMinimalAverageOfTheSliceIs2InOnlyNegativeNumbers() throws Exception {
        MinAvgTwoSliceCodingTask minAvgTwoSliceCodingTask = new MinAvgTwoSliceCodingTask(new int[]{-3, -5, -8, -4, -10});
        final int smallestStartingPositionOfSuchASlice = minAvgTwoSliceCodingTask.returnsTheSmallestStartingPositionOfSuchASlice();
        assertThat(smallestStartingPositionOfSuchASlice, is(2));
    }

    @Test
    public void returns3AsTheSmallestStartingPositionWhenTheMinimalAverageOfTheSliceIs3And4() throws Exception {
        MinAvgTwoSliceCodingTask minAvgTwoSliceCodingTask = new MinAvgTwoSliceCodingTask(new int[]{4, 2, 5, 1, 3});
        final int smallestStartingPositionOfSuchASlice = minAvgTwoSliceCodingTask.returnsTheSmallestStartingPositionOfSuchASlice();
        assertThat(smallestStartingPositionOfSuchASlice, is(3));
    }

    @Test
    public void returns5AsTheSmallestStartingPositionWhenThwArrayContainsRepeatableNegativeNumbers() throws Exception {
        MinAvgTwoSliceCodingTask minAvgTwoSliceCodingTask = new MinAvgTwoSliceCodingTask(new int[]{10, 10, -1, 2, 4, -1, 2, -1});
        final int smallestStartingPositionOfSuchASlice = minAvgTwoSliceCodingTask.returnsTheSmallestStartingPositionOfSuchASlice();
        assertThat(smallestStartingPositionOfSuchASlice, is(5));
    }

    @Test
    public void returns1AsTheSmallestStartingPositionWhenThwArrayContainsRepeatableNegativeNumbers() throws Exception {
        MinAvgTwoSliceCodingTask minAvgTwoSliceCodingTask = new MinAvgTwoSliceCodingTask(new int[]{10000, -10000, -10000, 10000});
        final int smallestStartingPositionOfSuchASlice = minAvgTwoSliceCodingTask.returnsTheSmallestStartingPositionOfSuchASlice();
        assertThat(smallestStartingPositionOfSuchASlice, is(1));
    }

}