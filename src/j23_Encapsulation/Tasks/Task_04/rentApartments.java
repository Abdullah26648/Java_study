package j23_Encapsulation.Tasks.Task_04;

class rentApartments {
    private String name;
    private int roomCount;
    private boolean balconyOrNo;

    public rentApartments(String name, int roomCount, boolean balconyOrNo) {
        this.name = name;
        this.roomCount = roomCount;
        this.balconyOrNo = balconyOrNo;
    }

    public String getName() {
        return name;
    }

    public int calculateRent() {
        int rent = 0;

        switch (roomCount) {
            case 0:
                rent = 1400;
                break;
            case 1:
                rent = 1700;
                break;
            case 2:
                rent = 2200;
                break;
            case 3:
                rent = 2700;
                break;
            default:
                System.out.println("Invalid room count.");
        }

        if (balconyOrNo) {
            rent += 200;
        }

        return rent;
    }
}