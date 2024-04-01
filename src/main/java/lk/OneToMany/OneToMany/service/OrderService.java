package lk.OneToMany.OneToMany.service;

import lk.OneToMany.OneToMany.dto.OrdersDto;
import lk.OneToMany.OneToMany.entity.Customer;
import lk.OneToMany.OneToMany.entity.Orders;
import lk.OneToMany.OneToMany.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created By Imesh Hirushan
 * Project Name : OneToMany
 * Package Name : lk.OneToMany.OneToMany.service
 * Date : Apr 1, 2024
 * Time : 11:51 PM
 */
@Service
public class OrderService {
    final OrderRepo orderRepo ;

    @Autowired
    public OrderService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    public Orders saveOrder(OrdersDto ordersDto) {
        Orders save = orderRepo.save(new Orders(ordersDto.getOrderId(), ordersDto.getOrderDate(), ordersDto.getAmount(),
                new Customer(ordersDto.getCustomer_id())));
        return save;
    }
}
