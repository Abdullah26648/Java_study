package j25_Exceptions;

public class C03_ClassCastingException {
    public static void main(String[] args) {
        Object obj = "Hi to JavaCAN's";
        System.out.println("obj = " + obj);

        String str = (String) obj;
        System.out.println("str = " + str);

        Object number = 49;
        System.out.println("number = " + number);

        try {
            String numberStr = (String) number;
            System.out.println("Tyr is here");
        } catch (ClassCastException e) {
            System.out.println("This action doesn't seem doable");
            System.out.println("Catch is here");
        }
        //System.out.println("numberStr = " + numberStr);

        System.out.println("App runned till the end");
    }
}