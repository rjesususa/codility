package br.com.codility;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by rjesus on 09/05/19.
 */
public class PassingCarsCodingTaskTest {
    @Test
    public void returns6WhenCarsHas6PossibleCombinations() throws Exception {
        PassingCarsCodingTask passingCarsCodingTask = new PassingCarsCodingTask(new int[]{0, 1, 0, 1, 0, 1});
        int numberOfPassingCars = passingCarsCodingTask.countPassingCars();
        assertThat(numberOfPassingCars, is(6));
    }

    @Test
    public void returns5WhenCarsHas5PossibleCombinations() throws Exception {
        PassingCarsCodingTask passingCarsCodingTask = new PassingCarsCodingTask(new int[]{0, 1, 0, 1, 1});
        int numberOfPassingCars = passingCarsCodingTask.countPassingCars();
        assertThat(numberOfPassingCars, is(5));
    }

}