package j20_StaticKeyword.Homeworks;

public class Rectangle{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double calculatePerimeter() {
        return 2 * (width + length);
    }

    public double calculateArea() {
        return width * length;
    }
}