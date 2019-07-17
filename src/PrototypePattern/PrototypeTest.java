package PrototypePattern;
/*The prototype pattern is a creational design pattern. Prototype patterns is required,
 *  when object creation is time consuming, and costly operation, so we create object with existing object itself. One of the best available way to
 *   create object from existing objects are clone() method. Clone is the simplest approach to implement prototype pattern. However, it is your call
 *    to decide how to copy existing object based on your business model.

If you are using clone method, then it is upto you to decide whether go for shallow copy or deep copy based on your business need. Here is the UML 
structure of the Prototype design pattern:*/
public class PrototypeTest {
	public static void main(String a[]){
        ColorStore.getColor("red").fillColor();
        ColorStore.getColor("green").fillColor();
        ColorStore.getColor("green").fillColor();
        ColorStore.getColor("red").fillColor();
    }

}
