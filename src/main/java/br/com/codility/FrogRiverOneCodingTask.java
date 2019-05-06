package br.com.codility;

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
        boolean[] fallingLeavesUntilTheEdge = new boolean[oppositeEdgeLocation + 1];
        for (int second = 0; second < fallingLeaves.length; second++) {
            int fallingLeaf = fallingLeaves[second];
            if (!fallingLeavesUntilTheEdge[fallingLeaf]) {
                fallingLeavesUntilTheEdge[fallingLeaf] = true;
                oppositeEdgeLocation--;
            }

            if (oppositeEdgeLocation == 0) {
                return second;
            }
        }

        return -1;
    }

}