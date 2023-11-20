package racingcar.view;

import racingcar.domain.RacingCars;

public class OutputView {
    public static final String RACE_RESULT_MESSAGE = "\n실행 결과";
    public static final String DISTANCE_UNIT = "-";
    public static final String RACE_RESULT_FORMAT = "%s : %s%n";

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
}
