package lk.OneToMany.OneToMany.controller;

import lk.OneToMany.OneToMany.dto.CustomerDto;
import lk.OneToMany.OneToMany.entity.Customer;
import lk.OneToMany.OneToMany.service.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created By Imesh Hirushan
 * Project Name : OneToMany
 * Package Name : lk.OneToMany.OneToMany.controller
 * Date : Apr 1, 2024
 * Time : 11:24 PM
 */

@RestController
@RequestMapping("/relationships")
public class CustomerController {
    final CustomerServices customerServices;

    @Autowired
    public CustomerController(CustomerServices customerServices) {
        this.customerServices = customerServices;
    }

    @PostMapping("/saveCustomer")
    public ResponseEntity<Object> saveCustomer(@RequestBody CustomerDto customerDto){
       try {
           Customer customer = customerServices.saveCustomer(customerDto);
           return new ResponseEntity<>(customer , HttpStatus.CREATED);
       }catch (Exception exception){
           return new ResponseEntity<>("Customer Save Unsuccess !" , HttpStatus.FORBIDDEN);
       }
    }


    @GetMapping("/getAllCustomer")
    public ResponseEntity<Object> getAllCustomer(){
        try {
            List<Customer> allCustomer = customerServices.getAllCustomer();
            return new ResponseEntity<>(allCustomer , HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity<>("Customer data is not " , HttpStatus.FORBIDDEN);
        }

    }


}
