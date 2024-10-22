package Buoihoc1;
import java.util.Scanner;
public class Bai3 {
	public static void main(String [] args) {
		int[] a= new int[5];
		Scanner sn= new Scanner(System.in);
		for(int i=0; i<5; i++) {
			a[i] = sn.nextInt();
		}
		for(int i=0; i<4;i++) {
			for(int j=i+1; j<5;j++) {
				if(a[i]<a[j]) {
					int temp= a[i];
					a[i]=a[j];
					a[j]= temp;
				}
			}
		}
		System.out.print(a[1]+" "+a[0]);
		
	}
}
