package com.auth0.samples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping(path = "/customers/{customerId}/contacts/", method = RequestMethod.GET)
    public List<Contact> getCustomerContacts(@PathVariable("customerId") Long customerId) {
    	/*Customer customer = customerRepository.findOne(customerId);
    	System.out.println("customer "+customer);
    	List<Contact> contactList = customer.getContacts();*/
    	return customerRepository.findOne(customerId).getContacts();
    }
    @RequestMapping(path = "/customers/", method = RequestMethod.GET)
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }
    
}