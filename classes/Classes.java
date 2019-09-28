/* Compiling multiple files:
 *   javac Main.java Class1.java Class2.java ...  // order doesn't matter
 *   java Main
 */

class Classes
{
    public static void main(String[] args)
    {
        // create a default square object
        Square square = new Square();
        System.out.println();
        printSquareInfo(square);
        
        // updating values via setSideLength()
        square.setSideLength(5);
        System.out.println();
        square.print();

        // accessing public variables
        System.out.println("\npublicSideLength: " + square.publicSideLength);

        // using inherited methods and variables
        System.out.println("\nSquares have " + square.getSides() + " sides");
        System.out.println("Squares have " + square.sides + " sides");
    }

    // method taking in an object
    public static void printSquareInfo(Square square)
    {
        System.out.println("Side length: " + square.getSideLength());
        System.out.println("Area:        " + square.getArea());
        System.out.println("Perimeter:   " + square.getPerimeter());
    }
}