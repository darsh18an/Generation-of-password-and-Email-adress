package emailAndPasswordGenerator;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName ;
	private String password;
	private String department;
//	private String alternativeEmail;
	private int defaultPasswordLength=10;
	private String email;
	private String companySuffix="tcs.com";
	
	
	//constructor to receive first name and last name
	
	public Email(String firstName, String lastName){
		this.firstName= firstName;
		this.lastName= lastName;
		System.out.println(this.firstName + this.lastName);
		
		//call a method for the department
		this.department=setDepartment();
//		System.out.println("Department is :"+ this.department);
		
		//call a method that returns random password
		this.password=randomPassword(defaultPasswordLength);
//		System.out.println("your password is: "+this.password);
		
//		combine elements to form email
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
//		System.out.println("your email is "+ email);
		
	}
	
	private String setDepartment() {
		System.out.print("Enter department code:\n 1 for sales \n 2 for development\n 3 for accounts\n 0 for none");
				Scanner sc =new Scanner(System.in);
				int departmentChoice = sc.nextInt();
				if(departmentChoice==1) {
					return "sales";
				}else if(departmentChoice==2){
					return "development";
				}else if (departmentChoice==3) {
					return "accounts";
				}else {
					return " ";
					}
	}
	
	private String randomPassword(int length) {			
		String passwordset ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*~";
		char[]password= new char[length];
		for(int i=0; i<length; i++) {
			int randomPassword = (int)(Math.random()*passwordset.length());
			password[i]=passwordset.charAt(randomPassword);
			}
		return new String(password);
	}
	
//	public void setAlternataiveEmail(String altEmail) {
//		this.alternativeEmail = altEmail;
//	}
//	public void changePassword(String pswrd) {
//		this.password= pswrd;
//	}
//	public String getAlternativeEmail() {
//		return alternativeEmail;
//	}
//	public String getPassword() {
//		return password;
//	}
	
	public String showInfo() {
		return "Full Name : "+ firstName+" "+ lastName+" "+ "Company Email :"+email+" " +"Company password :"+password ;
	}
		
	
}
