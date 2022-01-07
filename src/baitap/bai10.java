import java.util.Scanner; 

// Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ. Ví dụ: Số
//8545604 có tổng các chữ số là: 8+5+4+5+6+0+4= 32.

public class bai10 { 
    public static void main (String[] args){ 
        int input; 
        Scanner sc = new Scanner(System.in); 
        do{ 
            input = sc.nextInt();   
            if(input <= 0){ 
                System.out.println("nhap lai so nguyen");
            }
        } while(input <= 0); 
           int inputnew = input , result =0 ;
        while( inputnew >= 10){ 
            result += inputnew%10 ;
            inputnew = inputnew/10; 
        };
        System.out.println("result: " + (result + inputnew)); 
    }
}