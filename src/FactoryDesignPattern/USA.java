package FactoryDesignPattern;

public class USA implements Currency{

	@Override
	public String getCurrency() {
		
		return "Doller";
	}

	@Override
	public String getSymbol() {
		
		return "$";
	}

}
