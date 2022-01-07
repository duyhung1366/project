/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class main {
    public static void main(String[] args) {
            List<String> a = new ArrayList<>();
            a.add("1");
            a.add("2");
            a.add("3");
            a.add("4");
//            a.remove(0);
//            System.out.println(a.get(0));
            for(int i = 0 ; i < 4; i++){
                System.out.println(a.get(i));
            }
//            for(int i = 0 ; i < 4; i++){
//                a.remove(0);
//            }
//            System.out.println(a.get(0));
           
    }
    
}
