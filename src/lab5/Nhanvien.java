/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author Dell
 */
public class Nhanvien extends Canbo{
    private String work;

    public Nhanvien() {
    }

    public Nhanvien(String work) {
        this.work = work;
    }

    public Nhanvien( String fullName, int date, String address, String sex, String work) {
        super(fullName, date, address, sex);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }
    
    
    
}
