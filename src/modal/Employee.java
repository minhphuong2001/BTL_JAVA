/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modal;

/**
 *
 * @author pham thi hoan
 */
public class Employee {
    private Integer employeeId;
    private String employeeName;
    private String employeePhone;
    private String employeeAddress;
    public Employee(){
        
    }
    public Employee(Integer employeeId, String employeeName, String employeePhone, String employeeAddress){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.employeePhone=employeePhone;
        this.employeeAddress=employeeAddress;
    }
    public Integer getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeId(Integer employeeId){
        this.employeeId=employeeId;
    }
    public String getEmployeeName(){
            return employeeName;
    }
    public void getEmployeeName(String employeeName){
            this.employeeName=employeeName;
    }
    public String getEmployeePhone(){
            return employeePhone;
    }
    public void setEmployeePhone(String employeePhone){
        this.employeePhone=employeePhone;
    }
    public String getEmployeeAddress(){
            return employeeAddress;
    }
    public void setEmployeeAddress(String employeeAddress){
            this.employeeAddress=employeeAddress;
    }
    public String toFile(){
        return String.format("%d|%s|%s|%s",employeeId , employeeName, employeePhone, employeeAddress);
    }
}

