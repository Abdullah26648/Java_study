package j20_StaticKeyword.Homeworks;

class Bisiklet {
    private int hiz;
    private int vites;

    public void hizDegistir(int yeniHiz) {
        hiz = yeniHiz;
    }

    public void vitesArtir() {
        if (vites < 5) {
            vites++;
            System.out.println("Gear increased. Current gear: " + vites);
        } else {
            System.out.println("Cannot increase gear beyond 5.");
        }
    }

    public void vitesAzalt() {
        if (vites > 1) {
            vites--;
            System.out.println("Gear decreased. Current gear: " + vites);
        } else {
            System.out.println("Cannot decrease gear below 1.");
        }
    }

    public void durumGoster() {
        System.out.println("Current Speed: " + hiz);
        System.out.println("Current Gear: " + vites);
    }
}