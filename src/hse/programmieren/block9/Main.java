package hse.programmieren.block9;

import hse.programmieren.block9.app.Command;
import hse.programmieren.block9.app.CommandExecutor;
import hse.programmieren.block9.app.CommandProcessor;
import hse.programmieren.block9.app.VehicleManager;

public class Main {

    static void main() {
        VehicleManager vehicleManager = new VehicleManager();
        CommandProcessor commandProcessor = new CommandProcessor();
        CommandExecutor commandExecutor = new CommandExecutor(vehicleManager);
        while (commandProcessor.hasCommands()) {
            final Command command = commandProcessor.read();
            commandExecutor.execute(command);

        }
    }
}
