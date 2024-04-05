package lk.OneToMany.OneToMany.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * Created By Imesh Hirushan
 * Project Name : OneToMany
 * Package Name : lk.OneToMany.OneToMany.entity
 * Date : Apr 1, 2024
 * Time : 11:18 PM
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    private Date orderDate;
    private double amount;

    @ManyToOne
    @JoinColumn(name = "customer_Id") //colum name
    @JsonIgnore
    private Customer customer ;
}
