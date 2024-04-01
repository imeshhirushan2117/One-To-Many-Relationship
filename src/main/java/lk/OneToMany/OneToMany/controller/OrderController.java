package lk.OneToMany.OneToMany.controller;

import lk.OneToMany.OneToMany.dto.OrdersDto;
import lk.OneToMany.OneToMany.entity.Orders;
import lk.OneToMany.OneToMany.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By Imesh Hirushan
 * Project Name : OneToMany
 * Package Name : lk.OneToMany.OneToMany.controller
 * Date : Apr 1, 2024
 * Time : 11:50 PM
 */
@RestController
@RequestMapping("/relationships")
public class OrderController {

    final OrderService orderService ;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/saveOrder")
    public ResponseEntity<Object>  saveOrder (@RequestBody OrdersDto ordersDto){
       try {
           Orders orders = orderService.saveOrder(ordersDto);
           return new ResponseEntity<>(orders , HttpStatus.CREATED);
       }catch (Exception exception){
           return new ResponseEntity<>("No Orders" , HttpStatus.FORBIDDEN);
       }
    }
}
