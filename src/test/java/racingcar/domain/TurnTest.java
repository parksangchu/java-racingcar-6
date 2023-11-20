package racingcar.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TurnTest {
    @ParameterizedTest
    @DisplayName("1회 미만, 숫자 이외 값 입력시 예외 발생")
    @ValueSource(strings = {"0", "-1", "d", "#", "", " "})
    void createTurn(String input) {
        assertThatThrownBy(() -> new Turn(input))
                .isInstanceOf(IllegalArgumentException.class);
    }
}