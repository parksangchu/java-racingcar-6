package racingcar.view;

import java.util.stream.Collectors;
import racingcar.domain.RacingCar;
import racingcar.domain.RacingCars;
import racingcar.domain.Winner;

public class OutputView {
    private static final String RACE_RESULT_MESSAGE = "\n실행 결과";
    private static final String DISTANCE_UNIT = "-";
    private static final String RACE_RESULT_FORMAT = "%s : %s%n";
    private static final String WINNER = "최종 우승자 : ";
    private static final String DELIMITER = ", ";

    public static void printRaceResultNotice() {
        System.out.println(RACE_RESULT_MESSAGE);
    }

    public static void printRaceResult(RacingCars racingCars) {
        racingCars.getRacingCars()
                .forEach(racingCar -> System.out.printf(RACE_RESULT_FORMAT
                        , racingCar.getCarName(), changeDistanceForm(racingCar.getDistance())));
        System.out.println();
    }

    private static String changeDistanceForm(int distance) {
        return DISTANCE_UNIT.repeat(distance);
    }

    public static void printWinner(Winner winner) {
        System.out.print(WINNER);
        String winners = winner.getWinner()
                .stream()
                .map(RacingCar::getCarName)
                .collect(Collectors.joining(DELIMITER));
        System.out.println(winners);
    }
}
