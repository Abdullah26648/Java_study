package j25_Exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class C08_DateTimeException {
    public static void main(String[] args) {
        try {
            LocalDate ld = LocalDate.of(2023,2,29);
            System.out.println("Tyr is here.");
        } catch (DateTimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Catch is here.");
        }

        System.out.println("App runned till the end.");
    }
}