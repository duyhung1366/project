/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5_1;

import java.util.Scanner;

/**
 *
 * @author hoang
 */
public class main {
    public static void main(String[] args) {

            Class classobj = new Class(); 
            
            while (true) {            
                System.out.println("menu : \n **********************");
                System.out.println("1 : enter className : ");
                System.out.println("2 : enter students : ");
                System.out.println("3 : enter advisor : ");
                System.out.println("4 : show infomation : ");
                System.out.println("5 :  thoat chuong trinh ");
                Scanner sc = new Scanner(System.in); 
                int n = sc.nextInt();
                switch (n){
                    case 1 -> classobj.inputClassName();
                    case 2 -> { 
                        System.out.println("nhap so sv");
                        int x = sc.nextInt();
                        classobj.inputStudent(x);
                    }
                    case 3 -> classobj.inputAdvisor();
                    case 4 -> classobj.printList();
                    case 5 -> {
                        System.out.println("thoat chuong trinh");
                        return;
                    }
                    default -> System.out.println("nhap lai");
                    
                }
        }
    }
}
