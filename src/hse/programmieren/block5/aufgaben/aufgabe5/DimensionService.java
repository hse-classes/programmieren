package hse.programmieren.block5.aufgaben.aufgabe5;

import java.util.ArrayList;

public class DimensionService {

    static void main(String[] args) {

        String[] daten = {
                "A", "B", "C"
        };

        String[][] matrix2d = {
                {"A", "B"},
                {"C", "D"}
        };

        String[][][] matrix3d = {
                {{"A", "B", "A"}, {"C", "D", "A"}, {"C", "D", "A"}},
                {{"C", "D", "A"}, {"C", "D", "A"}, {"C", "D", "A"}},
                {{"C", "D", "A"}, {"A", "B", "A"}, {"A", "B", "G"}}
        };

        System.out.println("###### findFirst");

        System.out.println(findIn1d(daten, "C"));
        System.out.println(findIn2d(matrix2d, "C"));
        System.out.println(findIn3d(matrix3d, "G"));

        System.out.println("###### findAll");

        System.out.println(findAllIn1d(daten, "C"));
        System.out.println(findAllIn2d(matrix2d, "C"));
        System.out.println(findAllIn3d(matrix3d, "G"));
    }

    public static String findIn1d(String[] array, String letterOfInterest) {

        for (int index = 0; index < array.length; index++) {
            if (array[index].equals(letterOfInterest)) {
                return "" + index;
            }
        }

        return "-1";
    }

    public static String findIn2d(String[][] array, String letterOfInterest) {
        for (int index = 0; index < array.length; index++) {
            String stepResult = findIn1d(array[index], letterOfInterest);
            if (!stepResult.equals("-1")) {
                return "{" + index + "," + stepResult + "}";
            }
        }

        return "-1";
    }

    public static String findIn3d(String[][][] array, String letterOfInterest) {
        for (int index = 0; index < array.length; index++) {
            String stepResult = findIn2d(array[index], letterOfInterest);
            if (!stepResult.equals("-1")) {
                return "{" + index + "," + stepResult.substring(1);
            }
        }

        return "-1";
    }

    public static ArrayList<String> findAllIn1d(String[] array, String letterOfInterest) {
        ArrayList<String> results = new ArrayList<>();

        for (int index = 0; index < array.length; index++) {
            if (array[index].equals(letterOfInterest)) {
                results.add(String.valueOf(index));
            }
        }

        return results;
    }

    public static ArrayList<String> findAllIn2d(String[][] array, String letterOfInterest) {
        ArrayList<String> results = new ArrayList<>();

        for (int index = 0; index < array.length; index++) {
            ArrayList<String> stepResults = findAllIn1d(array[index], letterOfInterest);

            for (String step : stepResults) {
                results.add("{" + index + "," + step + "}");
            }
        }

        return results;
    }

    public static ArrayList<String> findAllIn3d(String[][][] array, String letterOfInterest) {
        ArrayList<String> results = new ArrayList<>();

        for (int index = 0; index < array.length; index++) {
            ArrayList<String> stepResults = findAllIn2d(array[index], letterOfInterest);

            for (String step : stepResults) {
                results.add("{" + index + "," + step.substring(1));
            }
        }

        return results;
    }

}
