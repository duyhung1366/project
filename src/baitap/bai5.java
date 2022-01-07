//  Viết chương trình tính tổng S = 1 + 2 + 3 + … + n với n nguyên dương được nhập từ bàn phim 
import java.util.Scanner;
public class bai5 {
	public static void main(String[] args) {
	System.out.println("Nhap vao mot so nguyen n: ");
	int n;
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	int S=0;
	for(int i=0; i<=n; i++){
		S +=i;
	}
	System.out.println("Tong tu 1 den " + n + " la S = " + S);
	}
}