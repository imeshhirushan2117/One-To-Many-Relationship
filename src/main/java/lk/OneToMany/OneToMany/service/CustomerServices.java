package lk.OneToMany.OneToMany.service;

import lk.OneToMany.OneToMany.dto.CustomerDto;
import lk.OneToMany.OneToMany.entity.Customer;
import lk.OneToMany.OneToMany.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Created By Imesh Hirushan
 * Project Name : OneToMany
 * Package Name : lk.OneToMany.OneToMany.service
 * Date : Apr 1, 2024
 * Time : 11:25 PM
 */
@Service
public class CustomerServices {
    final CustomerRepo customerRepo;

    @Autowired
    public CustomerServices(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public Customer saveCustomer(CustomerDto customerDto) {
          Customer save = customerRepo.save(new Customer(customerDto.getCustomerId(), customerDto.getName(), customerDto.getAddress()));
          return save;
    }

    public List<Customer> getAllCustomer() {
        List<Customer> all = customerRepo.findAll();
        return all;
    }
}
