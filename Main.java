package Buoihoc3;
import java.util.Scanner;
public class Main {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Nhập mã sinh viên :");
		String studentCode= sc.nextLine();
		System.out.print("Nhập tên sinh viên :");
		String fullName= sc.nextLine();
		System.out.print("Nhập tuổi :");
		Byte age= sc.nextByte();
		System.out.print("Nhập giới tính :");
		String gender= sc.nextLine();
		System.out.print("Nhập số điện thoại :");
		String phoneNumber= sc.nextLine();
		System.out.print("Nhập email :");
		String email= sc.nextLine();
		Student sinhvien = new Student(studentCode, fullName, age, gender, phoneNumber, email);
		sinhvien.display();
		sc.close();
	}
}
