package j08_Loops.Homeworks;

public class Task14 {

    public static void main(String[] args) {

        //  Task->  0 ile 100 arasındaki bütün çift sayıları print eden code create ediniz.
        //  Not: 0 ve 100 dahildir.
        for (int i = 0; i <= 100; i+=2) {
            if (i != 100 ) {
                System.out.print(i+" - ");
            } else {
                System.out.println(i);
            }

        }
    }
}