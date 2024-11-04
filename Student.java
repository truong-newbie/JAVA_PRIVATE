package Buoihoc3;

public class Student {
	//khởi tạo thuộc tính
	private String studentCode;
	private String fullName;
	private byte age;
	private String gender;
	private String phoneNumber;
	private String email;
	//phương thức setter
	public void setstudentCode(String studentCode) {
		this.studentCode= studentCode;
	}
	public void setfullName(String fullName) {
		this.fullName=fullName;
	}
	public void setage( byte age) {
		this.age= age;
	}
	public void setgender(String gender) {
		this.gender= gender;
	}
	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber= phoneNumber;
	}
	public void setemail(String email) {
		this.email=email;
	}
	//phương thức getter
	public String getstudenCode() {
		return studentCode;
	}
	public String getfullName() {
		return fullName;
	}
	public byte getage() {
		return age;
	}
	public String gender() {
		return gender;
	}
	public String getphoneNumber() {
		return phoneNumber;
	}
	public String getemail() {
		return email;
	}
	//phương thức student không đối số
	public Student() {
		this.studentCode = "";
        this.fullName = "";
        this.age = 0;
        this.phoneNumber = "";
        this.email = "";
	}
	//phương thức student có đối số
	public Student(String studentCode, String fullName, byte age, String gender ,String phoneNumber, String email) {
		this.studentCode= studentCode;
		this.fullName= fullName;
		this.age=age;
		this.gender= gender;
		this.phoneNumber=phoneNumber;
		this.email=email;
	}
	//phương thức display
	public void display() {
        System.out.printf("%-15s %-25s %-5d %-15s %-30s%n", studentCode, fullName, age, phoneNumber, email);
    }
	
}
