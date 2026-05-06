package hse.programmieren.block4deep.aufgaben.aufgabe3;

public class Substitutor {

    public static String substitute(String text) {

        String substitutedText = "";

        for (char letter : text.toCharArray()) {
            char substitutedLetter =  switch (letter) {
                case 'a', 'A' -> '4';
                case 'o', 'O' -> '0';
                case 'e', 'E' -> '3';
                case 'i', 'I' -> '1';
                default -> letter;
            };

            substitutedText += substitutedLetter;
        }

        return substitutedText;
    }


    static void main(String[] args) {
        final String substitution = Substitutor.substitute("Hallo, wie geht es dir? ");

        System.out.println(substitution);
    }
}
