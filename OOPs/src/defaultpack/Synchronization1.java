package defaultpack;


	public class Synchronization1 extends Thread
	{
		public void run() {
			
	 criticalResource();
	 }
	synchronized void criticalResource() {
		String name=Thread.currentThread().getName();
		System.out.println(name+"has entered Critical Resource");
		for(int i=1;i<=5;i++) 
		{
			System.out.println(name+"i value :"+i);
		}
		
		System.out.println(name+"has completed its execution");
	}
	public static void main(String[] args) {
		Synchronization1 aobj=new Synchronization1();
		Thread t1=new Thread(aobj);
		Thread t2=new Thread(aobj);
		
		t1.setName("First-Thread");
		t2.setName("Second-Thread");

		t1.start();
		t2.start();
	}
	}
	/*  
	 thread.join() stops the execution of current execution thread until the joined thread completes.
	  
	  synchronization prevents multiple threads from executing the synchronized part of code
	  on the same instance
	*/


