package racingcar.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class InputConvertorTest {

    @ParameterizedTest
    @DisplayName("입력 값을 차량 리스트로 전환한다.")
    @CsvSource(value = {"0,pobi", "1,woni", "2,jun"})
    void convertToRacingCars(int input, String expect) {
        List<RacingCar> racingCars = InputConvertor.convertToRacingCars("pobi,woni,jun");
        assertThat(racingCars.get(input).getCarName()).isEqualTo(expect);
    }
}