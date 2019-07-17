package AdapterPattern;
/*An adapter pattern helps two incompatible interfaces to work together. This is the real world definition for an adapter.
 *  The adapter design pattern is used when you want two different classes with incompatible 
 * interfaces to work together. Interfaces may be incompatible but the inner functionality should suit the need. The Adapter pattern allows otherwise
 *  incompatible classes to work together by converting the interface of one class into an interface expected by the clients.

There are many real world examples, the simplest example is power socket and plug. American plug would not fit to British socket, and viceversa. We 
use power adapter to fix this issue. The adapter design pattern works exactly similar to power adapter. */
public class FurnanceRegulatorySystem {
	 
    public void regulateFurnanceTemperature(){
        /**
         * here some lines of code gives temperature in centigrade format 
         */
        FurnanceControllerAdapter fca = new FurnanceControllerAdapter();
        fca.controlFurnance(300);
    }
}