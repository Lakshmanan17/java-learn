package javaLearn;

public class getmoney {

	Long accountnumber=43484543884434l;
	String customername="Lakshmanan";
	int accountbalance=3000;
	public Integer getdetails() {
		System.out.println("Cardholder Name="+ customername);
		System.out.println("Collection Amount="+accountbalance);
		return accountbalance;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bank_account balance=new Bank_account();
		getmoney balance1=new getmoney();
		//balance.accountbalance();
		Integer amount=balance1.getdetails();
		System.out.println("I got the collection Amount is "+amount);

	}

}