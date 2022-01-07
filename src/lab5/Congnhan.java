/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author Dell
 */
public class Congnhan extends Canbo{
    private String branch ;

    public Congnhan() {
    }

    public Congnhan(String branch) {
        this.branch = branch;
    }

    public Congnhan(String fullName, int date, String address, String sex, String branch) {
        super(fullName, date, address, sex);
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
    
    
}
