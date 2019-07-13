//Inner Class Inside a Method
package CollectionsEx;

public class OuterEx3 {
		public static void m1() {
			class Inner{
				public void sum(int x, int y) {
					System.out.println("Sum is ="+(x+y));
				} 
			}
			Inner i=new Inner();
			i.sum(10,20);
			i.sum(20, 30);
			i.sum(1, 1);
		}
			

	public static void main(String[] args) {
		new OuterEx3().m1();

	}

}
