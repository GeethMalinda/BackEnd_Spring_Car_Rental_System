package lk.ijse.spring.contoller;


import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.dto.CarDTO;
import lk.ijse.spring.service.AdminService;
import lk.ijse.spring.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin")
@CrossOrigin
public class AdminController {

    @Autowired
    AdminService adminService;


    @GetMapping
    public ResponseEntity getAllAdmin() {
        List<AdminDTO> allAdmin = adminService.getAllAdmin();
        return new ResponseEntity(new StandradResponse(200, "Success", allAdmin), HttpStatus.OK);

    }


}
