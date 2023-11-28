package j20_StaticKeyword.Homeworks;
class ElectricityAccount {
    private int totalConsumption;
    private final double rate = 0.7; // Assuming a fixed rate

    public void addConsumption(int consumption) {
        totalConsumption += consumption;
    }

    public double calculateBill() {
        return rate * totalConsumption;
    }

    public void resetConsumption() {
        totalConsumption = 0;
    }
}