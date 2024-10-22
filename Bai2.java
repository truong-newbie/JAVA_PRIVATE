package Buoihoc1;
import java.util.Scanner;
public class Bai2 {
	public static void main(String [] args) {
		Scanner sn= new Scanner(System.in);
		System.out.print("Nhập số nguyên :");
		int n= sn.nextInt();
		int tich=1;
		
		while(n>0) {
			int a= n%10;
			tich*=a;
			n=n/10;
		}
		System.out.print("Tich="+tich);	
	}
}
