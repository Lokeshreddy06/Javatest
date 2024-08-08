package bankAccountApp;

public class Savings extends Account{
	//List properties specific for savings account
		private int safetyDEpoId;
		private int safetyDepoKey;
	
	
		private static int safetyDepositBoxID =100;
		private  static int safetyDepositBoxKey=1000;
	//constructor to initialize specific properties of savings class
	public Savings(String name,String sSN,double deposit) {
		super(name, sSN, deposit);
		accountNumber ="1"+accountNumber;
		setSafetyDepositBox();
	
	}
		//List any methods specific to savings account
	public void showInfo() {
		super.showInfo();
		System.out.println(
				"your savings account details : "+
				"\n safetyDepositBoxID : "+safetyDEpoId+
				"\n safetyDepositBoxkey : "+safetyDepoKey+
				"\n Rate : "+rate+"%"
				);
	}
	
	public void setSafetyDepositBox() {
		 safetyDEpoId=safetyDepositBoxID;
		 safetyDepositBoxKey=(int)(1000+(Math.random()*9000));
		 safetyDepoKey=safetyDepositBoxKey;
		 safetyDepositBoxID++;
		
	}
	public void setSafetyDepositBoxKey(int key) {
		safetyDepoKey=key;
	}
	@Override
	public void setRate() {
		rate=getBaseRate()-0.25;
	}
}
