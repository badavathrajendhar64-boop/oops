package defaultpack;


	public class Thread2 extends Thread
	{
	public void run() {
		
		String name=Thread.currentThread().getName();
		int priority=Thread.currentThread().getPriority();
		
		for(int i=1;i<5;i++)
		{
			System.out.println(name+"("+priority+")"+"has executed run():"+i);
		}
	}
	public static void main(String[] args) {
		Thread2 aobj=new Thread2();
		
		Thread t1=new Thread(aobj);
		Thread t2=new Thread(aobj);
		
		t1.setName("First-Thread");
		t1.setName("Second-Thread");
		
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(10);
		
		
		
		t1.start();//A new Thread will be created and that new
		//thread is responsible for run() present in Thread1 class
	
		t1.run();//No new thread will be created,we are directly calling
		//the run() present in thread class but Thread1 run() will be executed because of overriding
		
	    t2.start();//A new Thread will be created and that new
		//thread is responsible & it will run the run() method present in Thread Class
	    
	    t2.run();//No new Thread will be created, we are directly calling the run() present in Tread Class
	
	}
	}

/* Thread Schedular:
 ---------------
 It will decide which thread should start its execution basing upon two things
 
 ==>Thread priorities
 ==>Underlying os(h/w apparatus )
 
 thread Priorities:
 --------------------
 Thread priority varies between 1 to 10 
 Minimum priority :1
 normal Priority :5
 Maximum priority:10
 
 */

