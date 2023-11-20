package racingcar.domain;

public enum ErrorMessage {
    ERROR("[ERROR] "),
    INVALID_NAME_LENGTH(ERROR + "차량 이름은 1-5글자 사이여야 합니다.");

    private final String message;

    private ErrorMessage(String message) {
        this.message = message;
    }
}
