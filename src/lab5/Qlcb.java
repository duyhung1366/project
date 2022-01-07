/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Qlcb{
    private List<Canbo> canbos; 
    private Canbo cb; 

    public Qlcb() {
        canbos = new ArrayList<Canbo>(); 
        
    }
    
    public void inputiInfo(){
        cb = new Canbo(); 
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter name : ");
        cb.setFullName(sc.nextLine());
        System.out.println("enter date : ");
        cb.setDate(sc.nextInt());
        
        System.out.println("enter address : ");
        cb.setAddress(sc.nextLine());
        cb.setAddress(sc.nextLine());
        System.out.println("enter sex : ");
        cb.setSex(sc.next());
        
        canbos.add(cb); 
    }
    public void outputInfo(){
        for(int x = 0; x < canbos.size(); x++){
            System.out.println("*******************************************");
            System.out.println("******thông tin cán bộ thứ " + (x + 1) +"*********");
            System.out.println("name     : " + canbos.get(x).getFullName());
            System.out.println("date     : " + canbos.get(x).getDate());
            System.out.println("address  : " + canbos.get(x).getAddress());
            System.out.println("sex      : " + canbos.get(x).getSex());
        }
        
    }
    
    public void searchInfo(String target){
        int result = 0 ;
        for(int i = 0 ; i < canbos.size(); i++){
            if(canbos.get(i).getFullName().equals(target)){
                result = i + 1;
                break ;
            }
        }
        System.out.println("**************************");
        if (result != 0){
            System.out.println("tim thay tai vi tri : " + result);
        } else {
            System.out.println("ko tim thay!!!");
        }
    }
}
