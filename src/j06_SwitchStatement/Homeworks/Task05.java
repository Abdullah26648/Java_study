package j06_SwitchStatement.Homeworks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/*
		TASK :
		Girilen note değerinin  aşağıdaki kurallara göre karşılığını print eden code create ediniz.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Lütfen gecerli not giriniz" print ediniz
		
		AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		switch() de int, byte, short, char, String kullanilir.

		 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Not giriniz: ");
        int note = scanner.nextInt();
        switch (note) {
            case 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,
                    27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49:
                System.out.println("D");
                break;
            case 50,51,52,53,54,55,56,57,58,59:
                System.out.println("C");
                break;
            case 60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79:
                System.out.println("B");
                break;
            case 80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100:
                System.out.println("A");
                break;
            default:
                System.out.println("Lütfen gecerli not giriniz");
        }
    }
}