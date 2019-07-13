package CollectionsEx;

public class Outer {

	class Inner{
		public void m1() {
			System.out.println("Inner Class");	
		}
		public void m2() {
			Inner m=new Inner();
			m.m1();
		}
	}

	
	public static void main(String[] args) {
		Outer i = new Outer();
		Outer.Inner o= i.new Inner();
		o.m2();
			}

}
