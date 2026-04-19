package hse.programmieren.block4;

public class Student {
    private int matkNr;
    public String name;
    public String fak;
    public boolean hasLaptop;

    Student(int matNrInput, String nameInput, String fakInput, boolean hasLaptopInput) {
        changeMatkNr(matNrInput);
        this.name = nameInput;
        this.fak = fakInput;
        this.hasLaptop = hasLaptopInput;
    }

    public void changeMatkNr(int matkNr) {
        if (matkNr > 0) {
            this.matkNr = matkNr;
        }
    }


    public String toString() {
        return name + ": " + fak + " - " + matkNr;
    }
}
