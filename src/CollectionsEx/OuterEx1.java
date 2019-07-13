package CollectionsEx;

public class OuterEx1 {
	static int x = 10;
	int y = 20;
	class Inner{
		public void m1() {
			System.out.println(x);
			System.out.println(y);
		}
		
		
	}

	public static void main(String[] args) {
		new OuterEx1().new Inner().m1();
		

	}

}
