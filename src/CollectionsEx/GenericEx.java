package CollectionsEx;

class Gen<T>{
	T ob;
	Gen(T ob){
		this.ob=ob;
	}
	public void show() {
		System.out.println("The Type of Ob is"+ob.getClass().getTypeParameters());
	}
	public T getOb(){
		return ob;
	}
}
public class GenericEx {

	public static void main(String[] args) {
		Gen<String> gen = new Gen<String>("Ashutosh");
		gen.show();
		System.out.println(gen.getOb());
		
		Gen<Integer> g2=new Gen<Integer>(50);
		g2.show();
		System.out.println(g2.getOb());

	}

}
