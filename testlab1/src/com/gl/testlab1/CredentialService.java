package com.gl.testlab1;
import java.util.Random;

public class CredentialService {
int length = 8;

	String first,last;
	Employee obj = new Employee("Balaji","Priyan");	
	public String generateEmailId() {

		first =obj.FirstName;
		last = obj.LastName;
		return first+last;
	}

	public String generatePassword() {
		String CapitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String SmallLetters = "abcdefghijklmnopqrstuvwxyz";
		String SpecialChar = "*%$#@!*%$#@%#$#%#$@%@$@%@$@%@$@%@$@%@$@%@%@!*%$#@!*%$#@!";
		String Numbers = "12345678901234567890";
		String Combined = CapitalLetters + SmallLetters + SpecialChar +Numbers;
		Random random = new Random();
		String password = "";
		for (int i=0;i<8;i++) {
			password+= String.valueOf(Combined.charAt(random.nextInt(Combined.length())));	
		}
				
		return password;

	}
	public void showCredentials(int choice) {
		first =obj.FirstName;
		switch(choice)
		{
		case 1:
			System.out.println("Dear "+first+" your generated credentials are as follows\n");
			System.out.println("Email:"+generateEmailId()+"@tech.abc.com\n");
			System.out.println("Password:"+generatePassword());
			break;
		case 2:
			System.out.println("Dear "+first+" your generated credentials are as follows");
			System.out.println("Email:"+generateEmailId()+"@adm.abc.com");
			System.out.println("Password:"+generatePassword());
			break;
		case 3:
			System.out.println("Dear "+first+" your generated credentials are as follows");
			System.out.println("Email:"+generateEmailId()+"@hr.abc.com");
			System.out.println("Password:"+generatePassword());
			break;
		case 4:
			System.out.println("Dear "+first+" your generated credentials are as follows");
			System.out.println("Email:"+generateEmailId()+"@legal.abc.com");
			System.out.println("Password:"+generatePassword());
			break;
		default:
			System.out.println();
		}
	}
}




