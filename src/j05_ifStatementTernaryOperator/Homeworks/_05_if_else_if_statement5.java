package j05_ifStatementTernaryOperator.Homeworks;

public class _05_if_else_if_statement5 {

    public static void main(String[] args) {

    /*  90.25 ve 90.25 değerinde iki double oluşturun.
        Eğer ilk double, ikinci double'dan büyükse  "Hello World" yazdırın.
        Eğer ilk double, ikinci double'dan küçükse "Not Hello World" yazdırın.
        Aksi halde (else) "I love java" yazdırın. */
        double number = 90.25;
        double number2 = 90.25;

        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.
        if (number > number2) {
            System.out.println("Hello World");
        } else if (number < number2) {
            System.out.println("Not Hello World");
        } else {
            System.out.println("I love java");
        }




    }
}
