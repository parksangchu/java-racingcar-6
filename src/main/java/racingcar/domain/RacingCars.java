package racingcar.domain;

import static racingcar.domain.ErrorMessage.INVALID_RACING_CARS_SIZE;

import java.util.List;

public class RacingCars {
    private static final int MIN_SIZE = 2;
    private final List<RacingCar> racingCars;

    public RacingCars(List<RacingCar> racingCars) {
        validateSize(racingCars);
        this.racingCars = racingCars;
    }

    private void validateSize(List<RacingCar> racingCars) {
        if (racingCars.size() < MIN_SIZE) {
            throw new IllegalArgumentException(INVALID_RACING_CARS_SIZE.getMessage());
        }
    }
}
