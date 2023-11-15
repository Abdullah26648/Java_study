package j11_Arrays.Homeworks;

public class Task11 {
    public static void main(String[] args) {
        /*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup print eden code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";

        String[] array = str.split(" ");

        int sumDollar = 0;
        int sumPound = 0;

        for (String value : array) {
            if (value.startsWith("$")) {
                sumDollar += Integer.parseInt(value.substring(1));
            } else if (value.startsWith("£")) {
                sumPound += Integer.parseInt(value.substring(1));
            }
        }

        System.out.println("Total sum of values with '$' sign: $" + sumDollar);
        System.out.println("Total sum of values with '£' sign: £" + sumPound);
     }
}