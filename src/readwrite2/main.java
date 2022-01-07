
package readwrite2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class main {
      public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter filewriter = null;
        while (true) {
            System.out.println("1. Nhap svUTT");
            System.out.println("2. Nhap svHTTT");
            System.out.println("3. delete all file");
            System.out.println("4. end program");
            String check = sc.next();
            switch (check) {
                case "1": {
                    System.out.println("Nhap SvUTT");
                    SinhVienUTT svUTT = new SinhVienUTT();
                    svUTT.input();
                    try {
                        filewriter = new FileWriter("svUTT.dat", true);
                        String chardata = svUTT.getMaSV() + " | " + svUTT.getHoTen() + " | " + svUTT.getNgaySinh() + " | " + svUTT.getGioiTinh()+ " | " + svUTT.getDiemTB()+ " | " + svUTT.getDonVi()+ " | " + svUTT.getLuong() + "\n" ;
                        filewriter.write(chardata);
                    } catch (Exception e) {
                    } finally {
                        if (filewriter != null) {
                            filewriter.close();
                        }
                    }

                    break;

                }
                case "2": {
                    System.out.println("Nhap SvHTTT");
                    SinhVienHTTT svHTTT = new SinhVienHTTT();
                    svHTTT.input();
                    try {
                        filewriter = new FileWriter("svHTTT.dat", true);
                        String chardata = svHTTT.getMaSV() + " | " + svHTTT.getHoTen() + " | " + svHTTT.getNgaySinh() + " | " + svHTTT.getGioiTinh()+ " | " + svHTTT.getDiemTB()+ " | " + svHTTT.getHocPhi()+ "\n" ;
                        filewriter.write(chardata);
                    } catch (IOException e) {
                    } finally {
                        if (filewriter != null) {
                            filewriter.close();
                        }
                    }

                    break;
                }
                case "3":{
                    File filesvHTTT = new File("svHTTT.dat");
                    File filesvUTT = new File("svUTT.dat");
                    
                    filesvHTTT.delete();
                    filesvUTT.delete();
                    break;
                }
                case "4": return;
                default:
                    continue;

            }
        }

    }
}
