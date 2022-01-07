

package readwrite;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class main {
    public static void main(String[] args) throws FileNotFoundException {
        List<Employee> list_Employee = new ArrayList<>();
        
        
        // câu a 
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        FileWriter fileWriter = null;
        
        try {
            fileInputStream = new FileInputStream("nhanvien.dat");
            fileWriter = new FileWriter("nhanvien.txt",true);
           
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            String chardata = new String();
            String[] linetext ; 
            String[] propertiestext ; 
            
            int data ;
            
            while((data = bufferedInputStream.read()) != -1){
                char x = (char)data; 
                chardata += x;
            }
            
            linetext = chardata.split("\\r?\\n"); // convert string chardata sang array chứa các nhân viên
            
            for (String linetext1 : linetext) {
                propertiestext = linetext1.split("\\$"); // convert linetext -> array chứa các thuộc tính
                
                Employee  employee = new Employee();
                employee.setFullName(propertiestext[0]);
                
                employee.setDate(propertiestext[1]);
                employee.setAddress(propertiestext[2]);
                employee.setGender(propertiestext[3]);
                employee.setDepartment(propertiestext[4]);
                employee.setHsl(Float.parseFloat(propertiestext[5]));
                employee.setExperience(Byte.parseByte(propertiestext[6]));
                employee.setSalary_basic(Double.parseDouble(propertiestext[7]));
                list_Employee.add(employee);
            }
            
            // câu b
            String employ ;
            for(int i = 0; i< list_Employee.size(); i++){
                System.out.println("nhân viên thứ " + (i + 1));
                list_Employee.get(i).display();
                System.out.println("");
                employ = "nhân viên thứ " + (i+1) + "\n" +list_Employee.get(i).toString() + "\n"; 
                fileWriter.write(employ);
            }
                
        } catch (Exception e) {
        } finally{
            if(fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(bufferedInputStream != null){
                try {
                    bufferedInputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(fileWriter != null){
                try {
                    fileWriter.close();
                } catch (IOException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    
    //câu c
        System.out.println("nhap ten file:");
        String fileName = new Scanner(System.in).nextLine();
        
        FileReader reader = null;
        FileWriter writer1 = null;
        try {

            reader = new FileReader("nhanvien.dat");
            writer1 = new FileWriter(fileName);
            int readText;
            String str = "";
            while ((readText = reader.read()) != -1) {
                str += (char) readText;
            }
            System.out.println("");

            writer1.write(str);

        } catch (Exception ex) {
        } finally{
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(writer1 != null){
                try {
                    writer1.close();
                } catch (IOException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
    
    }
}
