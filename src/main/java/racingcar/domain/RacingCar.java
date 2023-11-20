package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RacingCar {
    private static final int MIN_RANDOM_NUMBER = 0;
    private static final int MAX_RANDOM_NUMBER = 9;
    private static final int MOVABLE_NUMBER = 4;
    private final CarName carName;
    private int distance = 0;

    public RacingCar(CarName carName) {
        this.carName = carName;
    }

    public void moveForward(int randomNumber) {
        if (randomNumber >= MOVABLE_NUMBER) {
            distance++;
        }
    }

    private int generateRandomNumber() {
        return Randoms.pickNumberInRange(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
    }

    public String getCarName() {
        return carName.getCarName();
    }

    public int getDistance() {
        return distance;
    }
}
