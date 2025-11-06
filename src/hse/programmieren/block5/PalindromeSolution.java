package hse.programmieren.block5;

public class PalindromeSolution {

    static void main() {
        System.out.println(generatePalindrome("klemi"));
    }

    static boolean isPalindrome(String value) {
        if (value.length() <= 1) {
            return true;
        }

        if (value.charAt(0) != value.charAt(value.length() - 1)) {
            return false;
        }

        return isPalindrome(value.substring(1, value.length() - 1));
    }

    static String generatePalindrome(String seed) {
        if (seed.isEmpty()) {
            return seed;
        }
        return seed.charAt(0) + generatePalindrome(seed.substring(1)) + seed.charAt(0);
    }
}
