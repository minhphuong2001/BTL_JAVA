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

public class product {
    private Integer maSP;
    private String tenSP;
    private Float giaBan;
    private Float giaMua;
    private Float giamGia;
    private Integer soLuong;

     public String toFile(){
        return String.format("%s|%s|%s|%s|%s|%s%n", maSP, tenSP, giaBan, giaMua, giamGia, soLuong);
    }

    public product() {
    }


    public product(String tenSP, Float giaBan, Float giaMua, Float giamGia, Integer soLuong) {
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.giaMua = giaMua;
        this.giamGia = giamGia;
        this.soLuong = soLuong;
    }

    public product(Integer maSP, String tenSP, Float giaBan, Float giaMua, Float giamGia, Integer soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.giaMua = giaMua;
        this.giamGia = giamGia;
        this.soLuong = soLuong;
    }


  
    public Integer getmaSP() {
        return maSP;
    }

    public void setmaSP(Integer maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public Float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Float giaBan) {
        this.giaBan = giaBan;
    }

    public Float getGiaMua() {
        return giaMua;
    }

    public void setGiaMua(Float giaMua) {
        this.giaMua = giaMua;
    }

    public Float getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(Float giamGia) {
        this.giamGia = giamGia;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }
    
    
    
    
}
