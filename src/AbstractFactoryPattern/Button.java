package AbstractFactoryPattern;

/*The abstract factory pattern provides a way to encapsulate a group of individual factories that have a common theme without specifying
 *  their concrete classes. In normal usage, the client software creates a concrete implementation of the abstract factory and then uses 
 *  the generic interface of the factory to create the concrete objects that are part of the theme. The client doesn't know (or care) which
 *   concrete objects it gets from each of these internal factories, since it uses only the generic interfaces of their products. 
 *   This pattern separates the details of implementation of a set of objects from their general usage and relies on object composition,
 *    as object creation is implemented in methods exposed in the factory interface.

A factory is the location of a concrete class in the code at which objects are constructed. The intent in employing the pattern is to 
insulate the creation of objects from their usage and to create families of related objects without having to depend on their concrete 
classes. This allows for new derived types to be introduced with no change to the code that uses the base class.

Take an example, lets create a button factory. This button factory would be common across multiple operating systems and should create the
 button depends on underlying operating system. Here is the sample code:
 * 
 * 
 * */
public interface Button {
	public void paint();

}
