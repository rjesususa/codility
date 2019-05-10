package br.com.codility;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by rjesus on 10/05/19.
 */
public class GenomicRangeQueryCodingTaskTest {


    @Test
    public void shouldReturnsValue241WhenDNASequenceIsCAGCCTAWithP250ANdQ456() throws Exception {
        GenomicRangeQueryCodingTask genomicRangeQueryCodingTask = new GenomicRangeQueryCodingTask("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6});
        int[] minimalImpactFactor = genomicRangeQueryCodingTask.findTheMinimalImpactFactor();
        assertThat(minimalImpactFactor, is(equalTo(new int[]{2, 4, 1})));
    }

}