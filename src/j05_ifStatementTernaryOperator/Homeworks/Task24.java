package j05_ifStatementTernaryOperator.Homeworks;

import java.util.Scanner;

public class Task24 { public static void main(String[] args) {
        /*
        *Java ile gidilen kilometre verisine göre taksimetre tutarını  print eden code create ediniz.
        *Taksimetre kilometre başına 2.20 TL tutmaktadır.
        *Kısa mesafe tutarı 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
         */
    Scanner scanner = new Scanner(System.in);

    System.out.print("Gidilen kilometreyi girin: ");
    double gidilenKilometre = scanner.nextDouble();

    // Taksimetre açılış ücreti
    double acilisUcreti = 10.0;

    // Taksimetre kilometre başına ücret
    double kilometreBasinaUcret = 2.20;

    // Kısa mesafe tutarı
    double kisaMesafeTutari = 20.0;

    // Taksimetre tutarını hesapla
    double taksimetreTutari = (gidilenKilometre * kilometreBasinaUcret) + acilisUcreti;

    // Ternary operatörü kullanarak kısa mesafe kontrolü
    taksimetreTutari = (taksimetreTutari < kisaMesafeTutari) ? kisaMesafeTutari : taksimetreTutari;

    System.out.println("Taksimetre Tutarı: " + taksimetreTutari + " TL");
    }
}