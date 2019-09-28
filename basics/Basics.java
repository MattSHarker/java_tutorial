
// files must contain a class, standard is one class per file
class Basics
{
    // this is the main method, the very first one that runs, must be
    // written exactly as listed (except for args but that is standard form)
    // args is for command line arguments
    public static void main(String[] args)
    {
        // declaring variables
        int m, n;
        double x, y;
        boolean b = false;  // declaring and initializing
        char ch = 'x';

        // numeric expressions
        // basically works like every other language;
        m = 3 * (6 - 2);

        y = 3;
        x = y / 3.14159265;

        n = m % 3;


        // integer vs real division
        double f;
        f = 1/3;        // f is now 0.0
        System.out.println("Result of f = 1/3:     " + f);

        f = 1.0/3.0;    // f is now 0.33333...
        System.out.println("Result of f = 1.0/3/0: " + f);
        

        // type conversion (casting)
        double radians = 1.5;
        int degrees;

        // some types need to be explicity cast to others
        degrees = (int)(radians * 180.0 / 3.14159265);
        System.out.println("\nRadians: " + radians);
        System.out.println("Degrees: " + degrees);

        // but some types can be implicitly cast
        radians = degrees * 3.14150265 / 180.0;

        // the basic rule of thumb is if information is lost, it needs to
        // be explicity cast
    }
}