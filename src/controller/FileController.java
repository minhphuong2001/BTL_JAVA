package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import modal.Account;
import modal.Customer;
import java.io.IOException;
import modal.Employee;
import modal.product;

/**
 *
 * @author Minh Phuong Do
 */
public class FileController {
    static FileWriter fileWriter;
    static BufferedWriter bufWriter;
    static FileReader fileReader;
    static BufferedReader bufReader;
    

    public static void writeAccountToFile(String filename, Account account){
        try {
            fileWriter = new FileWriter(filename, true);
            bufWriter = new BufferedWriter(fileWriter);
            bufWriter.write(account.toFile());
            System.out.println("write file successfully...");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                bufWriter.close();  
                fileWriter.close();
            } catch (Exception e) {         
                System.out.println("error1: " + e);  
            }
        }
    }

    public static List<Account> readAccountFromFile(String filename){
        List<Account> listAcc = new ArrayList<Account>();
        try {
            fileReader = new FileReader(filename);
            bufReader = new BufferedReader(fileReader);
            File file = new File(filename);
                if(file.exists()){
                file.createNewFile();
            }
            String line = "";
            while((line = bufReader.readLine()) != null){
                String[] data = line.split("\\|");
                Account account = new Account(Integer.parseInt(data[0]), data[1],data[2], data[3]);
                listAcc.add(account);
            }
        } catch (Exception e) {
            System.out.println("error2: " + e);
        } finally {
            try {
                bufReader.close();  
                fileReader.close();
            } catch (Exception e) {         
                System.out.println("error3: " + e);  
            }
        }
        return listAcc;
    }

    public static void updateListAccountToFile(String filename, List<Account> listAcc){
        try {
            fileWriter = new FileWriter(filename, false);
            bufWriter = new BufferedWriter(fileWriter);
            for(Account item : listAcc){
                bufWriter.write(item.toFile());
            }
            System.out.println("update file successfully...");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                bufWriter.close();  
                fileWriter.close();
            } catch (Exception e) {         
                System.out.println("error4: " + e);  
            }
        }
    }
    
    
    public static void writeCustomerToFile(String filename, Customer cus)
    {
        FileWriter fw=null;
        BufferedWriter bw=null;
        try {
            fw= new FileWriter(filename, true);
            bw= new BufferedWriter(fw);
            bw.write("\n"+cus.getCustomerId()+";"+cus.getCustomerName()+";"+cus.getCustomerPhone()+";"+cus.getAccumulatePoints());  
        } catch (IOException ex) {
            System.out.println("Loi ghi file: " + ex);
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
                System.out.println("Loi close" + ex);
            }
        }
    }
    
    public static void writeListCustomerFile(String filename, List<Customer> Customers){
        FileWriter fw=null;
        BufferedWriter bw=null;
        try {
            fw= new FileWriter(filename, false);
            bw= new BufferedWriter(fw);
            for(Customer cus: Customers){
                bw.write(cus.getCustomerId()+";"+cus.getCustomerName()+";"+cus.getCustomerPhone()+";"+cus.getAccumulatePoints());  
                bw.newLine();
            }  
        } catch (IOException ex) {
            System.out.println("Loi ghi file");
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
                System.out.println("Loi close");
            }
        }
    }
    
    
    public static List<Customer> readCustomerFromFile(String filename){
        List<Customer> customers = new ArrayList<>();
        FileReader fr=null;
        BufferedReader br=null;
        try {
            fr= new FileReader(filename);
            br= new BufferedReader(fr);
            String line="";
            while( (line=br.readLine())!=null ){
                String str[]= line.split(";");
                customers.add(new Customer(Integer.parseInt(str[0]), str[1], str[2], Float.parseFloat(str[3])));
            }
        } catch (IOException ex) {
            System.out.println("Loi doc file" + ex);
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException ex) {
                System.out.println("Loi close" + ex);
            }
        }
        return customers;
    }
