package lk.ijse.spring.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String rid;
    private String pickUptime;
    private String pickUpdate;
    private String dropOffDate;
    private String dropOfftime;


//    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//    @JoinTable(
//            name = "reservation_details",//name of assosiate table
//            joinColumns = {@JoinColumn(name = "rid",referencedColumnName = "rid")},//primary keyname,
//            inverseJoinColumns = {@JoinColumn(name ="carid",referencedColumnName ="registrationNumber")}
//
//    )
//    private List<Car> car = new ArrayList<>();

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "rid",referencedColumnName = "email",nullable = false)
//    private  RegisterCustomer registerCustomer;

    @ManyToOne(fetch=FetchType.EAGER, optional=false)
    @JoinColumn(name = "email")
    private RegisterCustomer customer;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "carid",referencedColumnName = "registrationNumber",nullable = false)
    private  Car car;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "driverid",referencedColumnName = "id",nullable = false)
    private  Driver driver;




}
