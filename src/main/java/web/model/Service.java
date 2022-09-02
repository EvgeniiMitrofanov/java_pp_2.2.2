package web.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Service {

    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car(1, "BMW", "325"));
        carList.add(new Car(2, "Audi", "A4"));
        carList.add(new Car(3, "Mercedes-Benz", "E class"));
        carList.add(new Car(4, "KIA", "Ceed"));
        carList.add(new Car(5, "Jeep", "Cherokee"));
    }

    public List<Car> getCarList(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
