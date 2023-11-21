package racingcar.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RacingCarTest {

    @ParameterizedTest
    @DisplayName("매개 변수가 4 이상이면 자동차는 전진한다.")
    @CsvSource(value = {"0,0", "1,0", "2,0", "3,0", "4,1", "5,1", "6,1", "7,1", "8,1", "9,1"})
    void moveForward(int input, int expect) {
        RacingCar racingCar = new RacingCar(new CarName("상추"));
        racingCar.moveForward(input);
        assertThat(racingCar.getDistance()).isEqualTo(expect);
    }
}