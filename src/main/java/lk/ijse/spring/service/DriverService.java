package lk.ijse.spring.service;

import lk.ijse.spring.dto.CarDTO;
import lk.ijse.spring.dto.DriverDTO;

import java.util.List;

public interface DriverService {
    
    void saveDriver(DriverDTO dto);

    void updateDriver(DriverDTO dto);

    DriverDTO serchDriver(String id);

    void deleteDriver(String name);

    List<DriverDTO> getAllDriver();

}
