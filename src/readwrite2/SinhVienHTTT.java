

package readwrite2;

import java.util.Scanner;

public class SinhVienHTTT extends Sinhvien {
    private float hocPhi;

    public SinhVienHTTT() {
    }

    public SinhVienHTTT(float hocPhi, String maSV, String hoTen, String ngaySinh, String gioiTinh, double diemTB) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diemTB);
        this.hocPhi = hocPhi;
    }

    public float getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(float hocPhi) {
        this.hocPhi = hocPhi;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("học phí " + hocPhi);
    }
    
    @Override
    public void input(){
        super.input();
        System.out.println("nhap hoc phi");
        hocPhi = new Scanner(System.in).nextFloat();
    }
}
