package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Driver {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String adress;
    private String tp;
    private int age;
    private String isAvailable;
    private String photo;

    @OneToMany(mappedBy = "driver",cascade = CascadeType.ALL)
    private List<Reservation> list;

}
