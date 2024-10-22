package Buoihoc1;
import java.util.Scanner;

public class Bai1 {
	
	public static String chuyendoi(int a, int b) {
		String s = "0123456789ABCDEF";
		String ketqua = "";
		while(a > 0) {
			ketqua = s.charAt(a%b) + ketqua;
			a /= b;
		}
		return ketqua;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b;
		do {
			b = sc.nextInt();
		}
		while(b<2 || b > 16);
		System.out.println("ket qua:" + chuyendoi(a,b) );
	
	}
	
}