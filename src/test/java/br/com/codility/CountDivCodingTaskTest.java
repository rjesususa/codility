package br.com.codility;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CountDivCodingTaskTest {

    @Test
    public void returns1WhenStartingCountIs1AndEndIs1AndDivByIs1() throws Exception {
        CountDivCodingTask countDivCodingTask = new CountDivCodingTask(1,1,1);
        int divisibleNumbersBy1 = countDivCodingTask.countDivBy();

        assertThat(divisibleNumbersBy1, is(1));
    }

    @Test
    public void returns1WhenStartingCountIs10AndEndIs10AndDivByIs5() throws Exception {
        CountDivCodingTask countDivCodingTask = new CountDivCodingTask(10,10,5);
        int divisibleNumbersBy1 = countDivCodingTask.countDivBy();

        assertThat(divisibleNumbersBy1, is(1));
    }

    @Test
    public void returns0WhenStartingCountIs10AndEndIs10AndDivByIs20() throws Exception {
        CountDivCodingTask countDivCodingTask = new CountDivCodingTask(10,10,20);
        int divisibleNumbersBy1 = countDivCodingTask.countDivBy();

        assertThat(divisibleNumbersBy1, is(0));
    }

    @Test
    public void returns0WhenStartingCountIs10AndEndIs10AndDivByIs7() throws Exception {
        CountDivCodingTask countDivCodingTask = new CountDivCodingTask(10,10,7);
        int divisibleNumbersBy1 = countDivCodingTask.countDivBy();

        assertThat(divisibleNumbersBy1, is(0));
    }

    @Test
    public void returns3WhenStartingCountIs6AndEndIs11AndDivByIs2() throws Exception {
        CountDivCodingTask countDivCodingTask = new CountDivCodingTask(6,11,2);
        int divisibleNumbersBy1 = countDivCodingTask.countDivBy();

        assertThat(divisibleNumbersBy1, is(3));
    }

    @Test
    public void returns8WhenStartingCountIs0AndEndIs14AndDivByIs2() throws Exception {
        CountDivCodingTask countDivCodingTask = new CountDivCodingTask(0,14,2);
        int divisibleNumbersBy1 = countDivCodingTask.countDivBy();

        assertThat(divisibleNumbersBy1, is(8));
    }

    @Test
    public void returns12345WhenStartingCountIs101AndEndIs123456789AndDivByIs10000() throws Exception {
        CountDivCodingTask countDivCodingTask = new CountDivCodingTask(101,123456789,10000);
        int divisibleNumbersBy1 = countDivCodingTask.countDivBy();

        assertThat(divisibleNumbersBy1, is(12345));
    }

    @Test
    public void returns2WhenStartingCountIs11AndEndIs14AndDivByIs2() throws Exception {
        CountDivCodingTask countDivCodingTask = new CountDivCodingTask(11,14,2);
        int divisibleNumbersBy1 = countDivCodingTask.countDivBy();

        assertThat(divisibleNumbersBy1, is(2));
    }

    @Test
    public void returns20WhenStartingCountIs11AndEndIs345AndDivByIs17() throws Exception {
        CountDivCodingTask countDivCodingTask = new CountDivCodingTask(11,345,17);
        int divisibleNumbersBy1 = countDivCodingTask.countDivBy();

        assertThat(divisibleNumbersBy1, is(20));
    }

}