class Methods
{
    /* methods can be place either before or after the main method
     * Java conventions does not state any preferences, but it is commonly
     * the last method of its file
     */


    // public: anything can access this method
    // static: indicates it's not associated with an object, but the class itself
    // int: the return type of the method
    public static int triple(int x)
    {
        return 3*x;
    }


    // private: only this class can access this method (see Classes.java for further info)
    // void means it returns nothing
    private static void countdown(int x)
    {
        for (int i = x; i >= 0; i--)
            System.out.println(i);
    }


    // methods can call other methods
    // no access modifier (aka default) means the method can be accessed only within the package
        // this is the only difference between default and public
    static int tripleFromDouble(double x)
    {
        return triple((int)x);
    }


    // the main method is where the program starts
    public static void main(String[] args)
    {
        // accessing methods
        int x = 5;
        int y = triple(x);
        System.out.println("The triple of " + x + " is " + y);

        double d = 4.334;
        x = tripleFromDouble(d);
        System.out.println("The triple of (int)" + d + " is " + x);

        System.out.println();
        countdown(5);
    }
}