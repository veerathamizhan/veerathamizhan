
import java.io.*;
import java.util.*;

abstract class Shape
{
    double a = 0.0, b = 0.0;

    abstract public void printArea();
}

class Rectangle extends Shape
{
    double area = 0.0;

    public void printArea()
    {
        System.out.println("ilakesh love score");
        System.out.println("----------");

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the ilaksh num:");
        this.a = in.nextDouble();

        System.out.println("Enter the ilaku partner num:");
        this.b = in.nextDouble();

        this.area = a * b;

        System.out.println("The total love is:" + this.area);
    }
}

class Triangle extends Shape
{
    double area = 0.0;

    public void printArea()
    {
        System.out.println("-----balaji love-----");
        System.out.println("----------");

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Base:");
        this.a = in.nextDouble();

        System.out.println("Enter the balaji love sccore:");
        this.b = in.nextDouble();

        this.area = 0.5 * a * b;

        System.out.println("The area of triangle is:" + this.area);
    }
}

class Circle extends Shape
{
    double area = 0.0;

    public void printArea()
    {
        System.out.println("-----Area of Circle-----");
        System.out.println("----------");

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Radius:");
        this.a = in.nextDouble();

        this.area = 3.14 * a * a;

        System.out.println("The area of circle is:" + this.area);
    }
}

public class Area
{
    public static void main(String[] args)
    {
        System.out.println("-----Finding the Area of Shapes:-----");

        Shape s;

        s = new Rectangle();
        s.printArea();

        s = new Triangle();
        s.printArea();

        s = new Circle();
        s.printArea();
    }
}