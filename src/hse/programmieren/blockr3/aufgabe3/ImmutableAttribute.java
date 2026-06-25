package hse.programmieren.blockr3.aufgabe3;

public class ImmutableAttribute {

    private String attribute;

    public ImmutableAttribute(final String attribute) {
        this.attribute = attribute;
    }

    public String getAttribute() {
        return attribute;
    }
}
