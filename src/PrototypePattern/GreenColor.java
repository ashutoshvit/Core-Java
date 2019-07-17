package PrototypePattern;

public class GreenColor extends Color{
	 
    public GreenColor() {
        this.colorName = "Green";
    }
 
    @Override
    void fillColor() {
        System.out.println("filling green color...");
    }
}