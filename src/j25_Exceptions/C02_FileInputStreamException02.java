package j25_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException02 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/j25_Exceptions/Exception");
            int k;
            try {
                while ((k = fis.read()) != -1) {
                    System.out.print((char)k);
                }
                System.out.println("Inner tyr is here");
            } catch (IOException e){
                System.out.println("Inner catch is here");
            }
            System.out.println("Outer tyr is here");
        } catch (FileNotFoundException e){
            System.out.println("Outer catch is here");
            throw new RuntimeException(e);
        }
        System.out.println("App runned till the end");
    }
}