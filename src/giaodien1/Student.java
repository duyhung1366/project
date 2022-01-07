package giaodien1;

import java.util.ArrayList;
import java.util.List;

/*
Định nghĩa class Student kế thừa từ Person, có thêm các thuộc tính:
mã sinh viên, email, điểm tổng kết và các phương thức khởi tạo, hiển
thị thông tin
 */
public class Student extends Person {

    private String msv;
    private String email;
    private float diem;
    private static List<Student> list_SV = new ArrayList<>();
    
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
    
    // add sinh viên
    public void add(Student obj_sv){
        list_SV.add(obj_sv);
    }
    
    // get sinh viên 
    public String getInfo_SV(){
        String info = "";
        int getlength = list_SV.size();
       if(list_SV.size() > 0){
           for ( int i = 0; i < list_SV.size(); i++){
          info +=  list_SV.get(i).toString() + "\n";
       }
           for(int i = 0; i < getlength; i++){
               list_SV.remove(0);
           }
       }
       return info;
    }
}
