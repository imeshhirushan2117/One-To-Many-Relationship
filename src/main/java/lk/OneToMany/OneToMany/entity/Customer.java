package lk.OneToMany.OneToMany.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

/**
 * Created By Imesh Hirushan
 * Project Name : OneToMany
 * Package Name : lk.OneToMany.OneToMany.entity
 * Date : Apr 1, 2024
 * Time : 11:17 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;
    private String name;
    private String address;

    @OneToMany (mappedBy = "customer" , cascade = CascadeType.ALL)
    List<Orders> orders;

    public Customer(Integer customerId, String name, String address) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
    }

    public Customer(Integer customerId) {
        this.customerId = customerId;
    }
}
