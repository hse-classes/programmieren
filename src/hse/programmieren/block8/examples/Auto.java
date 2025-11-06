package hse.programmieren.block8.examples;

import java.util.ArrayList;
import java.util.List;

public class Auto {

    private List<RadioSender> sender = new ArrayList<>();

    public  Auto(List<RadioSender> sender) {
        this.sender = sender;
    }

    public void printAllSenders(){
        System.out.println(sender);
    }

    public void checkSender(RadioSender radioSender) {
        int pos = sender.indexOf(radioSender);
        if(pos >= 0){
            System.out.println(radioSender + " gefunden an position: " + pos);
        } else {
            System.out.println(radioSender +  " nicht in der Liste gefunden.");
        }
    }

    @Override
    public String toString() {
        return "Auto{" +
                "sender=" + sender +
                '}';
    }
}
