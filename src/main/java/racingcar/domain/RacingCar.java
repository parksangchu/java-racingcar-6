package racingcar.domain;

import java.util.Objects;

public class RacingCar {

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

    public String getCarName() {
        return carName.getCarName();
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RacingCar racingCar)) {
            return false;
        }
        return Objects.equals(carName, racingCar.carName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName);
    }
}
