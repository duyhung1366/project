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
public class Teacher extends Person{
    private String rank;

    public Teacher() {
    }

    public Teacher(String name, String address, String department, String rank) {
        super(name, address, department);
        this.rank = rank;
    }
    
    public Teacher(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    
    @Override
    public void print(){
        System.out.println("infomation teacher");
        super.print();
        System.out.print("rank=" + rank + "}");
    }
    @Override
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rank : ");
        rank = sc.nextLine(); 
    }

}