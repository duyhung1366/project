/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5_1;

import java.util.Scanner;
import java.util.jar.Attributes;

/**
 *
 * @author hoang
 */
public class Person {

    private String name;
    private String address;
    private String department;

    public Person() {
    }

    public Person(String name, String address, String department) {
        this.name = name;
        this.address = address;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "{" + "name=" + name + ", address=" + address + ", department=" + department + '}';
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter name : ");
        name = input.nextLine();
        System.out.println("enter address : ");
        address = input.nextLine();
        System.out.println("enter department : ");
        department = input.nextLine();
    }

    public void print(){
        System.out.println(toString());
    }
    
}
