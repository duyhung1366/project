//  Dãy số Fibonacci được định nghĩa như sau: F0 =1, F1 = 1; Fn = Fn-1 + Fn-2 với n>=2 Hãy viết
// chương trình tìm số Fibonacci thứ n.
import java.util.Scanner; 

    public class bai9 { 
        public static int fibonaci(int n){
        if (n == 1 || n == 2)
        return 1;
        else 
        return fibonaci(n - 1) + fibonaci(n - 2);
    }
    public static void main( String[] args){ 
        Scanner sc = new Scanner(System.in); 
        System.out.println(" nhap n"); 
        int n;
        do { 
            n = sc.nextInt();
            if ( n < 2 ) 
            System.out.println(" vui long nhap lai");
        } while( n < 2);
        int result = fibonaci(n); 
        System.out.println("result : " + result);
    }
}
