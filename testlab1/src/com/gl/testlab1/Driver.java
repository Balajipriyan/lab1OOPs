package com.gl.testlab1;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Please Enter the department from the following");
System.out.println("1.Technical");
System.out.println("2.Admin");
System.out.println("3.Human Resource");
System.out.println("4.Legal");

Scanner sc = new Scanner(System.in);
int select =sc.nextInt();
CredentialService credentialService = new CredentialService();
credentialService.showCredentials(select);
sc.close();
	}

}



