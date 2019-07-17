package FactoryDesignPattern;
/*The factory method pattern is a creational pattern. It deals with the problem of creating objects without specifying
the exact class of object that will be created. Lets brief this, in real programing world, we need to create different 
objects with similar functionality. Lets say, we need Currency objects based on country. Now you define an interface called Currency,
 and specify your functionality in the form of method. Now implement this interface for different countries, and each method 
 implementation will be specific to the country.

//Now how can I create objects? Create a factory class and provide a static method to get required object. 
 * This method should take input, here input can be country name. Based on the country value, create specific country object,
 *  and return it. In this page you can see java code example for this.
 */

//Now lets come to the definitions: the factory method pattern is a creational pattern which uses factory methods to deal with the problem of creating objects without specifying the exact class of object that will be created. This is done by creating objects via a factory method, which is either specified in an interface and implemented in implementing classes (concrete classes); or implemented in a base class, which can be overridden when inherited in derived classes; rather than by a constructor.//*

public class CurrencyFactory {
	public static Currency getCurrencyByCountry(String cnty) throws Exception{
		if("IN".equals(cnty)) {
			return new India();
		}
		else if("USA".equals(cnty)) {
			return new USA();
		}
		throw new Exception("Invalid Country");
	}
	public static void main(String[] args) {
		Currency usa;
		try {
			usa=CurrencyFactory.getCurrencyByCountry("USA");
			System.out.println("USA Currency  :  "+usa.getCurrency());
			System.out.println("Currency Symbol  :  " +usa.getSymbol());
		}
		catch(Exception ex) {ex.printStackTrace();}
	}

}
