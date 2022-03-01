package com.example.customer.service;

import com.example.customer.controller.CustomerRegistrationRequest;
import com.example.customer.model.Customer;

public record CustomerService() {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer= Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
    }
}
