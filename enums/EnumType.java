class EnumType
{
    public enum Day
    {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public enum Grade
    {
        A_PLUS (100), // calls constructor with value 100
        B_PLUS (90),
        C_PLUS (80),
        D_PLUS (70),
        F      (0)
        ;   // semicolon for when fields/methods follow

        private int grade;

        // initializes the value of the enum type
        private Grade(int grade)
        {
            this.grade = grade;
        }

        // methods
        private void printGrade()
        {
            System.out.println("Grade: " + grade);
        }

    }


    // enums with abstract methods
    // in enums, abstract methods must be implemented in EVERY enumeration
    public enum Types
    {
        ONE
        {
            public void printType()
            {
                System.out.print("one");
            }
        },
        TWO
        {
            public void printType()
            {
                System.out.print("two");
            }
        },
        THREE
        {
            public void printType()
            {
                System.out.print("three");
            }
        };

        // abstract method
        public abstract void printType();
    }


    public static void main(String[] args)
    {
        // initializing an enum
        Day day = Day.SUNDAY;

        // enums in if and switch statements
        if (day == Day.SUNDAY)
            ;   // stuff here
        else if (day == Day.MONDAY)
            ;   // more stuff
        
        switch(day)
        {
            case SUNDAY: break;
            case MONDAY: break;
            // and so on
            default: break;
        }


        // iteration on the full enum collection
        for (Day d : Day.values())
        {
            System.out.println(d);
        }


        // enums with methods
        Grade grade = Grade.A_PLUS;
        System.out.println();
        grade.printGrade();


        // enums with abstract type
        Types one = Types.ONE;
        Types two = Types.TWO;

        System.out.print("\nOne: ");
        one.printType();
        System.out.print("\nTwo: ");
        two.printType();
    }
}