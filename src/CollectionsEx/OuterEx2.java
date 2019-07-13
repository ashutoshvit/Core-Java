//Write a programme to InnerClass where this is always pointing to Current Inner Class Object.

package CollectionsEx;


public class OuterEx2 {
	int x = 10;
	class Inner{
		int x=100;
		public void m1() {
			System.out.println("This x is pointing to inner X= "+x);
			System.out.println(this.x);
			System.out.println(OuterEx2.this.x);
		}
		
	}

	public static void main(String[] args) {
		new OuterEx2().new Inner().m1();

	}

}
