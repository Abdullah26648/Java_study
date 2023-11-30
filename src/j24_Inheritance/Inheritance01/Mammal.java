package j24_Inheritance.Inheritance01;

public class Mammal extends Animal {
    public Mammal() {
        System.out.println("Mammal with no parameter constructer called !!!");
    }
    public void feedswithmilk(){
        System.out.println("mammals feed their young with milk");
    }
    public void givesbirth(){
        System.out.println("mammals gives birth to their young");
    }

}
