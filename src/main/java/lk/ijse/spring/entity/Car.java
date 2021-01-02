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

public class Car {

    @Id
    private String registrationNumber;
    private String brand;
    private String type;
    private int numberOfPassengers;
    private String transmissionType;
    private String fuelType;
    private String pricesFortheRentDuration;
    private double priceForExtraKm;
    private String color;
    private String path;
    private String year;
    private String isAvailable;
    private String image;

    @OneToMany(mappedBy = "car",cascade = CascadeType.ALL)
    private List<Reservation> list;

//    @ManyToOne(fetch=FetchType.EAGER, optional=false)
//    @JoinColumn(name = "id")
//    private FileDB fileDB;



}
