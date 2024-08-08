package bankAccountApp;

public class Checking extends Account{

	//List properties specific for checking account
	
	private static long debitCardNumber =123456789123L;
	private int debitCardPIN;
	private int debCardPin;
	private long debCardNum;
	
	//constructor to initialize specific properties of checking class
	
	public Checking(String name,String sSN,double deposit) {
		super(name, sSN, deposit);
		accountNumber ="2"+accountNumber;
		setDebitCardInfo();
	}
	//List any methods specific to checking account
	public void showInfo() {
		super.showInfo();
		System.out.println("Your cheching account details :"+
				" \nDebit card number : "+debCardNum+
				"\nDebit card Pin : "+debCardPin+
				"\n Rate : "+rate +"%"
				);
	}
	private void setDebitCardInfo() {
		debCardNum=debitCardNumber;
		debitCardNumber++;
		debitCardPIN=(int)(1000+(Math.random()*9000));
		debCardPin=debitCardPIN;
		
	}
	public void setDebitCardPin(int pin) {
		debCardPin=pin;
	}
	@Override
	public void setRate() {
		rate=getBaseRate()*0.15;
	}
}
