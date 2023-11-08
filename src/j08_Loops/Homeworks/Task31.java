package j08_Loops.Homeworks;

public class Task31 {

    public static void main(String[] args) {
        /*
            1
            1  2
            1  2  3
            1  2  3  4.

         */
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j!=4?j+" ":j+".");
            }
            System.out.println();
        }
    }
}