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
        int minimalNumberOfJumps = frogJmpCodingTask.returnsTheNumberOfjumpsFromPositionXToY();
        assertThat(minimalNumberOfJumps, is(equalTo(3)));
    }

}