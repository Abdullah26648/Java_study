package j29_Collection.p01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
        Task->
        Node değerleri "Murat","javaCAN","javaTAR","Abdi bey" olan bir linkedList create ediniz.
        Girilen bir String değeri linkedListte varlığını kontrol edip varsa silip "Agam eleman halledildi"
        yoksa "Agam aradığınız kişiye ulaşılamadı" print eden code create edinzi  */
        LinkedList<String> strList = new LinkedList<String>(Arrays.asList("Murat","javaCAN","javaTAR","Abdi bey"));
        Scanner scanner = new Scanner(System.in);
        String aganinAdami = scanner.nextLine();
        System.out.println(strList.remove("javaCAN") ? "Agam eleman halledildi" : "Agam aradığınız kişiye ulaşılamadı");
    }
}
