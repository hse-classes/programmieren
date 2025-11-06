package hse.programmieren.exam.ss25.polymorphism;

class Reel extends Post {
    private final int durationInSeconds;

    public Reel(User ersteller, int durationInSeconds) {
        super(ersteller);
        this.durationInSeconds = durationInSeconds;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    @Override
    public String toString() {
        return super.toString() + " | Duration: " + durationInSeconds + "s";
    }
}