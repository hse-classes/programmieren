package hse.programmieren.block9.app;

import java.util.Arrays;

public class CommandExecutor {

    private final VehicleManager vehicleManager;

    public CommandExecutor(VehicleManager vehicleManager) {
        this.vehicleManager = vehicleManager;
    }

    public void execute(final Command command) {
        if (command == null) {
            System.err.println("Unknown command. Please write 'help' for more commands.");
            return;
        }
        if (command.equals(Command.EXIT)) {
            System.exit(0);
        }
        if (command.equals(Command.HELP)) {
            System.out.println(Arrays.toString(Command.values()));
        }
        if (command.equals(Command.LIST)) {
            System.out.println(vehicleManager.getVehicles());
        }
        if (command.equals(Command.BUILD)) {
            System.exit(0);
        }
    }

}
