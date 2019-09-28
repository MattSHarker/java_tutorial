
class Statements
{
    public static void main(String[] args)
    {
        // if else statements
        int x = 10;
        int y = 5;

        if (x <  y)
        {
            System.out.println(x + " is less than " + y);
        }
        else if (x > y)
        {
            System.out.println(x + " is greater than " + y);
        }
        else
        {
            System.out.println(x + " is equal to " + y);
        }

        // the same thing but condensed
        if (x <  y)
            System.out.println(x + " is less than " + y);
        else if (x > y)
            System.out.println(x + " is greater than " + y);
        else
            System.out.println(x + " is equal to " + y);
        // NOTE: only works in there is only one line in the {}

        
        // boolean expressions
        System.out.println();
        if (x > y || x < y) // OR (&& for AND, ! for NOT)
        System.out.println(x + " is not equal to " + y);
        else
        System.out.println(x + " is equal to " + y);


        // ternary opetator
        // (condiditial) ? <happens if true> : <happens if false>
        x = 4;
        y = 6;
        String result = (x == y) ? " equals " : " does not equal ";
        System.out.println(x + result + y);

        
        // while loops
        double sum = 0.0;
        double term = 1.0;
        int k = 1;

        while (term >= 0.0000001) // arbitrary cutoff point
        {
            sum += term;
            term /= k;
            k++;
        }

        System.out.println("\nFinal sum (while): " + sum);

        // for loops
        sum = 0.0;

        for (int i = 1; i <= 100; i++)
            sum += 1.0/i;
        
        System.out.println("Final sum (for):   " + sum);


        // for-each loop
        System.out.println();
        int[] arr = { 2, 3, 5, 6, 8, 9 };
        for (int num : arr)
            System.out.println(num);

    }
}