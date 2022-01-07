import java.util.Scanner; 

/**
bai11: Viết chương trình kiểm tra xem một số nguyên nhập vào có phải là số nguyên tố hay khoong 
- số nguyên tố là số tự nhiên chỉ có 2 ước số là 1 và chính nó
- ví dụ : 1, 3,5,7,11,....
 */

public class bai11 { 
    public static boolean check(int n){ 
        int value = 0;
        if ( n <= 1){ 
            return false ;
        } else {
        for ( int i = 1; i<= n; i++){ 
            if ( n % i == 0){
                value += 1 ;
            }
        }
        if ( value > 2){ 
           return false;
        } else { 
            return true;
        }
        }
    }

    public static void main(String[] args){ 
        int a ;
        Scanner sc = new Scanner(System.in); 
        System.out.println("nhap n:");
        a = sc.nextInt(); 
        boolean result = check(a); 
        if(result == true ){ 
            System.out.println("la so nguyen to"); 
        } else System.out.println("khong la so nguyen to");
    }
}