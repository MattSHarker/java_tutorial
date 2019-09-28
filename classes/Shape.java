class Shape
{
    // protected is similar to public, but restricts items to the package it is in
    protected int sides;

    public Shape()
    {
        sides = 0;
    }

    public Shape(int sides)
    {
        this.sides = sides;
    }

    public int getSides()
    {
        return sides;
    }

    public void setSides(int sides)
    {
        this.sides = sides;
    }
}