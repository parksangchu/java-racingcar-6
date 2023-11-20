package racingcar.domain;

import static racingcar.domain.ErrorMessage.INVALID_NAME_TYPE;
import static racingcar.domain.ErrorMessage.INVALID_TURN_RANGE;

public class Turn {
    private static final int MIN_VALUE = 1;
    private final int turn;

    public Turn(String turn) {
        validateType(turn);
        validateRange(turn);
        this.turn = Integer.parseInt(turn);
    }

    private void validateType(String turn) {
        if (!turn.chars()
                .allMatch(Character::isDigit)) {
            throw new IllegalArgumentException(INVALID_NAME_TYPE.getMessage());
        }
    }

    private void validateRange(String turn) {
        if (Integer.parseInt(turn) < MIN_VALUE) {
            throw new IllegalArgumentException(INVALID_TURN_RANGE.getMessage());
        }
    }

    public int getTurn() {
        return turn;
    }
}
