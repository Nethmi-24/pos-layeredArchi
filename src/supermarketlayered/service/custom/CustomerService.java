/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package supermarketlayered.service.custom;

import java.util.ArrayList;
import supermarketlayered.dto.CustomerDto;
import supermarketlayered.service.SuperService;

/**
 *
 * @author Nethmi
 */
public interface CustomerService extends SuperService{
public String addCustomer(CustomerDto customerDto)throws Exception;
  public ArrayList<CustomerDto> getAllCustomer() throws Exception;

 public CustomerDto searchCustomer(String custId) throws Exception;
}
