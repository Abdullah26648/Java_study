package j23_Encapsulation.Encapsulation03;

public class Arac {
    /*
    1- fieldları(encapsulated) model(String), renk(String), motor(int), yil (int)
    olan Araba  isimli bir class cretae ediniz.
    2- bütün fieldları parametre alan bir constructor tanımlayınız.
    3- Runner isminde main için bir class oluşturunuz.
    4- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
    5- aracların motor hacmi 1000 cc ve altı olması ve yılını hatalı veri girisine karsi kontrol ediniz.
    */
    private String model;
    private String renk;
    private int motor;
    private int yil;

    public Arac(String model, String renk, int motor, int yil) {
        setModel(model);
        setRenk(renk);
        setMotor(motor);
        setYil(yil);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        if (motor >= 1000) {
            this.motor = motor;
        } else {
            this.motor =1000;
        }
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        if (Math.abs(yil) > 1886) {
            this.yil = Math.abs(yil);
        } else {
            System.out.println("Cmon it can't be");
        }
    }
}