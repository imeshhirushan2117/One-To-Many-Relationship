package lk.OneToMany.OneToMany.repo;
import lk.OneToMany.OneToMany.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created By Imesh Hirushan
 * Project Name : OneToMany
 * Package Name : lk.OneToMany.OneToMany.repo
 * Date : Apr 1, 2024
 * Time : 11:26 PM
 */
public interface OrderRepo extends JpaRepository<Orders,  Integer> {
}
