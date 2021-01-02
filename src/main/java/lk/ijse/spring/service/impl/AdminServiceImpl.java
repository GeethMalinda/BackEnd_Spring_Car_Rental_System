package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.dto.CarDTO;
import lk.ijse.spring.entity.Admin;
import lk.ijse.spring.entity.Car;
import lk.ijse.spring.repo.AdminRepo;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.service.AdminService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class AdminServiceImpl implements AdminService{

    @Autowired
    AdminRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public List<AdminDTO> getAllAdmin() {
        List<Admin> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<AdminDTO>>() {
        }.getType());
    }
}
