package bankAccountApp;

import java.util.ArrayList;
import java.util.List;

public class BankAccountApp {
public static void main(String[] args) {
	List<Account> accounts=new ArrayList<Account>();
	
	String file="C:\\New folder\\NewBankAccounts.csv";
	List<String[]> newAccountHolders=CSV.read(file);
	
	
	for(String[] accountHolder : newAccountHolders) {
		String name=accountHolder[0];
		String sSN=accountHolder[1];
		String accountType=accountHolder[2];
		double initBalance=Double.parseDouble( accountHolder[3] );// convert string to double
		
		if(accountType.equals("Savings")){
			
			accounts.add(new Savings(name,sSN,initBalance));	
		}else if(accountType.equals("Checking")) {
			
			accounts.add(new Checking(name,sSN,initBalance));
		}else {
			System.out.println("no data");
		}
	}
	
	for(Account acc:accounts) {
		acc.showInfo();
		System.out.println("=========================");
	}
	//read a CSV file and create accounts based on that data
	
}
}
