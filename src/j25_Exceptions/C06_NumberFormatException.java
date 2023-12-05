package j25_Exceptions;

public class C06_NumberFormatException {
    public static void main(String[] args) {
        String icardi = "1905";
        System.out.println("icardi = " + icardi);
        System.out.println("icardi+28 = " + icardi + 28);
        int wanda = Integer.parseInt(icardi);
        System.out.println("wanda = " + wanda);
        System.out.println("wanda+28 = " + wanda + 28);

        String id = "145357l622";
        //System.out.println("invalid = " + invalid);
        try {
            int invalid = Integer.parseInt(id);
            System.out.println("Tyr is here");
        } catch (NumberFormatException e) {
            id = "1453571622";
            int invalid = Integer.parseInt(id);
            System.out.println("invalid = " + invalid);
            System.out.println("Catch is here");
        }
        System.out.println("App runned till the end");
    }
}
