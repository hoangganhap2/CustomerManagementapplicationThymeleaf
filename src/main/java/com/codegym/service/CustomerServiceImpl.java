package com.codegym.service;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
        private static Map<Integer, Customer> customers;

        static {
            customers = new HashMap<>();
            customers.put(1,new Customer(1,"Hoang", "hoangdaica@gmail.com","Lien Xo"));
            customers.put(2,new Customer(2,"N.Tung", "tungngusi@gmail.com","Mát-xcơ-va"));
            customers.put(3,new Customer(3,"K.Tung", "tungnguidat@gmail.com","Mai Dich cemetery"));
            customers.put(4,new Customer(4,"Hau", "cauvang@gmail.com","Lao Hac homestay"));
            customers.put(5,new Customer(5,"Quy", "laohac@gmail.com","Vu Dai village"));
            customers.put(6,new Customer(6,"Duc", "onggiao@gmail.com","Vu Dai village"));
            customers.put(7,new Customer(7,"Du", "dauxengthua@gmail.com","JAV"));
        }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(),customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id,customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
