//for the method local variable we cann't access local variable in which we declared it but if we define local variable as final variable then we can access it.

package CollectionsEx;


public class OuterEx4 {

	int x = 10;
	public void m1() {
		final int y=20;
		class Inner{
			public void m2() {
				
				System.out.println(x);
				System.out.println(y);
			}
		}
		Inner i=new Inner();
		i.m2();
	}
	public static void main(String[] args) {
		new OuterEx4().m1();

	}

}
