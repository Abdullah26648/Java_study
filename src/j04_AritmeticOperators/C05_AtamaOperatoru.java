package j04_AritmeticOperators;

public class C05_AtamaOperatoru {
    public static void main(String[] args) {
        //    =	        x = 8	    x = 8
        //    +=	    x += 3	    x = x + 3
        //    -=	    x -= 3	    x = x - 3
        //    *=	    x *= 3	    x = x * 3
        //    /=	    x /= 3	    x = x / 3
        //    %=	    x %= 3	    x = x % 3
        int abdYas = 30;
        System.out.println("abdYas+5 = " + (abdYas + 5));//35-> = atama yapılmadıgı için abdYas değerei hala 30 ama 5 fazla print edildi
        System.out.println("abdYas = " + abdYas);// 30
        System.out.println("abdYas+=11 = " + (abdYas += 11));// 41-> abdYas 11 eklenerek atama yapıldı
        System.out.println("abdYas = " + abdYas);// 41


    }
}