package j24_Inheritance.Inheritance02;

public class Runner {
    public static void main(String[] args) {
        Cat k1 = new Cat();
        System.out.println("k1.a = " + k1.a);
        System.out.println("k1.c = " + k1.c);
        System.out.println("k1.d = " + k1.d);
        System.out.println("k1.m = " + k1.m);

        System.out.println("   ***   ");

        Mammal k2 = new Cat("Dusty");
        System.out.println("k2.a = " + k2.a);
        System.out.println("k2.c = " + k2.c);
        //System.out.println("k1.d = " + k2.d);
        System.out.println("k2.m = " + k2.m);

        System.out.println("   ***   ");

        Animal k3 = new Cat("Rusty");
        System.out.println("k3.a = " + k3.a);
        System.out.println("k3.m = " + k3.m);
        //System.out.println("k3.c = " + k3.c);
        //System.out.println("k3.d = " + k3.d);

        /*
        Ahan da trick köşesinde böğün:inherit edilmiş herhangi bir obj varaible  Data type göre call edilir
        Variable araştırmaya data type Class'dan başlanıp parentlere gidilir
        */

        System.out.println("   ***   ");

        k1.mA();
        k1.mC();
        k1.mM();

        System.out.println("   ***   ");

        k2.mA();
        k2.mC();
        k2.mM();

        System.out.println("   ***   ");

        k3.mA();
        k3.mM();
    }
}