package j20_StaticKeyword.Homeworks;

import java.util.Scanner;

public class Task04_Bicycle_Runner {
    /*
    Task 04->
    Bisiklet Class :Properties(fields) : hiz, vites
    method  :hizdegistir(int yeniHiz), vitesArtir()-> 1 değer vites artırıyor,
    vitesAzalt() -> 1 deger vites azaltıyor, durumGoster -> O andaki hızı ve vitesi gösteriyor
    vites 5 den büyük ve 1 den küçük olamaz.
    yukarıdaki methodları seçtirilen islemYap methodu ile Runner class'da obj ile methodları çalıştırınız
    Trick -> Kullanıcıya metodlarla iligli bir menü veriniz.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Bicycle bicycle = new Bicycle();

        int choice;
        do {
            System.out.println("Bicycle Menu:");
            System.out.println("1. Change Speed");
            System.out.println("2. Increase Gear");
            System.out.println("3. Decrease Gear");
            System.out.println("4. Show Status");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter new speed: ");
                    int newSpeed = scanner.nextInt();
                    bicycle.hizDegistir(newSpeed);
                    break;
                case 2:
                    bicycle.vitesArtir();
                    break;
                case 3:
                    bicycle.vitesAzalt();
                    break;
                case 4:
                    bicycle.durumGoster();
                    break;
                case 0:
                    System.out.println("Exiting Bicycle Menu. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 0);
    }
}