/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package supermarketlayered.dao.customer.impl;


import java.util.List;
import supermarketlayered.dao.CrudUtil;
import supermarketlayered.dao.customer.CustomerDao;
import supermarketlayered.entity.CustomerEntity;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Nethmi
 */

    public class CustomerDaoImpl implements CustomerDao{

    @Override
    public boolean add(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Customer VALUES(?,?,?,?,?,?,?,?,?)",
                t.getId(), t.getTitle(), t.getName(), t.getDob(),
                t.getSalary(), t.getAddress(), t.getCity(),
                t.getProvince(), t.getZip());
    }

    @Override
    public boolean update(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Customer SET title =?, name=?, dob=?, salary = ?, address=?, city=?, province=?, postalcode=? WHERE ID=?",
                t.getTitle(), t.getName(), t.getDob(),
                t.getSalary(), t.getAddress(), t.getCity(),
                t.getProvince(), t.getZip(), t.getId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Customer WHERE ID=?", id);
    }

    @Override
    public CustomerEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("Select * FROM Customer WHERE ID = ?", id);
        
        while (rst.next()) {            
            CustomerEntity entity = new CustomerEntity(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getDouble(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8),
                    rst.getString(9));
            
            return entity;
        }
        
        return  null;
    }

    @Override
    public List<CustomerEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("Select * FROM Customer");
        List<CustomerEntity> customerEntitys = new ArrayList<>();
        while (rst.next()) {            
            CustomerEntity entity = new CustomerEntity(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getDouble(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8),
                    rst.getString(9));
            
            customerEntitys.add(entity);
        }
        
        return  customerEntitys;
    }
    
    }


