
public class InsufficientBalanceException extends Exception{
	private double balance;
	private double withdrawamount;
	
	public InsufficientBalanceException(double balance, double withdrawamount) {
		super("Insufficient balance, available balance: "+balance+" But you have requested: "+withdrawamount);
		
		this.balance=balance;
		this.withdrawamount=withdrawamount;
	}
}
