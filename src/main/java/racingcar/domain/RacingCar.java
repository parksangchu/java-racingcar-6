package racingcar.domain;

public class RacingCar {
    private final CarName carName;
    private int distance = 0;

    public RacingCar(CarName carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName.getCarName();
    }

    public int getDistance() {
        return distance;
    }
}