//        public static void writeEmployeeToFile(String filename, Employee employee){
//        try {
//            fileWriter = new FileWriter(filename, true);
//            bufWriter = new BufferedWriter(fileWriter);
//            bufWriter.write(employee.toFile());
//        } catch (Exception e0) {
//            System.out.println(e0);
//        } finally {
//            try {
//                bufWriter.close();  
//                fileWriter.close();
//            } catch (Exception e1) {         
//                System.out.println(e1);  
//            }
//        }
//    }
    public static void writeEmployeeToFile(String filename,Employee employee)
    {
        FileWriter fw=null;
        BufferedWriter bw=null;
        try {
            fw= new FileWriter(filename, true);
            bw= new BufferedWriter(fw);
            bw.write(employee.getEmployeeId()+"|"+employee.getEmployeeName()+"|"+employee.getEmployeePhone()+"|"+employee.getEmployeeAddress()+"\n");  
        } catch (IOException e0) {
            System.out.println("Error: " + e0);
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException e1) {
                System.out.println("Error: " + e1);
            }
        }
    }
    public static List<Employee> readEmployeeFromFile(String filename){
        List<Employee> employees = new ArrayList<Employee>();
        FileReader fr=null;
        BufferedReader br=null;
        try {
            fr = new FileReader(filename);
            br = new BufferedReader(fr);
            String line = "";
            while((line = br.readLine()) != null){
                String[] data = line.split("\\|");
                Employee employee = new Employee(Integer.parseInt(data[0]),data[1],data[2],data[3]);
                employees.add(employee);
            }
        } catch (Exception e0) {
            System.out.println("Error: " + e0);
        } finally {
            try {
                br.close();  
                fr.close();
            } catch (Exception e1) {         
                System.out.println("Error: " + e1);  
            }
        }
        return employees;
    }

        public static void updateEmployeeToFile(String filename, List<Employee> employees){
        FileWriter fw=null;
        BufferedWriter bw=null;
        try {
            fw = new FileWriter(filename,false);
            bw = new BufferedWriter(fw);
            for(Employee item : employees){
                bw.write(item.getEmployeeId()+"|"+item.getEmployeeName()+"|"+item.getEmployeePhone()+"|"+item.getEmployeeAddress()+"\n");
            }
        } catch (Exception e0) {
            System.out.println("Error: "+e0);
        } finally {
            try {
                bw.close();  
                fw.close();
            } catch (Exception e1) {         
                System.out.println("Error: " + e1);  
            }
        }
    }
//---------------------------------------------------------------------------
         public static void writeProductToFile(String filename, product product){
        try {
            fileWriter = new FileWriter(filename, true);
            bufWriter = new BufferedWriter(fileWriter);
            bufWriter.write(product.toFile());
            System.out.println("write file successfully...");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                bufWriter.close();  
                fileWriter.close();
            } catch (Exception e) {         
                System.out.println("error1: " + e);  
            }
        }
    }
    public static List<product> readProductFromFile(String filename){
        List<product> listProduct = new ArrayList<product>();
        try {
            fileReader = new FileReader(filename);
            bufReader = new BufferedReader(fileReader);
            File file = new File(filename);
                if(file.exists()){
                file.createNewFile();
            }
            String line = "";
            while((line = bufReader.readLine()) != null){
                String[] data = line.split("\\|");
                product Product = new product(Integer.parseInt(data[0]), data[1],Float.parseFloat(data[2]), Float.parseFloat(data[3]), Float.parseFloat(data[4]), Integer.parseInt(data[5]));
                listProduct.add(Product);
            }
        } catch (Exception e) {
            System.out.println("error2: " + e);
        } finally {
            try {
                bufReader.close();  
                fileReader.close();
            } catch (Exception e) {         
                System.out.println("error3: " + e);  
            }
        }
        return listProduct;
    }
    
    public static void updateListProductToFile(String filename, List<product> listProduct){
        try {
            fileWriter = new FileWriter(filename, false);
            bufWriter = new BufferedWriter(fileWriter);
            for(product item : listProduct){
                bufWriter.write(item.toFile());
            }
            System.out.println("update file successfully...");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                bufWriter.close();  
                fileWriter.close();
            } catch (Exception e) {         
                System.out.println("error4: " + e);  
            }
        }
    }
    
    

}
