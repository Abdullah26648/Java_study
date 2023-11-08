package j07_StringManipulation.Homeworks;
import java.util.Scanner;
public class Task02 {
    public static void main(String[] args) {
        /*  Task->
		Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
		a)Ilk karakteri buyuk harf olmalı
		b)Son karakteri sayi olamlı
		c)en az 6 karakter uzunlugunda olmalı */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Password: ");
        String password = scanner.nextLine();
        // -->  ^[A-Z]  <-- ile ilk karakterin buyuk harfli ve --> .*\d$ <--- ile son karakterin sayil olma kosulunu tanimladik, son olarak girilen sifrenin 6 ve daha buyuk olmasi kosulunu --> password.length() >= 6 <-- ile ekledik.
        System.out.println(password.matches("^[A-Z].*\\d$") && password.length() >= 6);
    }
}