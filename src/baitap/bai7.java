// . Viết chương trình tính n! với n là số nguyên dương được nhập từ bàn phím.

import java.util.Scanner;
public class bai7 {
	public static void main(String[] args) {
	System.out.println("Nhap vao mot so nguyen n: ");
	int n;
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	float S=1;
	for(int i=1; i<=n; i++){
		 S = S*i;
	}
	System.out.println("n! = " + S);
	}
}