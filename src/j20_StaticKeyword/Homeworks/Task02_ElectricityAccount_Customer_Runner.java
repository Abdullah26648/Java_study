package j20_StaticKeyword.Homeworks;

public class Task02_ElectricityAccount_Customer_Runner {/*
    Task 02 ->
    ElektirikHesap Class:  fields : toplamTuketim(int), oran(double), fatura(double)
    Müşteriye ait tüketilen enerjiyi toplamTuketim'e toplayan tüketimEkle method
    oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura değeri atayan odenecekTutar method

    Müsteri Class: fields: name ElektrikHesabi class obj.
    Runner Class obj ile enz 2  aylık elektrik tüketim faturası print eden code create ediniz

     */

    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", new ElectricityAccount());

        customer.getElectricityAccount().addConsumption(500);
        customer.printElectricityBill("Month 1");

        customer.getElectricityAccount().resetConsumption();

        customer.getElectricityAccount().addConsumption(600);
        customer.printElectricityBill("Month 2");
    }
}