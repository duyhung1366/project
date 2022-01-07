// Viết chương trình giải phương trình bậc nhất.
// ax + b = 0


import java.util.Scanner; 

public class bai3 { 
    public static void main(String[] args) {
        float a,b ; 
        float result;
        Scanner sc = new Scanner(System.in); 
        a = sc.nextInt(); 
        b = sc.nextInt(); 
        if (a == 0){ 
            if ( b == 0){ 
                System.out.println("vo so nghiem"); 
            }else { 
            System.out.println("phuong trinh vo nghiem");
            }            
        } else{ 
            result = (float)-b/a;
            System.out.println("co nghiem la : " + result);
        }
    }
}