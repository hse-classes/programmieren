package hse.programmieren.blockr3.aufgabe2;

public class MethodenTester {

    public void method1() {
        System.out.println(" ");
    }

    public String method2() {
        return "value";
    }

    public int method3(String parameter) {
        return Integer.parseInt(parameter);
    }

    public void method4(boolean parameter) {
        System.out.println(parameter);
    }

    public Tuple method5(String parameter1, Integer parameter2) {
        return new Tuple(parameter1, parameter2);
    }

    public Integer method5(String parameter1, String parameter2, String parameter3) {
        return null; // null returnen geht, oder als void deklarieren, aber als null selbst geht das nicht
    }

    public class Tuple {
        String value1;
        Integer value2;

        public Tuple(final String value1, final Integer value2) {
            this.value1 = value1;
            this.value2 = value2;
        }

        public String getValue1() {
            return value1;
        }

        public Integer getValue2() {
            return value2;
        }
    }

}
