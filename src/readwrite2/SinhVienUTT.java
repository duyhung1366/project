
package readwrite2;

import java.util.Scanner;

public class SinhVienUTT extends Sinhvien{
    private String donVi;
    private float luong;

    public SinhVienUTT() {
    }

    public SinhVienUTT(String donVi, float luong, String maSV, String hoTen, String ngaySinh, String gioiTinh, double diemTB) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diemTB);
        this.donVi = donVi;
        this.luong = luong;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("đơn vị : " + donVi);
        System.out.println("lương : " + luong);
    }
    @Override
    public void input(){
        super.input();
        System.out.println("nhap don vị : ");
        donVi = new Scanner(System.in).nextLine();
        System.out.println("nhap luong : ");
        luong = new Scanner(System.in).nextFloat();
    }
}
