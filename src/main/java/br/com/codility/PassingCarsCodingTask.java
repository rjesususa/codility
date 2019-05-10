package br.com.codility;

/**
 * Created by rjesus on 09/05/19.
 */
public class PassingCarsCodingTask {

    final int EXCEEDS_LIMIT = 1000000000;
    int[] cars;

    public PassingCarsCodingTask(int[] cars) {
        this.cars = cars;
    }

    public int countPassingCars() {
        int accumulatedPassingCars = 0;
        int countWestCars = 0;

        int sumOfPassingCars = 0;
        boolean startToCount = false;

        for (int i = cars.length - 1; i >= 0; i--) {
            if (startToCount || cars[i] == 1) {
                startToCount = true;
                if (cars[i] == 1) {
                    countWestCars++;
                } else {
                    sumOfPassingCars += accumulatedPassingCars + countWestCars;
                    if (sumOfPassingCars > EXCEEDS_LIMIT) return -1;
                    accumulatedPassingCars += countWestCars;
                    countWestCars = 0;
                }
            }
        }

        return sumOfPassingCars;
    }
}