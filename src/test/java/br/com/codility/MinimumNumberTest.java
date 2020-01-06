package br.com.codility;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MinimumNumberTest {

    @Test
    public void shouldReturn1WhenTheListOfDoubleIs12345() {
        double[] list = {1.9,2.5,3.4,5.1};
        MinimumNumber minimumNumber = new MinimumNumber(list);
        double expectedMinimumNumber = minimumNumber.findTheMinimumNumber();
        assertThat(expectedMinimumNumber, is(1.9));
    }

    @Test
    public void shouldReturn2WhenTheListOfDoubleIs72346() {
        double[] list = {7.9,2.5,3.4,6.1};
        MinimumNumber minimumNumber = new MinimumNumber(list);
        double expectedMinimumNumber = minimumNumber.findTheMinimumNumber();
        assertThat(expectedMinimumNumber, is(2.5));
    }

    @Test
    public void shouldReturn3WhenTheIsInTheMiddleOfTheList() {
        double[] list = {7.9,10.5,3.4,6.1,7.9};
        MinimumNumber minimumNumber = new MinimumNumber(list);
        double expectedMinimumNumber = minimumNumber.findTheMinimumNumber();
        assertThat(expectedMinimumNumber, is(3.4));
    }

    @Test
    public void shouldReturn1WhenThereIsMoreThanOneMinimumNumber() {
        double[] list = {1.1,1.4,1.1,1.5};
        MinimumNumber minimumNumber = new MinimumNumber(list);
        double expectedMinimumNumber = minimumNumber.findTheMinimumNumber();
        assertThat(expectedMinimumNumber, is(1.1));
    }

    @Test
    public void shouldReturn13WhenTheListHasOnlyOneValue() {
        double[] list = {13.0};
        MinimumNumber minimumNumber = new MinimumNumber(list);
        double expectedMinimumNumber = minimumNumber.findTheMinimumNumber();
        assertThat(expectedMinimumNumber, is(13.0));
    }
}