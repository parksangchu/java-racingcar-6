package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> carList;

    public List<Car> createCarList(String inputNames) {
        String[] nameArr = inputNames.split(",");
        carList = new ArrayList<>();
        for (int i = 0; i < nameArr.length; i++) {
            carList.add(new Car(nameArr[i]));
        }
        return carList;
    }

    public Car findMaxDistanceCar() {
        return carList.stream()
                .max(Car::compareTo).orElseThrow(() -> new IllegalArgumentException("차량이 존재하지 않습니다."));
    }
}
