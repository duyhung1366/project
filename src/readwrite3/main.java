package readwrite3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/*
a. Hãy thiết kế method cho phép nhập thông tin để thêm sách
b. Thực hiện test Thêm sách thì thực hiện khởi tạo đối tượng sách với
các thuộc tính lấy từ bàn phím do người dùng nhập, đồng thời lưu dữ
liệu vào file books.dat dạng text
c. Nếu người dùng yêu cầu xóa file books.dat thì hãy thực hiện xóa file
đồng thời backup dữ liệu sang file khác, ở thư mục khác(tên file và
đường dẫn thư mục nhập từ bàn phím).
 */
public class main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        FileWriter filewriter = null;
        FileReader fileReader = null;

        while (true) {
            System.out.println("1. Nhap sách");
            System.out.println("2. xóa file");
            System.out.println("3. end program");
            String check = sc.next();
            switch (check) {
                case "1": {
                    Book book = new Book();
                    book.input();
                    String writefile = book.toString() + "\n";

                    try {
                        filewriter = new FileWriter("books.dat", true);
                        filewriter.write(writefile);
                    } catch (IOException e) {
                    } finally {
                        if (filewriter != null) {
                            filewriter.close();
                        }
                    }
                    break;
                }
                case "2": {
                    File file = new File("books.dat");
                    if(!file.isFile()){
                            System.out.println("bạn chưa nhập sách");
                            break; 
                        }
                    
                    String links;
                    System.out.println("mời bạn nhập đườngn dẫn");
                    String path = new Scanner(System.in).nextLine();
                    System.out.println("mời bạn nhập tên file muốn back-up");
                    String filesave = new Scanner(System.in).nextLine();
                    links = path + filesave;

                    try {
                        filewriter = new FileWriter(links);
                        fileReader = new FileReader("books.dat");
                        int data;
                        String copy = "";
                        while ((data = fileReader.read()) != -1) {
                            char x = (char) data;
                            copy += x;
                        }
                        filewriter.write(copy);
                    } catch (IOException e) {
                    } finally{
                        if(fileReader != null){
                            fileReader.close();
                        }
                        if(filewriter != null){
                            filewriter.close();
                        }
                    }
                    file.delete();
                    
                    if(!file.isFile()){
                        System.out.println("bạn đã xóa file và back-up sang đường dẫn : " + links);
                    }
                    break;
                }
                case "3": return ;
                default: continue;
            }
        }
    }
}
