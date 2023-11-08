package j07_StringManipulation.Homeworks;
public class Task08 {
    public static void main(String[] args) {
        /*  TASK : Asagidaki String degiskenini kullanarak  konsolda isminizi print eden code create ediniz.
        String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; */
        String harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(harfDepo.charAt(0) + "" + harfDepo.toLowerCase().charAt(1) + "" + harfDepo.toLowerCase().charAt(3) + "" +
                harfDepo.toLowerCase().charAt(20) + "" + harfDepo.toLowerCase().charAt(11) + "" + harfDepo.toLowerCase().charAt(11) +
                "" + harfDepo.toLowerCase().charAt(0) + "" + harfDepo.toLowerCase().charAt(7));
    }
}