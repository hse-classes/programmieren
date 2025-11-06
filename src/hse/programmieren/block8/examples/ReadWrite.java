package hse.programmieren.block8.examples;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class ReadWrite {

    static void main() throws Exception {
        /*
        Writer writer = new FileWriter("_write.txt");
        writer.write("programmieren-111");
        writer.close();
        */

        Scanner scanner = new Scanner(new File("_read.txt"));

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();

    }
}
