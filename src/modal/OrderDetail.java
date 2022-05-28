/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Kien Ninh
 */
public class OrderDetail {
    private Integer orderID;
    private Integer productID;
    private Integer quantity;
    private Double money;
    private List<OrderDetail> listOD=new ArrayList<OrderDetail>();

    public OrderDetail(int parseInt, int parseInt0, String string, double parseDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public List<OrderDetail> getListOD() {
        return listOD;
    }

    public void setListOD(List<OrderDetail> listOD) {
        this.listOD = listOD;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OrderDetail other = (OrderDetail) obj;
        if (!Objects.equals(this.orderID, other.orderID)) {
            return false;
        }
        return true;
    }
    
            
}
