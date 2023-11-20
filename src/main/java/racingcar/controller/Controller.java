package racingcar.controller;

import java.util.List;
import racingcar.domain.InputConvertor;
import racingcar.domain.RacingCar;
import racingcar.domain.RacingCars;
import racingcar.domain.Turn;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Controller implements Runnable {

    @Override
    public void run() {
        RacingCars racingCars = createRacingCars();
        Turn turn = createTurn();
        OutputView.printRaceResultNotice();
        repeatRace(racingCars, turn);
    }

    private RacingCars createRacingCars() {
        String input = InputView.readCarNames();
        List<RacingCar> racingCars = InputConvertor.convertToRacingCars(input);
        return new RacingCars(racingCars);
    }

    private Turn createTurn() {
        String input = InputView.readTurn();
        return new Turn(input);
    }

    private void repeatRace(RacingCars racingCars, Turn turn) {
        for (int i = 0; i < turn.getTurn(); i++) {
            racingCars.startRace();
            OutputView.printRaceResult(racingCars);
        }
    }
}
