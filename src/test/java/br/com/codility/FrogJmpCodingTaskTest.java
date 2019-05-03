package br.com.codility;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by rjesus on 02/05/19.
 */
public class FrogJmpCodingTaskTest {

    @Test
    public void shouldReturn3WhenPositionXIs10AndYIs85WithFixedDistanceOf30() throws Exception {
        FrogJmpCodingTask frogJmpCodingTask = new FrogJmpCodingTask(10, 85, 30);
        int minimalNumberOfJumps = frogJmpCodingTask.returnsTheNumberOfJumpsFromPositionXToY();
        assertThat(minimalNumberOfJumps, is(equalTo(3)));
    }

    @Test
    public void shouldReturn2WhenPositionXIs1AndYIs5WithFixedDistanceOf2() throws Exception {
        FrogJmpCodingTask frogJmpCodingTask = new FrogJmpCodingTask(1, 5, 2);
        int minimalNumberOfJumps = frogJmpCodingTask.returnsTheNumberOfJumpsFromPositionXToY();
        assertThat(minimalNumberOfJumps, is(equalTo(2)));
    }

    @Test
    public void shouldReturn0WhenPositionXIs1AndYIs1WithFixedDistanceOf3() throws Exception {
        FrogJmpCodingTask frogJmpCodingTask = new FrogJmpCodingTask(1, 1, 3);
        int minimalNumberOfJumps = frogJmpCodingTask.returnsTheNumberOfJumpsFromPositionXToY();
        assertThat(minimalNumberOfJumps, is(equalTo(0)));
    }

    @Test
    public void shouldReturn33WhenPositionXIs5AndYIs105WithFixedDistanceOf3() throws Exception {
        FrogJmpCodingTask frogJmpCodingTask = new FrogJmpCodingTask(5, 105, 3);
        int minimalNumberOfJumps = frogJmpCodingTask.returnsTheNumberOfJumpsFromPositionXToY();
        assertThat(minimalNumberOfJumps, is(equalTo(34)));
    }

    @Test
    public void shouldReturn38WhenPositionXIs50AndYIs199WithFixedDistanceOf4() throws Exception {
        FrogJmpCodingTask frogJmpCodingTask = new FrogJmpCodingTask(50, 199, 4);
        int minimalNumberOfJumps = frogJmpCodingTask.returnsTheNumberOfJumpsFromPositionXToY();
        assertThat(minimalNumberOfJumps, is(equalTo(38)));
    }

    @Test
    public void shouldReturn1WhenPositionXIs50AndYIs199WithFixedDistanceOf50000() throws Exception {
        FrogJmpCodingTask frogJmpCodingTask = new FrogJmpCodingTask(50, 199, 50000);
        int minimalNumberOfJumps = frogJmpCodingTask.returnsTheNumberOfJumpsFromPositionXToY();
        assertThat(minimalNumberOfJumps, is(equalTo(1)));
    }

    @Test
    public void shouldReturn1WhenItsABigJump() throws Exception {
        FrogJmpCodingTask frogJmpCodingTask = new FrogJmpCodingTask(999999999, 1000000000, 1000000000);
        int minimalNumberOfJumps = frogJmpCodingTask.returnsTheNumberOfJumpsFromPositionXToY();
        assertThat(minimalNumberOfJumps, is(equalTo(1)));
    }

}