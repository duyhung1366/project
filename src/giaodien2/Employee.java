

package giaodien2;

import java.util.ArrayList;
import java.util.List;

public class Employee extends Person{
    private String department ;
    private float hsl;
    private byte experience;
    private double salary_basic;
    private static List<Employee> list_Employee = new ArrayList<>();

    public Employee() {
    }

    public Employee(String fullName, String date, String address, String gender, String department, float hsl,double salary_basic, byte experience) {
        super(fullName, date, address, gender);
        this.department = department;
        this.hsl = hsl;
        this.experience = experience;
        this.salary_basic = salary_basic;
    }

    
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getHsl() {
        return hsl;
    }

    public void setHsl(float hsl) {
        this.hsl = hsl;
    }

    public byte getExperience() {
        return experience;
    }

    public void setExperience(byte experience) {
        this.experience = experience;
    }

    public double getSalary_basic() {
        return salary_basic;
    }

    public void setSalary_basic(double salary_basic) {
        this.salary_basic = salary_basic;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +  "phòng ban=" + department + ", hệ số lương=" + hsl + ", thâm niên=" + experience + ", lương cơ bản=" + salary_basic + ", lương thực lĩnh=" + this.getSalary_Standard() + '}';
    }

    // hiển thị
    public void display(){
        System.out.println(this.toString());
    }
    
    public double getSalary_Standard(){
        return (this.salary_basic * (double)this.hsl *(1 + (((double)this.experience) / 100))); 
    }
    
    public void add(Employee nv){
        list_Employee.add(nv);
    }
    
    public String getInfoNV(){
        String info = "";
        int getlength = list_Employee.size(); 
       if(list_Employee.size() > 0){
           for(int i = 0; i < list_Employee.size() ; i++){
            info += list_Employee.get(i).toString() + "\n"; 
        }
           for(int i = 0; i < getlength; i++){
               list_Employee.remove(0);
           }
       }
       return info;
    }
}
