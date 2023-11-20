package racingcar.domain;

public enum ErrorMessage {
    ERROR("[ERROR] "),
    INVALID_NAME_LENGTH(ERROR + "차량 이름은 1-5글자 사이여야 합니다."),
    INVALID_NAME_TYPE(ERROR + "차량 이름은 특수문자를 포함할 수 없습니다."),
    INVALID_RACING_CARS_SIZE(ERROR + "경주에는 최소 2대의 차량이 참여해야합니다.");

    private final String message;

    private ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
