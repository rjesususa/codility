package br.com.codility;

/**
 * Created by rjesus on 10/05/19.
 */
public class GenomicRangeQueryCodingTask {

    String sequenceDNA;
    int[] positionP;
    int[] positionQ;

    public GenomicRangeQueryCodingTask(String sequenceDNA, int[] positionP, int[] positionQ) {
        this.sequenceDNA = sequenceDNA;
        this.positionP = positionP;
        this.positionQ = positionQ;
    }

    public int[] findTheMinimalImpactFactor() {
        int[] minimalImpactFactor = new int[positionP.length];

        for (int i = 0; i < positionP.length; i++) {
            int startsFromPosition = positionP[i];
            int endsInPosition = positionQ[i] + 1;
            String pieceOfDNA = sequenceDNA.substring(startsFromPosition, endsInPosition);

            if (pieceOfDNA.contains("A")) {
                minimalImpactFactor[i] = 1;
            } else if (pieceOfDNA.contains("C")) {
                minimalImpactFactor[i] = 2;
            } else if (pieceOfDNA.contains("G")) {
                minimalImpactFactor[i] = 3;
            } else {
                minimalImpactFactor[i] = 4;
            }
        }

        return minimalImpactFactor;
    }
}
