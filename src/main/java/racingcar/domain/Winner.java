package racingcar.domain;

import java.util.List;

public class Winner {
    private final List<RacingCar> winner;

    public Winner(List<RacingCar> winner) {
        this.winner = winner;
    }
}
