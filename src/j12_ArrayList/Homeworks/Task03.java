package j12_ArrayList.Homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Task ->  bir listte istenen sayının varlığı kontrol eden code create ediniz.
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer>sayiList = new ArrayList<>(Arrays.asList(1,3,6,78,94,23,54,4,89,34));
        System.out.println(sayiList);
        System.out.println("Number: ");
        int number = scanner.nextInt();
        boolean answer = false;
        for (int i = 0; i < sayiList.size(); i++) {
            if (sayiList.contains(number)){
                answer = true;
            }
        }
        System.out.println(answer);
    }
}