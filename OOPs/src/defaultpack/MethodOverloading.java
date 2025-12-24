package defaultpack;



public class MethodOverloading {

	private void meth1() {
		System.out.println(10);
	}
	static final int meth1(int a) 
	{
		System.out.println(20);
	return a;
	}
	static public void meth1(int a,String s) {
		System.out.println(30);
	}
	void meth1(String s,int a) {
		System.out.println(40);
	}
	final protected String meth1(String a) {
		System.out.println(50);
		return a;
	}
	static StringBuffer meth1(StringBuffer a) {
		System.out.println(60);
		return a;
	}
	void meth1(byte b) {
		System.out.println(70);
	}
	public static void main(String[] args) {
		
		MethodOverloading aobj=new MethodOverloading(); 
		
		aobj.meth1();
		aobj.meth1(1000);
		aobj.meth1(1000,"Java");
		aobj.meth1("Java",1000);
		aobj.meth1("Java");
		//aobj.meth1(new StringBuffer("Java"));
		StringBuffer sb=new StringBuffer("Java");
		aobj.meth1(sb);
		aobj.meth1((byte)10);
		System.out.println("----------------");
		MethodOverloading.main(1000);
		MethodOverloading.main();
		}
		
	public static void main(int a)	
	{
		System.out.println("1st main()");
	}
	public static void main() {
		System.out.println("2nd main()");
	}
	/*
	 * MethodOverloading() { //this();//c.e because recursive constructor invocation
	 * this(500); System.out.println("Default constructor");
	 * System.out.println("----------------");
	 * 
	 * } MethdOverloading(int a); { System.out.println("Parameterized constructor");
	 * 
	 * }
	 */
			
	}