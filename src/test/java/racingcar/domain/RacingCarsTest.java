package racingcar.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RacingCarsTest {
    @Test
    @DisplayName("경주에는 최소 2대 이상의 차량이 참여해야 한다.")
    void createRacingCars() {
        List<RacingCar> racingCars = InputConvertor.convertToRacingCars("pobi");
        assertThatThrownBy(() -> new RacingCars(racingCars))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @DisplayName("모든 차가 앞으로 전진한다.")
    @CsvSource(value = {"0,1", "1,1", "2,1", "3,1"})
    void startRace(int input, int expect) {
        RacingCars racingCars = new RacingCars(InputConvertor.convertToRacingCars("상추,도로보,kelly,서영"));
        racingCars.startRace(5);
        assertThat(racingCars.getRacingCars().get(input).getDistance()).isEqualTo(expect);
    }
}