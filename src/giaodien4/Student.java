
package giaodien4;


/*
Định nghĩa class Student kế thừa từ Person, có thêm các thuộc tính:
mã sinh viên, email, điểm tổng kết và các phương thức khởi tạo, hiển
thị thông tin
 */
public class Student extends Person {

    private String msv;
    private String email;
    private float diem;
    
    public Student() {
    }

    public Student(String msv, String email, float diem, String fullName, String date, String address, String gender) {
        super(fullName, date, address, gender);
        this.msv = msv;
        this.email = email;
        this.diem = diem;
    }

    
    
    public Student(String msv, String email, float diem) {
        this.msv = msv;
        this.email = email;
        this.diem = diem;
    }


    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }
    
    @Override
    public String toString() {
        return "Student{" + super.toString() + ", msv=" + msv + ", email=" + email + ", diem=" + diem + '}';
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }
    
}
