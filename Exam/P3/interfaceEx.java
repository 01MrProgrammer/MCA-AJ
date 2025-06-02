// Interface for shape
interface Shape {
    double area();
    double perimeter();
}

// Interface extending Shape and adding color
interface ColorShape extends Shape {
    String color();
}

// Rectangle class implementing ColorShape interface
class Rectangle implements ColorShape {
    private double length;
    private double width;
    private String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public String color() {
        return color;
    }
}

// Main class
public class interfaceEx {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3, "Blue");
        System.out.println("Rectangle Details:");
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
        System.out.println("Color: " + rectangle.color());
    }
}
