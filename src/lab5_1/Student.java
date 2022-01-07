/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5_1;

/**
 *
 * @author hoang
 */
public class Student extends Person{
    private String classes;

    public Student() {
    }
    

    public Student(String name, String address, String department, String classes) {
        super(name, address, department);
        this.classes = classes; 
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    
    @Override
    public void print(){
        super.print();
    }
    
}
