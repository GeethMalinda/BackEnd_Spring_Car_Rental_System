package lk.ijse.spring.repo;

import lk.ijse.spring.entity.RegisterCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<RegisterCustomer,String> {

}
