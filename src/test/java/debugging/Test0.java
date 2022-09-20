package debugging;

public class Test0 {
	
	public void demo() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		Test0 test = new Test0();
		test.demo();
		System.out.println("Hello main");
	}

}
