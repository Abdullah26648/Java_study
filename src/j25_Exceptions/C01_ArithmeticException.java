package j25_Exceptions;

import java.util.Scanner;

public class C01_ArithmeticException {
    /*
    try - catch içinde yapılan işlemlerden sonra mutlaka çalışması gereken block varsa finally  blok tanımlanır.
    hata alınır ama finaly tanımlanırsa catch çalışmasa bile
    pr akışı devam eder.finally block hata olsa da olmasa da calışır.
    Cloud database ortamlarında bağlantı kesmek için kullanılır.cloud ile connection yazdıgınızda code
    başarılı bir şekilde çalışırsa işlem bitiiğinde finally block ile connection kapanmazsa maliyet pahalı olur :(
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number 1: ");
        int number1 = scanner.nextInt();
        System.out.print("Please enter number 2: ");
        int number2 = scanner.nextInt();
        // int divide = number1 / number2;
        // System.out.println("Divide = " + divide);

        try {
            System.out.println("Try runned");
            System.out.println(number1/number2);
            System.out.println("Try waved at you");
        } catch (ArithmeticException exception) {
            System.out.println("Catch 1 runned");
            System.out.println("Number 2 can't be 0" + exception.getMessage());
            exception.printStackTrace();
            System.out.println("Catch 1 waved at you");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Catch 2 runned");
            System.out.println("Catch 2 waved at you");
        } catch (Exception e){
            System.out.println("Catch 3 runned");
            System.out.println("Catch 3 waved at you");
        } finally {
            System.out.println("Finally runned");
        }

        System.out.println("Good job your code is alive");
    }
}