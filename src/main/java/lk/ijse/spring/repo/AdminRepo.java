package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.naming.Name;

public interface AdminRepo extends JpaRepository<Admin,String> {

    boolean existsByNameAndPassward(String name,String passward);
}
