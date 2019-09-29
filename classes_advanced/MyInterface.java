// interfaces not located in the same package must be imported
// import path.to.interface

// use the "interface" keyword to create an interface
public interface Interface
{
    public int num = 10;
    
    public int square(int i);

    // interfaces can also have static methods
    // static methods must be implemented
    public static void printHello()
    {
        System.out.println("Hello");
    }
}

/* The following file types can implement interfaces:
 *  Classes
 *  Abstract classes
 *  Nested classes
 *  Enums
 *  Dynamic proxies
 */

// Interfaces are similar to classes, but they can only contain method
    // signatures and fileds
// no method implementations are allowed, only the signature

// the following can 
