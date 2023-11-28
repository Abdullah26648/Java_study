package j20_StaticKeyword.Homeworks;

class Lesson {
    private String name;
    private int credit;

    public Lesson(String name, int credit) {
        this.name = name;
        setCredit(credit);
    }

    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        if (credit >= 1 && credit <= 10) {
            this.credit = credit;
        } else {
            System.out.println("Credit should be between 1 and 10.");
        }
    }
}