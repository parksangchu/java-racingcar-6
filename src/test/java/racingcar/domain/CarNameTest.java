package racingcar.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CarNameTest {
    @ParameterizedTest
    @DisplayName("차량이름은 1-5글자이고 특수문자를 포함하지 않는다.")
    @ValueSource(strings = {"abcdef", "", "$", "&", " ", "!", "(", "$", "%"})
    void createCarName(String input) {
        assertThatThrownBy(() -> new CarName(input))
                .isInstanceOf(IllegalArgumentException.class);
    }
}