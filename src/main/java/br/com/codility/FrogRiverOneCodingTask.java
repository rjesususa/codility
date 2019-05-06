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
        boolean[] targetLocation = new boolean[oppositeEdgeLocation];
        for (int second = 0; second < fallingLeaves.length; second++) {
            targetLocation[fallingLeaves[second] - 1] = true;
            boolean targetCompleted = isTargetCompleted(targetLocation);

            if (targetCompleted) {
                return second;
            }

        }

        return -1;
    }

    private boolean isTargetCompleted(boolean[] targetLocation) {
        for (boolean target : targetLocation) {
            if (!target) {
                return false;
            }
        }

        return true;
    }
}
