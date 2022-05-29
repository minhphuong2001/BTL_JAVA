/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

/**
 *
 * @author Kien Ninh
 */
public class Product {
 private  Integer ProductId;
    private String ProductName;
    private Double Price;
    private Double PrePrice;
    private Double SaleDouble;
    private int Quantity;
    public Product(Integer ProductId, String ProductName, Double Price, Double PrePrice, Double SaleDouble, int Quantity) {
        this.ProductId = ProductId;
        this.ProductName = ProductName;
        this.Price = Price;
        this.PrePrice = PrePrice;
        this.SaleDouble = SaleDouble;
        this.Quantity = Quantity;
    }
     public Product(Integer ProductId, String ProductName, Double Price,Double SaleDouble, int Quantity) {
        this.ProductId = ProductId;
        this.ProductName = ProductName;
        this.Price = Price;
        this.SaleDouble = SaleDouble;
        this.Quantity = Quantity;
    }

    public Integer getProductId() {
        return ProductId;
    }

    public void setProductId(Integer ProductId) {
        this.ProductId = ProductId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }

    public Double getPrePrice() {
        return PrePrice;
    }

    public void setPrePrice(Double PrePrice) {
        this.PrePrice = PrePrice;
    }

    public Double getSaleDouble() {
        return SaleDouble;
    }

    public void setSaleDouble(Double SaleDouble) {
        this.SaleDouble = SaleDouble;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    @Override
    public String toString() {
        return "Product{" + "ProductId=" + ProductId + ", ProductName=" + ProductName + ", Price=" + Price + ", PrePrice=" + PrePrice + ", SaleDouble=" + SaleDouble + ", Quantity=" + Quantity + '}';
    }
   
    
    
    
}
