package hse.programmieren.block4deep.switchexpressions;

public class SwitchExample {

    static void main(String[] args) {

    }

    static void ifWay() {
        String kundenTyp = "PREMIUM";
        int rabatt;

        if (kundenTyp.equals("STANDARD")) {
            rabatt = 0;
        } else if (kundenTyp.equals("PREMIUM")) {
            rabatt = 10;
        } else if (kundenTyp.equals("VIP")) {
            rabatt = 20;
        } else {
            rabatt = 0;
        }

        System.out.println("Dein Rabatt: " + rabatt + "%");
    }

    static void switchWay() {
        String kundenTyp = "PREMIUM";

        int rabatt = switch (kundenTyp) {
            case "STANDARD" -> 0;
            case "PREMIUM" -> 10;
            case "VIP" -> 20;
            default -> 0;
        };

        System.out.println("Dein Rabatt: " + rabatt + "%");
    }

    static void switchWayBadPractice() {
        String kundenTyp = "PREMIUM";

        int rabatt = switch (kundenTyp) {
            case "PREMIUM" -> 10;
            case "VIP" -> 20;
            default -> 0;
        };

        System.out.println("Dein Rabatt: " + rabatt + "%");
    }

    static void switchWayWithYield() {
        String kundenTyp = "PREMIUM";

        int rabatt = switch (kundenTyp) {
            case "STANDARD" -> {
                System.out.println("kein Discount");
                yield 0;
            }
            case "PREMIUM" -> {
                System.out.println("bissle Discount");
                yield 10;
            }
            case "VIP" -> {
                System.out.println("Praktiker Discount");
                yield 20;
            }
            default -> {
                System.out.println("kein Discount");
                yield 0;
            }
        };

        System.out.println("Dein Rabatt: " + rabatt + "%");
    }

    static void switchWayWithEnum() {
        Type kundenTyp = Type.PREMIUM;

        int rabatt = switch (kundenTyp) {
            case STANDARD -> 0;
            case PREMIUM -> 10;
            case VIP -> 20;
        };

        System.out.println("Dein Rabatt: " + rabatt + "%");
    }

    enum Type {
        STANDARD,
        PREMIUM,
        VIP
    }
}
