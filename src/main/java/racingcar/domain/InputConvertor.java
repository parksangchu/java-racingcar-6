package racingcar.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputConvertor {
    private static final String DELIMITER = ",";

    public static List<RacingCar> convertToRacingCars(String input) {
        return Arrays.stream(input.split(DELIMITER))
                .map(name -> new CarName(name.trim()))
                .map(RacingCar::new)
                .collect(Collectors.toList());
    }
}
