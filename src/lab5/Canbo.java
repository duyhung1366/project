/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author Dell
 */
public class Canbo {
    private String fullName;
    private int date;
    private String address;
    private String sex;

    public Canbo() {
    }

    public Canbo(String fullName, int date, String address, String sex) {
        this.fullName = fullName;
        this.date = date;
        this.address = address;
        this.sex = sex;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDate() {
        return date;
    }

    public String getAddress() {
        return address;
    }

    public String getSex() {
        return sex;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
}
