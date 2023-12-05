package j25_Exceptions;

import java.util.Scanner;

public class C07_IllegalArgumentException {
    public static void main(String[] args) {
        /*
        ahan da TRİCK kosesinde bugun :)

        "throw" - throws" farkları
        1- "throws" -> main method kapanıs parantezi ile method body acılıs parantezi arasına yazılır.
           "throw" -> method body içinde tanımlanır.
        2- "throws" -> keywordden sonra birden fazla exception tanımlanabilir
           "throw" -> keywordden sonra sadece bir tane exception tanımlanır
        3- "throws" -> keywordden sonra sadece exception class name yazılır
            "throw" ->  keywordden sonra exception obj tanımlanır
        4- "throws" -> keyword method ilk satırda sadece bir kez tanımlanır
            "throw" -> keyword istenildiği kadar method body de tanımlanabilir.
        */


        // IllegalargumentException -> kullanılmasını istenmeyen değerlerde pr hata vermesi isteniyorsa bu excp fırlatılıer
        // ornek : yas datası için negatif değer girilidğinde pr kırılmadan run olması ama girilen değer için excp fırlatması için kullanılır..

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        try {
            if (age<18){
                throw new IllegalArgumentException("This "+age+" age doesn't enough for license and you need to wait ");
            } else {
                System.out.println("Congratulations.");
            }

            System.out.println("Tyr is here.");
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage()+(18-age)+" year.");
            System.out.println("This age doesn't enough for license.");
            System.out.println("Catch is here.");
        }

        System.out.println("App runned till the end.");
    }
}
