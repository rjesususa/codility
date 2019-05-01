package br.com.codility;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by rjesus on 01/05/19.
 */
public class PermCheckCodingTaskTest {

    @Test
    public void returnsTrueWhenTheArrayContainsSequentialNumbersFrom1Until7() throws Exception {
        PermCheckCodingTask permCheckCodingTask = new PermCheckCodingTask(new int[]{1, 2, 3, 4, 5, 6, 7});
        boolean isAPermutation = permCheckCodingTask.isAPermutationArray();
        assertThat(isAPermutation, is(true));
    }

}