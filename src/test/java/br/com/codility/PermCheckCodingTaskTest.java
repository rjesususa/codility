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

    @Test
    public void returnsTrueWhenTheArrayContainsSequentialNumbersNonOrderedFrom1Until4() throws Exception {
        PermCheckCodingTask permCheckCodingTask = new PermCheckCodingTask(new int[]{4, 1, 2, 3});
        boolean isAPermutation = permCheckCodingTask.isAPermutationArray();
        assertThat(isAPermutation, is(true));
    }

    @Test
    public void returnsTrueWhenTheArrayContainsSequentialNumbersFrom1Until2() throws Exception {
        PermCheckCodingTask permCheckCodingTask = new PermCheckCodingTask(new int[]{1, 2});
        boolean isAPermutation = permCheckCodingTask.isAPermutationArray();
        assertThat(isAPermutation, is(true));
    }

    @Test
    public void returnsTrueWhenTheArrayContainsOnlyOneSequential1() throws Exception {
        PermCheckCodingTask permCheckCodingTask = new PermCheckCodingTask(new int[]{1});
        boolean isAPermutation = permCheckCodingTask.isAPermutationArray();
        assertThat(isAPermutation, is(true));
    }

    @Test
    public void returnsFalseWhenTheArrayContainsOnlyOneSequential7() throws Exception {
        PermCheckCodingTask permCheckCodingTask = new PermCheckCodingTask(new int[]{7});
        boolean isAPermutation = permCheckCodingTask.isAPermutationArray();
        assertThat(isAPermutation, is(false));
    }

    @Test
    public void returnsFalseWhenTheArrayContainsNonSequentialNumbersFrom1Until8() throws Exception {
        PermCheckCodingTask permCheckCodingTask = new PermCheckCodingTask(new int[]{1,2,5,7,8});
        boolean isAPermutation = permCheckCodingTask.isAPermutationArray();
        assertThat(isAPermutation, is(false));
    }

    @Test
    public void returnsFalseWhenTheArrayContainsRepeatableNumbersFrom1Until4() throws Exception {
        PermCheckCodingTask permCheckCodingTask = new PermCheckCodingTask(new int[]{1,4,1});
        boolean isAPermutation = permCheckCodingTask.isAPermutationArray();
        assertThat(isAPermutation, is(false));
    }

    @Test
    public void returnsFalseWhenTheArrayContainsRepeatableNumber1() throws Exception {
        PermCheckCodingTask permCheckCodingTask = new PermCheckCodingTask(new int[]{1,1});
        boolean isAPermutation = permCheckCodingTask.isAPermutationArray();
        assertThat(isAPermutation, is(false));
    }

    @Test
    public void returnsFalseWhenTheArrayContainsRepeatableNumber2() throws Exception {
        PermCheckCodingTask permCheckCodingTask = new PermCheckCodingTask(new int[]{2,2,2});
        boolean isAPermutation = permCheckCodingTask.isAPermutationArray();
        assertThat(isAPermutation, is(false));
    }

    @Test
    public void returnsFalseWhenTheTotalSumIsCorrectButItIsNotAPermutationArray() throws Exception {
        PermCheckCodingTask permCheckCodingTask = new PermCheckCodingTask(new int[]{9, 5, 7, 3, 2, 7, 3, 1, 10, 8});
        boolean isAPermutation = permCheckCodingTask.isAPermutationArray();
        assertThat(isAPermutation, is(false));
    }

}