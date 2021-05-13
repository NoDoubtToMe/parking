package katanskiy.DemoTemplate.Repositories;

import katanskiy.DemoTemplate.Entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {
    List<Car> findAll();
    Car findById(long id);
    Car findOneByCarNumber(String number);
}

