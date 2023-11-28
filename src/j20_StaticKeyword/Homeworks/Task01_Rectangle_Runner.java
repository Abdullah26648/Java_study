package j20_StaticKeyword.Homeworks;

public class Task01_Rectangle_Runner {
    /*
    Task 01 >
    fields: width, length ve cevre ve alan hesaplayaan methodolan Rectangle isminde Class create ediniz.
    Runeer class'da obj ile cevre ve alan değerelrini print eden code create ediniz.
    */
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 8);

        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Area: " + rectangle.calculateArea());

    }
}