/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hung
 */

public class main {
    private static int caseNumber ; 
    public static void display(){
            Scanner sc = new Scanner(System.in); 
             System.out.println("********************************\n"
                     + "lựa chọn các options: \n"
                  + "1 - Nhập thông tin mới cho cán bộ\n" +
                    "2 - Tìm kiếm theo họ tên\n" +
                    "3 - Hiển thị thông tin về danh sách các cán bộ\n" +
                    "4 - Thoát khỏi chương trình\n"
                  + "******************************\n"
                  + "mời chọn số: ");
                 caseNumber = sc.nextInt();
         }
    
    public static void main(String[] args) {
         Qlcb varcb = new Qlcb(); 
         Scanner sc = new Scanner(System.in);
         
         do{
             display();
         
         switch(caseNumber) {
             case 1 :
                System.out.println("nhập số cán bộ : ");
                int n = sc.nextInt(); 

                for(int i = 0; i < n; i++){
                    System.out.println("nhap cb thứ " + (i + 1) + " : ");
                    varcb.inputiInfo();
                }
                 break;
             case 2:
                System.out.println("nhap tu khoa can tim : ");
                String targets1 = sc.nextLine(); 
                String targets = sc.nextLine(); 
                varcb.searchInfo(targets);
                break;
             case 3:
                varcb.outputInfo();
                break; 
             default:
                 break;
            }
            }while(caseNumber != 4);
         /*
         
         System.out.println("nhập số cán bộ : ");
         int n = sc.nextInt(); 

        for(int i = 0; i < n; i++){
            System.out.println("nhap cb thứ " + (i + 1) + " : ");
            cb.inputiInfo();
        }
        for(int i = 0; i < n; i++){
            System.out.println("***************************");
            System.out.println("*****thong tin cb " + (i + 1) + " : *****");
            cb.outputInfo(i);
        }
        
        System.out.println("nhap tu khoa can tim : ");
        String targets = sc.next(); 
        cb.searchInfo(targets); */
    }
}

        // nhập số cán bộ cần nhập n 
        // gọi vòng for chạy n lần : phương thức nhập của QLCB 
        // gọi vòng for chạy n lần : xuất ra các phần tử trong QLCB 
    

