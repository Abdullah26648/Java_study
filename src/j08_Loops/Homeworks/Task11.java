package j08_Loops.Homeworks;

public class Task11 {
    public static void main(String[] args) {

        /*
        A               //1. satıra 1 harf
        A B             //2. satıra 2 harf
        A B C           //3. satıra 3 harf
        A B C D
        A B C D E
        A B C D E F
        şekli print eden code create ediniz.  65=A'nın ascıı değeri

        */
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(64 + j) + " ");
            }
            System.out.println();
        }
    }
}