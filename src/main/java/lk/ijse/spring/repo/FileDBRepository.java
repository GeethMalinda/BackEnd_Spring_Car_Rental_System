package lk.ijse.spring.repo;

import lk.ijse.spring.entity.FileDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB,String> {

    boolean existsByName(String name);
//    FileDB findByName(String name);


    @Query(value = "select id from files where name = ? limit 1", nativeQuery = true)
    String getIdByName();

    @Query(value = "select * from files where name = ? limit 1", nativeQuery = true)
    FileDB getAllByName(String name);

}
