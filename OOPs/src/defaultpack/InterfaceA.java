package defaultpack;

public interface InterfaceA {
void meth1();
	
	//Allowed from Java 1.8v
	default void meth2()//Abstract methods do not specify a body
	{
		
		System.out.println("default method a InterfaceA");
		this.meth4();
	}
	
	//Allowed from Java 1.8v
	static void meth3() {
		System.out.println("Static method of InterfaceA");
		//this.meth4(); C.E because we cant use this keyword inside a static area
		
	}
	
	//Allowed from Java 1.9v
	 private void meth4() { 
		  
		  System.out.println("private method of InterfaceA");
		  }
default void display() 
	 {
		 System.out.println("Class A display()");
	 }
	
	 	public static void main(String[] args) {
			
			System.out.println("main() of InterfaceA");
			InterfaceA.meth3();
		}	


}
