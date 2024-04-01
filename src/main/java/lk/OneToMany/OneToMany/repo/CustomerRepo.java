package lk.OneToMany.OneToMany.repo;

import lk.OneToMany.OneToMany.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created By Imesh Hirushan
 * Project Name : OneToMany
 * Package Name : lk.OneToMany.OneToMany.repo
 * Date : Apr 1, 2024
 * Time : 11:25 PM
 */
public interface CustomerRepo extends JpaRepository <Customer ,  Integer> {
}
