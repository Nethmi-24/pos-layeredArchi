/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketlayered.controller;

import java.util.ArrayList;
import supermarketlayered.dto.CustomerDto;
import supermarketlayered.service.ServiceFactory;
import supermarketlayered.service.custom.CustomerService;
import supermarketlayered.service.custom.impl.CustomerServiceImpl;

/**
 *
 * @author Nethmi
 */
public class customerController {
 private CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.serviceType.CUSTOMER);
    
    public String saveCustomer(CustomerDto customerDto) throws Exception{
        return customerService.addCustomer(customerDto);
    }
      public ArrayList<CustomerDto> getAllCustomers() throws Exception{
        return customerService.getAllCustomer();
    }

    public CustomerDto searchCustomer(String custId) throws Exception{
        return customerService.searchCustomer(custId);
    }
}
