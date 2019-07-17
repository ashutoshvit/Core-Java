package PrototypePattern;

public abstract class Color implements Cloneable {
	protected String colorName;
    
    abstract void fillColor();
     
    public Object clone(){
         
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
