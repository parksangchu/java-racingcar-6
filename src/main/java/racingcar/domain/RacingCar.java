package racingcar.domain;

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
}
