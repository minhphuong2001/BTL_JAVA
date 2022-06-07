/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

public class OrderDetail {
    private Integer orderID;
    private Integer productID;
    private product a=new product();
    private Order od =new Order();
    private Integer quantity;

    public OrderDetail(Integer orderID, Integer productID, Integer quantity) {
        this.orderID = orderID;
        this.productID = productID;
        this.quantity = quantity;
    }
    

    public OrderDetail() {
       
    }

    public Integer getOrderID() {
        return od.getOrderID();
    }

    public void setOrderID(Order od) {
        this.orderID = od.getOrderID();
    }

    public Integer getProductID() {
        return a.getmaSP();
    }

    public void setProductID(product a) {
        this.productID = a.getmaSP();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public  float money(){
        return quantity*a.getGiaBan()-(quantity*a.getGiaBan())*a.getGiamGia();
    }

       @Override
    public String toString() {
        return "OrderDetail{" + "orderID=" + orderID + ", productID=" + productID + ", quantity=" + quantity + ", money=" + money() + '}';
    }
    
}
