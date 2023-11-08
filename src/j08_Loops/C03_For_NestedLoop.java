package j08_Loops;

public class C03_For_NestedLoop {
    public static void main(String[] args) {
        /*
        Bir loop body'de {loop}  farklı bir loop tanımlanmasıyla oluşan code blok'a nested loop denir.-> apt. daire döngüsü
        iç loop dış  loop'un her step'inde tekrar çalışır.en içteki lopp bitmeden dış lopp bitmez. ilk önce en içdeki lopp run olur
         */
        for (int kat = 1; kat <= 9; kat++) {//dış:other loop
            for (int daire = 1; daire <= 5; daire++) {//iç:inner loop
                System.out.println("kat :" + kat + " için daire no : " + daire);
            }
        }
    }
}