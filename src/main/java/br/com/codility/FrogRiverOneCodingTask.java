package br.com.codility;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by rjesus on 05/05/19.
 */
public class FrogRiverOneCodingTask {

    int oppositeEdgeLocation;
    int[] fallingLeaves;

    public FrogRiverOneCodingTask(int oppositeEdgeLocation, int[] fallingLeaves) {
        this.oppositeEdgeLocation = oppositeEdgeLocation;
        this.fallingLeaves = fallingLeaves;
    }

    public Integer getTheEarliestTime() {
        Set<Integer> fallingLeavesUntilTheEdge = new HashSet<>(fallingLeaves.length);
        for (int second = 0; second < fallingLeaves.length; second++) {
            fallingLeavesUntilTheEdge.add(fallingLeaves[second]);

            if (fallingLeavesUntilTheEdge.size() == oppositeEdgeLocation) {
                return second;
            }

        }

        return -1;
    }

}
