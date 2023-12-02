package j24_Inheritance.Inheritance02;

public class Animal {
    int a;
    int m = 3;

    public Animal() {
        System.out.println("Animal with no parameter constructor called");
    }

    public Animal(int a) {
        System.out.println("Animal with 1 parameter constructor called");
    }

    public void mA() {
        System.out.println("Animal mA method called");
    }

    public void mM() {
        System.out.println("Animal mM method called");
    }
}