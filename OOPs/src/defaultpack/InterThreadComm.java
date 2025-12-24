package defaultpack;

public class InterThreadComm {
	int amount=1000;
	synchronized void with_draw(int amount) throws InterruptedException//15000
	{
	if(this.amount<amount)//10000<15000
	{
		System.out.println("Insufficient balance");
		wait(10000,500);
		System.out.println("Amount credited");
		this.amount-=amount;//20000-15000=5000
		System.out.println("with draw successful \n Balance is"+this.amount);
	}
	else {
		this.amount-=amount;
		System.out.println("with draw successful \nBalance is"+this.amount);
	}
	
	}
	
	synchronized void deposit(int amount)//1000
	{
		this.amount+=amount;//10000+10000=20000
		System.out.println("Deposited successfully \n Balance is"+this.amount);
	
		//notify();
		//notifyAll();
	}


}
