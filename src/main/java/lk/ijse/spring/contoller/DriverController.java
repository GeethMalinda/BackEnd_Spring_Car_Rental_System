package lk.ijse.spring.contoller;

import lk.ijse.spring.dto.CarDTO;
import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.service.CarService;
import lk.ijse.spring.service.DriverService;
import lk.ijse.spring.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/driver")
@CrossOrigin
public class DriverController {

    @Autowired
    DriverService driverService;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity addDriver(@RequestBody DriverDTO dto) {
        driverService.saveDriver(dto);
        StandradResponse response = new StandradResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{name}")
    public ResponseEntity deleteDriver(@PathVariable String name) {
        driverService.deleteDriver(name);
        return new ResponseEntity(new StandradResponse(200, "Success", null), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity updateDriver(@RequestBody DriverDTO dto) {
        driverService.updateDriver(dto);
        return new ResponseEntity(new StandradResponse(200, "Success", null), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity serchDriver(@PathVariable String id) {
        DriverDTO dto = driverService.serchDriver(id);
        return new ResponseEntity(new StandradResponse(200, "Success", dto), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getAllDriver() {
        List<DriverDTO> allDriver = driverService.getAllDriver();
        return new ResponseEntity(new StandradResponse(200, "Success", allDriver), HttpStatus.OK);
    }
}
