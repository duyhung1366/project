// Viết chương trình giải phương trình bậc hai
// ax2 + bx + c = 0

import static java.lang.Math.sqrt;
import java.util.Scanner;


public class bai4 {
    public static void main(String[] args) {
        float a, b, c;
        float x1, x2, denta;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nhap a= ");
        a = scan.nextInt();
        
        System.out.println("Nhap b= ");
        b = scan.nextInt();
        
        System.out.println("Nhap c= ");
        c = scan.nextInt();
        
        denta = (b*b - (4*a*c))/(2*a);

        if( a == 0){ 
            if(b == 0){ 
                if ( c == 0 ){ 
                     System.out.println("phuong tring vo SO nghiem"); 
                } else { 
                     System.out.println("phuong tring vo nghiem"); 
                }
            } else { 
                     System.out.println("phuong tring co nghiem: " + (-c/b)); 
            }
        }
        else{
            if (denta<0) {
                    System.out.println("PT  vo nghiem");
                } else if(denta==0) {
                    x1=x2= (-b/(2*a));
                    System.out.println("PT co nghiem kep x1 = x2= " + x1);
                } else {
                    x1 = (float) ((-b + sqrt(denta))/(2*a));
                    x2 = (float) ((-b - sqrt(denta))/(2*a));
                    System.out.println("PT co 2 nghiem x1 = " + x1 + "x2 = " + x2);
                } 
        }
            
    } 
}