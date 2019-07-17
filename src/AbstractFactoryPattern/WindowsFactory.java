package AbstractFactoryPattern;

public class WindowsFactory implements ButtonFactory{

	@Override
	public Button createButton() {
		/**
         * this method creates a button for windows 
         * button
         */
		System.out.println("Creating Windows Button");
		return new WindowsButton();
	}

}
