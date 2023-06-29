package emailAndPasswordGenerator;

public class EmailmainMethod {

	public static void main(String[] args) {
		
		Email email1 = new Email("darshan","kn");
		
//		email1.setAlternataiveEmail("");
//		System.out.println(email1.getAlternativeEmail());
//		email1.changePassword("");
//		System.out.println(email1.getPassword());
		System.out.println(email1.showInfo());

	}

}
