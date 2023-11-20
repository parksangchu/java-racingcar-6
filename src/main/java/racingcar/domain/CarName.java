package racingcar.domain;

import static racingcar.domain.ErrorMessage.INVALID_NAME_LENGTH;
import static racingcar.domain.ErrorMessage.INVALID_NAME_TYPE;

import java.util.regex.Pattern;

public class CarName {
    private static final int MIN_LENGTH = 1;
    private static final int MAX_LENGTH = 5;
    private static final String REGEX = "^[0-9]*[가-힣]*[a-zA-Z]*$";
    private final String carName;

    public CarName(String carName) {
        validateLength(carName);
        validateType(carName);
        this.carName = carName;
    }

    private void validateLength(String carName) {
        if (carName.length() < MIN_LENGTH || carName.length() > MAX_LENGTH) {
            throw new IllegalArgumentException(INVALID_NAME_LENGTH.getMessage());
        }
    }

    private void validateType(String carName) {
        if (!Pattern.matches(REGEX, carName)) {
            throw new IllegalArgumentException(INVALID_NAME_TYPE.getMessage());
        }
    }

    public String getCarName() {
        return carName;
    }
}
