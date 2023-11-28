package j20_StaticKeyword.Homeworks;

class Customer {
    private String name;
    private ElectricityAccount electricityAccount;

    public Customer(String name, ElectricityAccount electricityAccount) {
        this.name = name;
        this.electricityAccount = electricityAccount;
    }

    public ElectricityAccount getElectricityAccount() {
        return electricityAccount;
    }

    public void printElectricityBill(String month) {
        System.out.println("Electricity bill for " + name + " - " + month + ": " + electricityAccount.calculateBill() + " TL");
    }
}