// Viết chương trình tính tổng S = 1 /1! + 2 /2! + ....+ n / n!

import java.util.Scanner;
public class bai8 {
	public static int tinhgiathua(int n) {
	    int S=1;
	for(int i=1; i<=n; i++){
		 S = S*i;
	}
        return S;
	}

    public static void main (String[] args){ 
        int n;
        System.out.println("Nhap vao mot so nguyen n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        float result = 0;
        for(int i = 1; i <= n; i++){ 
            result += (float)i / tinhgiathua(i);
        }
        System.out.println("ketqua: " + result);
    }
}