// The purpose of an abstract class is to be inherited for subclasses
// Instances of abstract classes cannot be created, therefor they are
    // not useable in their abstract state

// use the "abstract" keyword to make an abstract class
public abstract class AbstractClass
{
    // abstract classes can have abstract methods
    public abstract void abstractMethod();

    // abstract methods can be usefull for detailing the steps of a process
    public void process()
    {
        stepOne();
        stepTwo();
        stepThree();
    }

    public void stepOne()
    {
        // implemented here in abstract superclass
    }

    public abstract void stepTwo();
    public abstract void stepThree();
}
