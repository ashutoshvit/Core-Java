package AbstractFactoryPattern;

public class AbstractFactoryTest {
	public static void main(String[] args) {
		Button bt=GUIFactory.createButton();
		bt.paint();
	}

}
