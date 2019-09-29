
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

        
        // switch case
        // switch statements can be done on all primitive types (including bytes and String) and enums 
        System.out.println();
        char grade = 'c';
        switch(grade)
        {
            case 'a':
                System.out.println("90-100");
                break;
            case 'b':
                System.out.println("80-89");
                break;
            case 'c':
                System.out.println("70-79");
                break;
            case 'd':
                System.out.println("60-69");
                break;
            case 'f':
                System.out.println("0-59");
                break;
            default:
                System.out.println("Grade not found");
                break;
        }

        // not using break statements will cause fallthrough
        System.out.println();
        int countdown = 5;
        switch(countdown)
        {
            case 10: System.out.println("Ten");
            case  9: System.out.println("Nine");
            case  8: System.out.println("Eight");
            case  7: System.out.println("Seven");
            case  6: System.out.println("Six");
            case  5: System.out.println("Five");
            case  4: System.out.println("Four");
            case  3: System.out.println("Three");
            case  2: System.out.println("Two");
            case  1: System.out.println("One");
            case  0: System.out.println("Zero"); break;
            default: System.out.println("Houston we have a problem"); break;
        }

    }
}