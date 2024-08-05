package email;

import java.util.Scanner;

public class email {
  private String firstName;
  private String lastName;
  private String passWord;
  private String department;
  private String email;
  private int defaultPasswordLength=10;
  private int mailBoxCapacity=100;
  private String alternateEmail;
  
// using constructor to generate mandatory fields
public email(String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
	System.out.println(this.firstName+" "+this.lastName);
	
	this.department=setDepartment();
	//this.email=this.firstName+"."+this.lastName+"@"+this.department+"."+"reddytech.com";
	this.email=genarateEmail();
	
	this.passWord=setRandomPassword(defaultPasswordLength);
	
}
 // set the department
public String setDepartment() {
	System.out.println("deparment codes\n1 for sales\n2 for development\n3 for accounting\n0 for none\n enter the code:");
        Scanner scn= new Scanner(System.in);
        int depcode=scn.nextInt();
        if(depcode==1) {
        	return"sales";
        }else if(depcode==2) {
        	return "development";
        }else if(depcode==3) {
        	return "accounting";
        }else {
        	return"";
        }     
}

// Generating random password
public String setRandomPassword(int length) {
	String password="abcdefghijklmnopqrstuvwxyz0123456789!@#$%";
	char[] ranPassword= new char[length];
	for(int i=0;i<length;i++) {
		int rand=(int) (Math.random()*password.length());  // Math.random() method to genrate a random number
		ranPassword[i]=password.charAt(rand);
	}
	return new String(ranPassword);
	
}

// genarating email
public String genarateEmail() {
	String email=this.firstName+"."+this.lastName+"@"+this.department+"."+"reddytech.com";
	return email;
}
public int getMailBoxCapacity() {
	return mailBoxCapacity;
}

public void setMailBoxCapacity(int mailBoxCapacity) {
	this.mailBoxCapacity = mailBoxCapacity;
}

public String getAlternateEmail() {
	return alternateEmail;
}

public void setAlternateEmail(String alternateEmail) {
	this.alternateEmail = alternateEmail;
}

public String getPassWord() {
	return passWord;
}

public void setPassWord(String passWord) {
	this.passWord = passWord;
}
// method to show all the details
public String showDetails() {
	String s= "NAME : "+this.firstName+" "+this.lastName+
			"\nEmail : "+this.email+
			"\nmail box capacity : "+this.mailBoxCapacity+
			"\nYour Password : "+this.passWord;
	return s;
}

}
