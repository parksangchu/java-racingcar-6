package racingcar.domain;

public enum ErrorMessage {
    ERROR("[ERROR] "),
    INVALID_NAME_LENGTH(ERROR + "차량 이름은 1-5글자 사이여야 합니다."),
    INVALID_NAME_TYPE(ERROR + "차량 이름은 특수문자를 포함할 수 없습니다."),
    DUPLICATED_NAME(ERROR + "차량 이름은 중복될 수 없습니다."),
    INVALID_RACING_CARS_SIZE(ERROR + "경주에는 최소 2대의 차량이 참여해야합니다."),
    INVALID_TURN_RANGE(ERROR + "시도횟수는 최소 1회 이상이어야 합니다."),
    INVALID_TURN_TYPE(ERROR + "숫자 이외의 값은 입력할 수 없습니다."),
    CANT_FIND_CAR(ERROR + "차량을 찾을 수 없습니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
