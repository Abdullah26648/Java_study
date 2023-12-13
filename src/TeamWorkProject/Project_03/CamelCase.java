package TeamWorkProject.Project_03;

public class CamelCase {

    /*
     TASK ->
       First letter to upper case
        parameter is one String
        return type is String
        words are delimited by a space.
        All the words first letter should be camel case

       input:

           I lIVe in uSa

      Result should be

           I Live In Usa

     */

    /*
            CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin sadece ilk karakterlerini
            büyük harfe çevirip return eden  method create ediniz.
            input: I lIVe in uSa
            output: I Live In Usa

     */
    public static void main(String[] args) {


        System.out.println(camelcase());
    }
    public static String camelcase() {

      String  s1 = " I Live In Usa ";
              s1.trim().replaceAll("[ ]+", " ");

        String[] dizi = s1.trim().split(" ");

        String strDonen = "";

        for (String str : dizi) {
            strDonen += str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase() + " ";
        }
        return strDonen.trim();



    }


}
