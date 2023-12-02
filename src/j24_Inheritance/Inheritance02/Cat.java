package j24_Inheritance.Inheritance02;

public class Cat extends Mammal {
    int c = 2;
    int d = 7;

    public Cat() {
        super();
        System.out.println("Cat with no parameter constructor called");
    }

    public Cat(String str) {
        this();
        //this("ebikGabik"); --> Endless loop
        System.out.println("super.c = " + super.c);
        System.out.println("Cat with 1 parameter constructor called");
    }

    public void mC() {
        System.out.println("Cat mC method called");
    }

    @Override
    public String toString() {
        return
                "c=" + c +
                        ", d=" + d +
                        '}' + super.toString();
    }
}