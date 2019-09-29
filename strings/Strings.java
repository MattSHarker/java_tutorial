class Strings
{
    public static void main(String[] args)
    {
        // creating a string
        String string = new String("The quick brown fox jumped over the lazy dogs");
        
        // easier way to create a string
        String str = "Shorter way to make a string";
        System.out.println("contents of string: " + string);
        System.out.println("contents of str:    " + str);

        // escape character work the same way as every other language
        System.out.println("\nThis is on a new line");
        System.out.println("\tThis is one tab in");

        // concatenating string
        String hw = "Hello " + "World";
        System.out.println("\nContents of hw: " + hw);

        // string length
        System.out.println("\nThe length of str is: " + str.length());

        // substrings
        String fullStr = "abcdefghijklmnopqrstuvwxyz";
        String subStr = fullStr.substring(5, 10);   // includes start index, exludes ending index
        System.out.println("\nThe substring: " + subStr);

        // comparing string
        // string can't be compared with ==, use .equals()
        String str1 = new String("Hello World");
        String str2 = new String("Hello World");
        String str3 = new String("hello world");
        
        System.out.println("\nstr1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);

        System.out.println("str1 equals str2  : " + str1.equals(str2));
        System.out.println("str1 equals str3: " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3));

        // splitting strings
        String full = "The quick brown fox jumped over the lazy dogs";
        String[] parts = full.split(" ");   // splitting the string by spaces " "

        System.out.println();
        for (int i = 0; i < parts.length; ++i)
            System.out.println("parts[" + i + "]: " + parts[i]);

        // converting to Upper or Lowercase
        String randomCase = "hELlo WoRld";
        String allUpper = randomCase.toUpperCase();
        String allLower = randomCase.toLowerCase();

        System.out.println("\nrandomCase: " + randomCase);
        System.out.println("allUpper:   " + allUpper);
        System.out.println("allLower:   " + allLower);
    }
}