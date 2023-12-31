package j25_Exceptions;

public class Example {
    public static void main(String[] args) {
        System.out.println(exceptions());
    }
    public static String exceptions() {
        String result = "";
        String v = null;

        try {
            try {
                result = result + "a";
                v.length();
                result = result + "b";
            } catch (NullPointerException e) {
                result = result + "c";
            } finally {
                result = result + "d";
                throw new Exception();
            }
        } catch (Exception e) {
            result = result + "e";
        }
        return result;
    }
}