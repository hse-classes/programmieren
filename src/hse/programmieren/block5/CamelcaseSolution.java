package hse.programmieren.block5;

public class CamelcaseSolution {

    static void main() {
        System.out.println(lowerCaseString("hallo"));
    }

    static String lowerCaseString(String value) {
        if (value.isEmpty()) {
            return value;
        }
        return value.substring(0, 1).toLowerCase() + upperCaseString(value.substring(1));
    }

    static String upperCaseString(String value) {
        if (value.isEmpty()) {
            return value;
        }
        return value.substring(0, 1).toUpperCase() + lowerCaseString(value.substring(1));
    }
}
