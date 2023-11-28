package j23_Encapsulation.Encapsulation03;

public class AracRunner {
    public static void main(String[] args) {

        Arac araba1 = new Arac("Toyota", "Kirmizi", 900, 2020);
        Arac araba2 = new Arac("Honda", "Mavi", 1200, 2019);
        Arac araba3 = new Arac("Ford", "Sari", 800, -2022);

        printArabaInfo(araba1);
        printArabaInfo(araba2);
        printArabaInfo(araba3);
    }

    private static void printArabaInfo(Arac araba) {
        System.out.println("Model: " + araba.getModel());
        System.out.println("Renk: " + araba.getRenk());
        System.out.println("Motor: " + araba.getMotor() + " cc");
        System.out.println("Yil: " + araba.getYil());
        System.out.println();
    }
}