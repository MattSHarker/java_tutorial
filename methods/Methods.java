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

    // private: only this class can access this method (see classes.java for further info)
    // void means it returns nothing
    private static void countdown(int x)
    {
        for (int i = x; i >= 0; i--)
            System.out.println(i);
    }

    // the main method is where the program starts
    public static void main(String[] args)
    {
        // accessing methods
        int x = 5;
        int y = triple(x);
        System.out.println("The triple of " + x + " is " + y);

        System.out.println();
        countdown(5);
    }
}