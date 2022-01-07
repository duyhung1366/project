

package readwrite2;

import java.util.Scanner;


public class Sinhvien {
    private String maSV ;
    private String hoTen ;
    private String ngaySinh ;
    private String gioiTinh ;
    private double diemTB ;

    public Sinhvien() {
        
    }

    public Sinhvien(String maSV, String hoTen, String ngaySinh, String gioiTinh, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    
    public void input() {
        System.out.println("Nhập Ma Sinh Vien: ");
        maSV = new Scanner(System.in).nextLine();
        System.out.println("Nhập Ho Ten: ");
        hoTen = new Scanner(System.in).nextLine();
        System.out.println("Nhập Ngay Sinh: ");
        ngaySinh = new Scanner(System.in).nextLine();
        System.out.println("Nhập Gioi Tinh: ");
        gioiTinh = new Scanner(System.in).nextLine();
        System.out.println("Nhập Diem Trung Binh: ");
        diemTB = new Scanner(System.in).nextDouble();
        
    }
    
    public void display() {
        System.out.println("Ma Sinh Vien: "+ getMaSV());
        System.out.println("Ho Ten: " + getHoTen());
        System.out.println("Ngay Sinh: " + getNgaySinh());
        System.out.println("Gioi Tinh: " + getGioiTinh());
        System.out.println("Diem Trung Binh: " + getDiemTB());
    }
}
