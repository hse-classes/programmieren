package hse.programmieren.block4deep.aufgaben;

public class IfToSwitch {

    public String getDisplayMessage(String carStatus) {

        if (carStatus.equals("DRIVING")) {
            return "Gute Fahrt! Odometer läuft.";
        } else if (carStatus.equals("STOPPED") || carStatus.equals("PARKED")) {
            return "Fahrzeug steht sicher.";
        } else if (carStatus.equals("REFUELING")) {
            return "Tankvorgang läuft... Bitte Motor auslassen.";
        } else {
            return "Unbekannter Systemstatus!";
        }
    }

}
