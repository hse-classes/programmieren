package hse.programmieren.block9.app;

import java.util.Scanner;

public class CommandProcessor {

    private final Scanner commandReader = new Scanner(System.in);

    public boolean hasCommands() {
        return commandReader.hasNextLine();
    }

    public Command read() {
        final var line = commandReader.nextLine();
        if (line.equals("exit")) {
            return Command.EXIT;
        }
        if (line.equals("help")) {
            return Command.HELP;
        }
        if (line.equals("list")) {
            return Command.LIST;
        }
        if (line.equals("build")) {
            return Command.BUILD;
        }
        return null;
    }
}
