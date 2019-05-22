package br.com.codility;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by rjesus on 21/05/19.
 */
public class DistinctValueCodingTaskTest {

    @Test
    public void returns3WhenTheArrayContains211231() throws Exception {
        DistinctValueCodingTask distinctValueCodingTask = new DistinctValueCodingTask(new int[]{2,1,1,2,3,1});
        int distinctValues = distinctValueCodingTask.countDistinctValues();
        assertThat(distinctValues, is(3));
    }

    @Test
    public void returns4WhenTheArrayContains211231Negatives() throws Exception {
        DistinctValueCodingTask distinctValueCodingTask = new DistinctValueCodingTask(new int[]{-2,-1,-1,-2,3,-1});
        int distinctValues = distinctValueCodingTask.countDistinctValues();
        assertThat(distinctValues, is(3));
    }

}