class Arrays
{
    public static void main(String[] args)
    {
        // two methods of declaring an array
        int[] intArr;
        double dblArr[];
        // both methods are correct, but the first is easier to read IMO

        // works for all primitive types (chars, Strings, bools...)
        // MyClass[] classArr; // class arrays are also possible

        // initializing an array
        int[] arr1 = new int[10];   // array of length 10
        int[] arr2 = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };  // the array literal is the bit inside the brackets
        int[] arr3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // same as arr2, but more modern

        // !!! the array length can NOT be changed !!!


        // accessing elements
        int[] arr = new int[5];

        // setting values to the array
        for (int i = 0; i < 5 ; ++i)
            arr[i] = i+1;

        // a safer way to do this...
        for (int i = 0; i < arr.length ; ++i)
            System.out.println(arr[i]);
        //... in the original, if the size of the array changed, the for loop might not change
            // this fix ensure the full array is iterated through every time
        

        // multidimensional arrays
        int[][] mdArr = new int[5][10];

        mdArr[4][2] = 10;

        // iterating multidimensional arrays
        for (int i = 0; i < mdArr.length; ++i)
        {
            for (int j = 0; j < mdArr[i].length; ++j)
            {
                mdArr[i][j] = i * j;
            }
        }

        for (int i = 0; i < mdArr.length; ++i)
        {
            System.out.println();

            for (int j = 0; j < mdArr[i].length; ++j)
                System.out.print(mdArr[i][j] + " ");

        }
    }
}