package hse.programmieren.blockr3.aufgabe3;

public class FullClass {

    private String one;
    private String two;
    private String three;

    public FullClass(final String one, final String two, final String three) {
        this.one = one;
        this.two = two;
        this.three = three;
    }

    public String getOne() {
        return one;
    }

    public String getTwo() {
        return two;
    }

    public String getThree() {
        return three;
    }

    public void setOne(final String one) {
        this.one = one;
    }

    public void setTwo(final String two) {
        this.two = two;
    }

    public void setThree(final String three) {
        this.three = three;
    }
}
