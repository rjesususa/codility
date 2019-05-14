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

        final int lengthOfSequenceDNA = sequenceDNA.length();
        int[] nucleotidesTypeA = new int[lengthOfSequenceDNA + 1];
        int[] nucleotidesTypeC = new int[lengthOfSequenceDNA + 1];
        int[] nucleotidesTypeG = new int[lengthOfSequenceDNA + 1];

        int sumOfA, sumOfC, sumOfG;

        for (int i = 0; i < lengthOfSequenceDNA; i++) {
            sumOfA = 0;
            sumOfC = 0;
            sumOfG = 0;
            final char pieceOfDNA = sequenceDNA.charAt(i);
            if (pieceOfDNA == 'A') {
                sumOfA = 1;
            }
            if (pieceOfDNA == 'C') {
                sumOfC = 1;
            }
            if (pieceOfDNA == 'G') {
                sumOfG = 1;
            }

            nucleotidesTypeA[i + 1] = nucleotidesTypeA[i] + sumOfA;
            nucleotidesTypeC[i + 1] = nucleotidesTypeC[i] + sumOfC;
            nucleotidesTypeG[i + 1] = nucleotidesTypeG[i] + sumOfG;
        }

        for (int i = 0; i < positionP.length; i++) {
            int startsFromPosition = positionP[i];
            int endsInPosition = positionQ[i] + 1;

            if (nucleotidesTypeA[endsInPosition] - nucleotidesTypeA[startsFromPosition] > 0) {
                minimalImpactFactor[i] = 1;
            } else if (nucleotidesTypeC[endsInPosition] - nucleotidesTypeC[startsFromPosition] > 0) {
                minimalImpactFactor[i] = 2;
            } else if (nucleotidesTypeG[endsInPosition] - nucleotidesTypeG[startsFromPosition] > 0) {
                minimalImpactFactor[i] = 3;
            } else {
                minimalImpactFactor[i] = 4;
            }
        }

        return minimalImpactFactor;
    }
}
