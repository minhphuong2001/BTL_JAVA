package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import modal.Account;

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
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("test git local");
        } finally {
            try {
                bufWriter.close();  
                fileWriter.close();
            } catch (Exception e) {         
                System.out.println(e);  
            }
        }
    }

    public static List<Account> readAccountToFile(String filename){
        List<Account> listAcc = new ArrayList<Account>();
        try {
            fileReader = new FileReader(filename);
            bufReader = new BufferedReader(fileReader);
            String line = "";
            while((line = bufReader.readLine()) != null){
                String data[] = line.toString().split("\\|");
                Account account = new Account(data[0], data[1],data[2], data[3]);
                listAcc.add(account);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                bufWriter.close();  
                fileWriter.close();
            } catch (Exception e) {         
                System.out.println(e);  
            }
        }
        return listAcc;
    }
}
