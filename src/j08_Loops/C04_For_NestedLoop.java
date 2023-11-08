package j08_Loops;

public class C04_For_NestedLoop {
    public static void main(String[] args) {
        /*
        Bir loop body'de {loop}  farklı bir loop tanımlanmasıyla oluşan code blok'a nestedd loop denir.-> apt. daire döngüsü
        iç loop dış  loop'un her step'inde tekrar çalışır.en içteki lopp bitmeden dış lopp bitmez. ilk önce en içdeki lopp run olur

        task->: Asagidaki output'u print eden code create ediniz.
               Hafta: 1
                 Gun: 1
                 Gun: 2
                 Gun: 3
                 .....
               Hafta: 2
                 Gun: 1
                 Gun: 2
                 Gun: 3
                 ....
               Hafta: 3
                 Gun: 1
                 Gun: 2
                 Gun: 3
                 ....
        */

        for (int i = 1; i <4; i++) {
            System.out.println("Hafta: " + i);
            for (int j = 1; j <4; j++) {
                System.out.println(j!=3?"  Gun: " + j:"  Gun: " + j +"\n  ....");
            }
        }
    }
}