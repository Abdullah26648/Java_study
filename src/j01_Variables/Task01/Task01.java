package j01_Variables.Task01;
// Tarih: 03.10.2023
public class Task01 {
    /* java escape special characters -> https://www.w3schools.com/java/java_strings_specchars.asp

  \n (or \r): starts from a new line : metni bir alt satırdan itibaren yazdırır.
          \t:  horizontal tab : metni yatayda 1 tab miktarı kaydırır.
          \\: prints a back slash :\ (ters slash) yazdırır
          \': prints single quote :' tek tırnak yazdırır.
          \": prints double quote :"" Çift tırnak yazdırır.
    */
    public static void main(String[] args) {
        System.out.println("\"Hello \", \"World \\ /\"");
        System.out.println("J\na\nv\na\nC\nA\nN");
        System.out.println("\"Java\" ile hayat cok \'afilli\'");
        System.out.println("\"Basari\" gayrete\n\'asiktir\'\n\n\n\t\"Clarusway ile java cok kolay ...\"");

    }
}
