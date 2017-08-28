package JavaLearning;

public class Main {

	public static void main(String[] args){
		Bank account1 = new Bank("123456", 15000, "Shyam", "Shyamk.iiit@gmail.com", "9992334");
		System.out.println(account1.getAccountNumber() + " " + account1.getBalance() + " " + account1.getCustomerName());
		account1.deposit(4);
		System.out.println(account1.getAccountNumber() + " " + account1.getBalance() + " " + account1.getCustomerName());
		account1.withDraw(3460.45);
		System.out.println(account1.getAccountNumber() + " " + account1.getBalance() + " " + account1.getCustomerName());
		
	}
	
	
}
