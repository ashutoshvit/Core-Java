package AbstractFactoryPattern;

public class MACFactory implements ButtonFactory {

	@Override
	public Button createButton() {
		System.out.println("Creating mac Button");
		return new MacButton();
	}

}
