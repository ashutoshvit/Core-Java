package InterviewPrograms;

import java.util.HashMap;

public class HashCodeImplementation {
	public static void main(String args[]) {
		HashMap<Price,String> map=new HashMap<Price,String>();
		map.put(new Price("Banana",50), "Banana");
		map.put(new Price("Apple",100), "Apple");
		map.put(new Price("Pinapple",80), "Pinapple");
		map.put(new Price("Govava",60), "Govava");
		System.out.println(map);
	}

}
class Price{
	private String item;
	private int price;
	public Price(String item, int price) {
		super();
		this.item = item;
		this.price = price;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + price;
		return result;
	}


	@Override
	public String toString() {
		return "Price [item=" + item + ", price=" + price + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Price other = (Price) obj;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (price != other.price)
			return false;
		return true;
	}


	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
