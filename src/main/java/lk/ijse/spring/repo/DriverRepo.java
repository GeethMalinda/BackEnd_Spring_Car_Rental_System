package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Driver;
import lk.ijse.spring.entity.RegisterCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DriverRepo  extends JpaRepository<Driver,String> {

    boolean existsByName(String name);
    List<Driver> deleteDriverByName(String firstName);

//    @Query(value = "delete from driver where name  = ?;", nativeQuery = true)
//    boolean deletedriver(String name);

}
