package j24_Inheritance.Task01;

public class Runner {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("a.ricetteDolceFacili = " + a.ricetteDolceFacili);
        System.out.println("A.ricetteDolceFacili = " + A.ricetteDolceFacili);

        B b = new B();
        System.out.println("b.ricetteDolceFacili = " + b.ricetteDolceFacili);
        System.out.println("B.ricetteDolceFacili = " + B.ricetteDolceFacili);
    }
}