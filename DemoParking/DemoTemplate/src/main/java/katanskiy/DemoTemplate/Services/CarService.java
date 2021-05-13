package katanskiy.DemoTemplate.Services;

import katanskiy.DemoTemplate.Entities.Car;
import katanskiy.DemoTemplate.Repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    private CarRepository carRepository;
    @Autowired
    public void setCarRepository(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public Car findById(long id) {
        return carRepository.findById(id);
    }

    public Car findByNumber(String number) {
        return carRepository.findOneByCarNumber(number);
    }


}
