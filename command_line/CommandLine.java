// this program will take in either 1 or 2 command line arguments
// in this case, the number of arguments is arbitrary

/* to use command line arguments with javac:
 *    javac <filename>.java
 *    java <filename> arg1 arg2 arg3 ...
 */

class CommandLine
{
    // checks for the correct amount of arguments
    public static void checkArguments(String[] args)
    {
        // ensure correct length
        if (args.length == 0)
        {
            System.out.println("Not enough arguments");
            System.out.println("Please enter only 1 or 2 command line arguments");
            System.exit(1);
        }
        else if (args.length > 2)
        {
            System.out.println("Too many arguments");
            System.out.println("Please enter 1 or 2 command line arguments");
            System.exit(2);
        }
        // otherwise correct length and do nothing
    }

    public static void main(String[] args)
    {
        // passing arguments to a function
        checkArguments(args);

        // accessing arguments
        if (args.length == 1)
            System.out.println("The argument: " + args[0]);
        if (args.length == 2)
            System.out.println("The arguments: " +args[0] + ", " + args[1]);
    }
}