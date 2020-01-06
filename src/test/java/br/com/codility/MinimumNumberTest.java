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
}