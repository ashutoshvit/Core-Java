package BuilderPattern;
/*The builder pattern is an object creation design pattern.

The builder pattern is a design pattern that allows for the step-by-step creation of 
complex objects using the correct sequence of actions. The construction is controlled by a director object that only needs to know the 
type of object it is to create. The diagram shows the structure of the builder pattern

Builder Pattern

Below example shows each component from the above diagram as a seperate class. This sample example trying to create a camara object based
 on the customer needs.*/
public class CamaraOnlineSeller {
	 
    public static void main(String a[]){
        CamaraMaker cm = new CamaraMaker();
        System.out.println("Creating camara with optical zoom...");
        CamaraBuilder ozcb = new OpticalZoomCamaraBuilder();
        cm.setCamaraBuilder(ozcb);
        cm.constructCamara();
        Camara cam = cm.getCamara();
    }
}