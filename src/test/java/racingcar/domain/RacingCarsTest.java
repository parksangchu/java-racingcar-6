package racingcar.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RacingCarsTest {
    @Test
    @DisplayName("경주에는 최소 2대 이상의 차량이 참여해야 한다.")
    void createRacingCars() {
        List<RacingCar> racingCars = InputConvertor.convertToRacingCars("pobi");
        assertThatThrownBy(() -> new RacingCars(racingCars))
                .isInstanceOf(IllegalArgumentException.class);
    }
}