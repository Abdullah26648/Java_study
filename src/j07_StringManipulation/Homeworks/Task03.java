package j07_StringManipulation.Homeworks;
public class Task03 {
    public static void main(String[] args) {
        // Task -> "Alamanya" Stringindeki ikinci 'a' karakterinin indexini print eden code create ediniz
        String str = "Alamanya";
        System.out.println("Bize verilen "+str+" icindeki ikinci 'a' karakterin index numarasini buluyoruz.");
        // Hedef karakterimizi belirliyoruz.
        char hedefChar = 'a';
        // Hedef karakterimizin ilk indexini buluyoruz.
        int ilkChar = str.indexOf(hedefChar);
        // Hedef karakterimizin String icinde oldugu ve olmadigi durumlari sorguluyoruz.
        if (ilkChar != -1) {
            // Hedef karakterimizin 2. kez gectigi indexi buluyoruz.
            int ikinciChar = str.indexOf(hedefChar, ilkChar + 1);
            // Hedef karakterimizin 2. kez String icinde olup olmadigi durumlari sorguluyoruz.
            if (ikinciChar != -1) {
                int ucuncuChar = str.indexOf(hedefChar,ikinciChar + 1);
                if (ucuncuChar != -1) {
                    int dorduncu = str.indexOf(hedefChar,ucuncuChar + 1);
                    if (dorduncu != -1){
                        System.out.println("dorduncu 'a' nin index numarasi: " + dorduncu);
                    } else {
                        System.out.println("dorduncu yok !!!!");
                    }
                    System.out.println("Ucuncu 'a' nin index numarasi: " + ucuncuChar);
                }
                // Hedef karakterimizin 2. kez gectigi indexi yazdiriyoruz.
                System.out.println("ikinci 'a' nin index numarasi: " + ikinciChar);
            } else {
                System.out.println("Bu string ikinci bir 'a' icermiyor.");
            }
        } else System.out.println("Bu string icinde 'a' yok.");
    }
}