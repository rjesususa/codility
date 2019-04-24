package br.com.codility;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class PermMissingElemCodingTaskTest {

    private PermMissingElemCodingTask permMissingElemCodingTask;

    @Test
    public void shouldReturn4WhenTheInputIsAndArrayWith2And3And1And5() throws Exception {

        permMissingElemCodingTask = new PermMissingElemCodingTask(new int[]{2, 3, 1, 5});
        int missingElement = permMissingElemCodingTask.findTheMissingElement();
        assertThat(4, is(equalTo(missingElement)));
    }

    @Test
    public void shouldReturn10WhenTheInputIsAndArrayFrom1Until17() throws Exception {

        permMissingElemCodingTask = new PermMissingElemCodingTask(new int[]{1, 2, 3, 5, 4, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17});
        int missingElement = permMissingElemCodingTask.findTheMissingElement();
        assertThat(10, is(equalTo(missingElement)));
    }

}