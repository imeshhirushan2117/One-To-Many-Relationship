package lk.OneToMany.OneToMany.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class CustomerDto {
    private int customerId;
    private String name;
    private String address;
}
