package JavaLearning;

public class Bank {
	private String accountNumber ;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	//constructor 1
	public Bank(String accountNumber , double balance , String customer , String email , String phoneNumber){
		this.accountNumber = accountNumber ;
		this.balance = balance ;
		this.customerName = customer ;
		this.email = email ;
		this.phoneNumber = phoneNumber ;
	}
	//constructor 2
	public Bank(String accountNumber, String customerName, String email) {
		this(accountNumber,555.0,customerName,email,"899798998");
	}

	public void setAccountNumber(String accountNumber){
		this.accountNumber = accountNumber ;
	}
	public String getAccountNumber(){
		return this.accountNumber ;
	}
	public void setBalance(double balance){
		this.balance = balance ;
	}
	public double getBalance(){
		return this.balance ;
	}
	public void setCustomerName(String customerName){
		this.customerName = customerName ;
	}
	public String getCustomerName(){
		return this.customerName ;
	}
	public void setEmail(String email){
		this.email = email ;
	}
	public String getEmail(){
		return this.email ;
	}
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber ;
	}
	public String getPhoneNumber(){
		return this.phoneNumber ;
	}
	public void deposit(double depositBalance){
		this.balance = this.balance + depositBalance ;
	}
	public void withDraw(double withDrawBalance){
		if (balance - withDrawBalance < 0 )
			System.out.println("Unable to Process withdraw.");
		else
			this.balance = this.balance - withDrawBalance ;
			System.out.println("Withdrawl Processed ");
	}
}
