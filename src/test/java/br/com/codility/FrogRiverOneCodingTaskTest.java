package br.com.codility;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by rjesus on 05/05/19.
 */
public class FrogRiverOneCodingTaskTest {

    @Test
    public void returns6WhenTheArrayContainTheEdgeLocationAtThe6Position() throws Exception {
        FrogRiverOneCodingTask frogRiverOneCodingTask = new FrogRiverOneCodingTask(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4});
        int earliestTime = frogRiverOneCodingTask.getTheEarliestTime();
        assertThat(earliestTime, is(6));
    }

    @Test
    public void returnsNegative1WhenTheArrayDoesntContainTheEdgeLocation() throws Exception {
        FrogRiverOneCodingTask frogRiverOneCodingTask = new FrogRiverOneCodingTask(6, new int[]{1, 3, 1, 4, 2, 3, 5, 4});
        int earliestTime = frogRiverOneCodingTask.getTheEarliestTime();
        assertThat(earliestTime, is(-1));
    }

}