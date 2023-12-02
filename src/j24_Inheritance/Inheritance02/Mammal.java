package j24_Inheritance.Inheritance02;

public class Mammal extends Animal {
    int m = 1;
    int c = 4;

    public Mammal() {
        this('H');
        System.out.println("Mammal with no parameter constructor called");
    }

    public Mammal(char y) {
        super(34);
    }

    public void mC() {
        System.out.println("Mammal mC method called");
    }

    public void mM() {
        System.out.println("Mammal mM method called");
    }
}