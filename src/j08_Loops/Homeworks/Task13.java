package j08_Loops.Homeworks;

public class Task13 {

    public static void main(String[] args) {
         /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli print eden code create ediniz..

        */
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(64+i) + " ");
            }
            System.out.println();
        }
    }
}