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
    
    
    
    
    
    
}
