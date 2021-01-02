package lk.ijse.spring.service;

import lk.ijse.spring.dto.CarDTO;
import lk.ijse.spring.dto.CustomerDTO;

import java.util.List;

public interface CarService {
    void saveCar(CarDTO carDTO);

    void updateCar(CarDTO dto);

    CarDTO searchCar(String id);

    void deleteCar(String id);

    List<CarDTO> getAllCar();
}
