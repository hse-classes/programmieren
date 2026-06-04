package hse.programmieren.block8.aufgaben.aufgabe3;

public class Main {

    public static void main(String[] args) throws Exception {
        TestQueue testQueue = new TestQueue();

        testQueue.load("_testCars.txt");

        if (testQueue.size() == 0) {
            testQueue.addCar(new TestCar("vin1", "vw golf 3", 1997, TestTyp.EMISSIONS_TEST));
            testQueue.addCar(new TestCar("vin2", "audi 100", 1994, TestTyp.SICHERHEITS_PRUEFUNG));
            testQueue.addCar(new TestCar("vin3", "toyota carina", 1998, TestTyp.SOFTWARE_DIAGNOSE));

        }

        testQueue.printAll();

        TestCar testCar = testQueue.removeNextCar();

        System.out.println("removed: " + testCar);

        testQueue.printAll();

        testQueue.save("_testCars.txt");
    }

}
