package test;

public class Test {
	
	public String aString = "test_string";
	
	public String aField;

	public static String sField;
	public volatile int vField;
	public transient String tField;
	public synchronized long synchField;
	
	private String arrayField;
	
	public Integer anInteger = new Integer(1);

	public int foo(int number) {
		System.out.println("left");
		
		boolean check = number > 0;
		int a = 0;
		int b = 2;


		if (check) {

			a = 23 + Integer.parseInt("42");
			b = Math.round(Math.random() );
			return a + b;
		} else {
			b = Math.abs(number);
			String.valueOf(true);
			return b;
		}
	}

	
	private class Bar {
		private void method() {
			System.out.println();
			System.out.println();
			System.out.println();
		}
	}
	public void bar(int test) {
		System.out.println("aString");
	}

	public native void nativeMethod();
	
	public strictfp float strictfpMethod() {
		return 2.0f * 3.3f;
	}
}