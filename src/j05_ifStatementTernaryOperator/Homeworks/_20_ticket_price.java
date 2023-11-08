package j05_ifStatementTernaryOperator.Homeworks;

import java.util.Scanner;

public class _20_ticket_price {

    public static void main(String[] args) {

        /* Task->
        Trafik cezasının değerini hesaplayın code create ediniz
        45 hız sınırıdır.
        Eğer hızınız 55-74 arasında ise:
        Ceza 100 $'dır.

        Eğer hızınız 75 - 84 arasında ise:
        Ceza 150 $'dır.

        Eğer hızınız 85 -94 arasında ise:
        Ceza 320 $'dır.

        Eğer hızınız 94'den daha fazla ise:
        Ceza 500 $'dır.

        ve ayrıca,
        Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

        Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.


        -----------------------------------------


        Örn;

        currentSpeed(Hızınız) 87
        ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

        sonuç 320 olmalıdır.

        currentSpeed(Hızınız) 65
        ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

        sonuç 300 olmalıdır.  */

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter current speed: ");
        int currentSpeed = scan.nextInt();
        System.out.print("Is driver licence available? (please answer True or False): ");
        boolean isDriverLicenceAvailable = scan.nextBoolean();

        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        if (currentSpeed >= 55 && currentSpeed < 74) {
            if (isDriverLicenceAvailable) {
                System.out.println("Ceza 100 $'dır.");
            } else {
                System.out.println("Ceza 300 $'dır.");
            }
            } else if (currentSpeed >= 75 && currentSpeed < 84) {
            if (isDriverLicenceAvailable) {
                System.out.println("Ceza 150 $'dır.");
            } else {
                System.out.println("Ceza 350 $'dır.");
            }
            } else if (currentSpeed >= 85 && currentSpeed < 94) {
            if (isDriverLicenceAvailable) {
                System.out.println("Ceza 320 $'dır.");
            } else {
                System.out.println("Ceza 520 $'dır.");
            }
            } else if (currentSpeed >= 95) {
            if (isDriverLicenceAvailable) {
                System.out.println("Ceza 500 $'dır.");
            } else {
                System.out.println("Ceza 700 $'dır.");
            }
        }
    }
}


