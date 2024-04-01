package lk.OneToMany.OneToMany.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created By Imesh Hirushan
 * Project Name : OneToMany
 * Package Name : lk.OneToMany.OneToMany.dto
 * Date : Apr 1, 2024
 * Time : 11:25 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdersDto {
    private int orderId;
    private Date orderDate;
    private double amount;
    private int customer_id;
}
