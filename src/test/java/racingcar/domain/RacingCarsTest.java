package racingcar.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RacingCarsTest {
    @ParameterizedTest
    @DisplayName("경주에는 최소 2대 이상의 차량이 참여해야 하며 중복될 수 없다.")
    @ValueSource(strings = {"상추", "상추,상추"})
    void createRacingCars(String input) {
        List<RacingCar> racingCars = InputConvertor.convertToRacingCars(input);
        assertThatThrownBy(() -> new RacingCars(racingCars))
                .isInstanceOf(IllegalArgumentException.class);
    }
}