package ProxyPattern;
import java.lang.Exception;
/*Proxy design pattern is very simple, but very effective. Proxy pattern provide a surrogate or placeholder for another object to control access 
 * to it.

Proxy design pattern allows us to create a wrapper class over real object. Wrapper class which is proxy, controls access to real object so in turn
 we can add extra functionalities to real object without changing real object's code. A very simple real life scenario is our office internet, 
 which restricts few site access. The proxy first checks the host you are connecting to, if it is not part of restricted site list, then it connects
  to the real internet.

There are four common situations in which the Proxy pattern is applicable:

1) A remote proxy provides a local representative for an object that resides in a different address space. This is what the "stub" code in RPC and
 CORBA provides.

2) A virtual proxy is a placeholder for "expensive to create" objects. The real object is only created when a client first requests/accesses the 
object.

3) A protective proxy controls access to a sensitive master object. The "surrogate" object checks that the caller has the access permissions 
required prior to forwarding the request.

4) A smart proxy interposes additional actions when an object is accessed.

*/
public class ProxyDemo {
	 
    public static void main(String a[]){
         
        Internet intConn = new InternetProxy();
        try {
            intConn.connectTo("java2novice.com");
            intConn.connectTo("adult-site.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}