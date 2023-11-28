package j12_ArrayList.Homeworks;

import java.util.ArrayList;

public class Task15 {

    /* TASK :
    100 den kucuk asal sayilari print eden  code create ediniz.
     */
    public static void main(String[] args) {
        ArrayList<Integer> primeNumbers = findPrimeNumbers(100);

        System.out.println("Prime numbers less than 100: " + primeNumbers);
    }

    private static ArrayList<Integer> findPrimeNumbers(int limit) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        for (int i = 2; i < limit; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }

        return primeNumbers;
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}