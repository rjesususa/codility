package br.com.codility;

/**
 * Created by rjesus on 05/05/19.
 */
public class BinaryGapCodingTask {

    int number;

    public BinaryGapCodingTask(int number) {

        this.number = number;
    }

    public Integer getTheLongestBinaryGap() {
        final String binaryValue = Integer.toBinaryString(number);

        int maxSize = 0;
        int size = 0;
        boolean fistBinaryGap = true;
        for (int i = 0; i < binaryValue.length(); i++) {
            Character value = binaryValue.charAt(i);
            if (value.equals('1')) {

                if (fistBinaryGap) {
                    size = 0;
                    fistBinaryGap = false;
                    continue;
                }

                if (size > maxSize) {
                    maxSize = size;
                }
                size = 0;
            } else {
                size++;
            }
        }

        return maxSize;
    }
}