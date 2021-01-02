package lk.ijse.spring.entity;

import com.sun.istack.NotNull;
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
public class RegisterCustomer{
    @Id
    private String email;
    private String username;
    private String passward;
    private String nic;
    private String dlnumber;
    private String userrole;

    @OneToMany(mappedBy = "customer")
    private List<Reservation> list;

}
