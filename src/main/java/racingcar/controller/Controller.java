package racingcar.controller;

import java.util.List;
import racingcar.domain.InputConvertor;
import racingcar.domain.RacingCar;
import racingcar.domain.RacingCars;
import racingcar.domain.Turn;
import racingcar.view.InputView;

public class Controller implements Runnable {

    @Override
    public void run() {
        RacingCars racingCars = createRacingCars();
        String input = InputView.readTurn();
        Turn turn = new Turn(input);
    }

    private RacingCars createRacingCars() {
        String input = InputView.readCarNames();
        List<RacingCar> racingCars = InputConvertor.convertToRacingCars(input);
        return new RacingCars(racingCars);
    }
}
