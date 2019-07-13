package FileEx;

public class HashCodeDemmo {

	int i;
	public HashCodeDemmo(int i) {
		this.i=i;
	}
	public int hashCode() {
		return i;
	}
	public String toString() {
		return i+" ";
	}
	public static void main(String[] args) {
		HashCodeDemmo hcm=new HashCodeDemmo(10);
		HashCodeDemmo hcm1=new HashCodeDemmo(20);
		System.out.println(hcm);
		
		System.out.println(hcm1);

	}

}
