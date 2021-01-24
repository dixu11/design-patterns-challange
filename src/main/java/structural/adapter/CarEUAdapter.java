package structural.adapter;

import structural.adapter.american_module.CarUS;
import structural.adapter.eu_cars.CarEU;

public class CarEUAdapter implements CarEU {

    private CarUS car;

    public CarEUAdapter(CarUS car) {
        this.car = car;
    }

    @Override
    public double getMileageInKm() {
        return car.getMileageInMiles() * 1.6;
    }

    @Override
    public String getName() {
        return car.getName();
    }
}
