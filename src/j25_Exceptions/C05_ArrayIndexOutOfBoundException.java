package j25_Exceptions;

public class C05_ArrayIndexOutOfBoundException {
    public static void main(String[] args) {
        int sayi[] = {38,33,61,52,10,59,16,15};
        System.out.println("sayi[5] = " + sayi[5]);
        try {
            System.out.println("sayi[21] = " + sayi[21]);
            System.out.println("Tyr is here");
        }catch (NullPointerException e) {
            System.out.println("Try throws exception");
            System.out.println("Catch is here");
        }
        System.out.println("App runned till the end");
    }
}
