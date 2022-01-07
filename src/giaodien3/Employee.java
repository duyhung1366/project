

package giaodien3;


public class Employee extends Person{
    private String department ;
    private float hsl;
    private byte experience;
    private double salary_basic;

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
        return  "Employee{" + super.toString() + "department=" + department + ", salary=" + hsl + ", seniority=" + experience + ", salary_basic=" + salary_basic + '}';
    }

    // hiển thị
    public void display(){
        System.out.println(this.toString());
    }
    
    public double getSalary_Standard(){
        return (this.salary_basic * (double)this.hsl *(1 + (((double)this.experience) / 100))); 
    }
}
