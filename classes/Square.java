// "extends" means the square class is inheriting the shape class
// anything that is not private in Shape is now also in here
class Square extends Shape
{
    // private items can only be accessed in the class itself
    private int sideLength;
    private int area;
    private int perimeter;

    // public items can be accessed anywhere
    public int publicSideLength;

    // default constructor
    public Square()
    {
        sideLength = 0;
        area = 0;
        perimeter = 0;
        sides = 4;  // inherited from Shape
    }

    // constructor that sets all info
    public Square(int sideLength)
    {
        // "this" keyword refernces the object's variables
        this.sideLength = sideLength;   
        area = sideLength*sideLength;
        perimeter = sideLength*4;
        sides = 4;  // inherited from Shape

        publicSideLength = sideLength;
    }

    // getters return info about the object
    // usefull for letting the user access private variables
    public int getSideLength()
    {
        return sideLength;
    }

    public int getArea()
    {
        return area;
    }

    public int getPerimeter()
    {
        return perimeter;
    }

    // setters set values of object
    // useful for letting the user access private variables
    public void setSideLength(int sideLength)
    {
        this.sideLength = sideLength;
        area = sideLength*sideLength;
        perimeter = sideLength*4;

        publicSideLength = sideLength;
    }

    public void print()
    {
        System.out.println("Side length: " + sideLength);
        System.out.println("Area:        " + area);
        System.out.println("Perimeter:   " + perimeter);
        System.out.println("Sides:       " + sides);   
    }

    
}