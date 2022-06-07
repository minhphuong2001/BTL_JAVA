/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author Kien Ninh
 */
public class Order {
    private static  int idTemp=1;
    private Integer orderID;
    private Integer customerID;
    private String date;
    private String status;
    private Float totalMoneyDouble;

    public Order(Integer orderID,Integer customerID,String date, float totalMoneyDouble,String status) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.date = date;
        this.totalMoneyDouble = totalMoneyDouble;
        this.status=status;
    }

    Order() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public String getDate() {
       
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getTotalMoneyDouble() {
        return totalMoneyDouble;
    }

    @Override
    public String toString() {
        return "Order{" + "orderID=" + orderID + ", customerID=" + customerID + ", date=" + date  + ", totalMoneyDouble=" + totalMoneyDouble + ", status=" + status +"}";
    }

    public void setTotalMoneyDouble(float Total) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
    
            
}