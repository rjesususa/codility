package br.com.codility;

/**
 * Created by rjesus on 02/05/19.
 */
public class FrogJmpCodingTask {

    private final long initialPosition;
    private final long destinationPosition;
    private final long jumpDistance;

    public FrogJmpCodingTask(int initialPosition, int destinationPosition, int jumpDistance) {
        this.initialPosition = initialPosition;
        this.destinationPosition = destinationPosition;
        this.jumpDistance = jumpDistance;
    }

    public int returnsTheNumberOfJumpsFromPositionXToY() {
        Double jumps = ((double) (((destinationPosition + jumpDistance) - jumpDistance) - initialPosition) / jumpDistance);
        return (int) Math.ceil(jumps);
    }
}