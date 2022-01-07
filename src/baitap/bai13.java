

import java.util.Scanner;

class bai13 {
    /**
     * . Viết chương trình nhập vào 2 số và in tổng, hiệu, tích, thương 2 số đó ra màn hình.
     */
    public static void main(String[] args) {
        
        int x,y; 
        Scanner sc = new Scanner(System.in); 
        x = sc.nextInt();        
        y = sc.nextInt();
        
        // in ra man hinh
        System.out.println("tong : " + (x+y));        
        System.out.println("hieu : " + (x-y));
        System.out.println("tich : " + (x*y));        
        System.out.println("thuong : " + (x/y));

    }

}

