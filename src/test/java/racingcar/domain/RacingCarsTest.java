package racingcar.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
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

    @Test
    @DisplayName("우승자는 상추와 배추다.")
    void selectWinner() {
        RacingCar sangchu = new RacingCar(new CarName("상추"));
        RacingCar baechu = new RacingCar(new CarName("배추"));
        RacingCar moodosa = new RacingCar(new CarName("무도사"));
        RacingCars racingCars = new RacingCars(List.of(sangchu, baechu));
        sangchu.moveForward(5);
        baechu.moveForward(6);
        Winner winner = racingCars.selectWinner();
        assertThat(winner.getWinner().get(0).getCarName()).isEqualTo("상추");
        assertThat(winner.getWinner().get(1).getCarName()).isEqualTo("배추");
    }
}