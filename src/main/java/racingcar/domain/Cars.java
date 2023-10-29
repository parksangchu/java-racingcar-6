package racingcar.domain;

import static racingcar.view.InputView.askCarName;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> carList;
    public List<Car> createCarList(){
        String[] nameArr = askCarName().split(",");
        carList = new ArrayList<>();
        for(int i = 0; i < nameArr.length; i++){
            carList.add(new Car(nameArr[i]));
        }
        return carList;
    }
}
