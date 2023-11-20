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
    @DisplayName("시도 횟수 만큼 앞으로 전진한다.")
    @CsvSource(value = {"1,1", "2,2", "3,3", "4,4", "5,5"})
    void startRace(String input, int expect) {
        RacingCars racingCars = new RacingCars(InputConvertor.convertToRacingCars("상추,도로보,kelly,서영"));
        Turn turn = new Turn(input);
        racingCars.startRace(turn, 5);
        assertThat(racingCars.getRacingCars().get(0).getDistance()).isEqualTo(expect);
    }
}