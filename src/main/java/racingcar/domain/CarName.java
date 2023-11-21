package racingcar.domain;

import static racingcar.domain.ErrorMessage.INVALID_NAME_LENGTH;
import static racingcar.domain.ErrorMessage.INVALID_NAME_TYPE;

import java.util.Objects;
import java.util.regex.Pattern;

public class CarName {
    private static final int MAX_LENGTH = 5;
    private static final String REGEX = "[0-9|a-zA-Zㄱ-ㅎㅏ-ㅣ가-힣]*";
    private final String carName;

    public CarName(String carName) {
        validateLength(carName);
        validateType(carName);
        this.carName = carName;
    }

    private void validateLength(String carName) {
        if (carName.isEmpty() || carName.length() > MAX_LENGTH) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CarName carName1)) {
            return false;
        }
        return Objects.equals(carName, carName1.carName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName);
    }
}
