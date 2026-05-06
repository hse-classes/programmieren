package hse.programmieren.block4deep.aufgaben.aufgabe3;

public class Reversor {

    public static String reverse(String text) {

        String reversedText = "";

        final var letters = text.toCharArray();
        for (int i = letters.length - 1; i >= 0; i--) {

            reversedText += letters[i];
        }

        return reversedText;
    }


    static void main(String[] args) {
        final String reverse = Reversor.reverse("Hallo, wie geht es dir? ");

        System.out.println(reverse);
    }
}
