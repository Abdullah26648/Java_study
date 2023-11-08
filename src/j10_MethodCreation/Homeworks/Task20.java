package j10_MethodCreation.Homeworks;

public class Task20 {
        /*
        task->
        Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarıni print eden METHOD create ediniz

        [$1 $12 €34 €56 $45 €78]
        dolarToplami: 58
        euroToplami: 168 */

    public static void main(String[] args) {
        String para="$1 $12 €34 €56 $45 €78";
        calculate(para);
    }
    private static void calculate(String para) {
        String[] divided = para.split(" ");
        int TotalDolar = 0;
        int Totaleuro = 0;

        for (String item : divided) {
            if (item.startsWith("$")) {
                int amount = Integer.parseInt(item.substring(1));
                TotalDolar += amount;
            } else if (item.startsWith("€")) {
                int amount = Integer.parseInt(item.substring(1));
                Totaleuro += amount;
            }
        }
        System.out.println("Total dolar: " + TotalDolar);
        System.out.println("Total euro: " + Totaleuro);
    }
}