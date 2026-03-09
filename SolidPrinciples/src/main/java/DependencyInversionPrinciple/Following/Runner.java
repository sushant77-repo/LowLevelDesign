package DependencyInversionPrinciple.Following;

import DependencyInversionPrinciple.WiredKeyboard;
import DependencyInversionPrinciple.WiredMouse;
import DependencyInversionPrinciple.WirelessKeyboard;
import DependencyInversionPrinciple.WirelessMouse;

// Demonstrates DIP compliance
public class Runner {
    public static void main(String[] args) {
        // Create keyboard and mouse objects
        WiredKeyboard wiredKeyboard = new WiredKeyboard("USB", "DELL", "D123");
        WiredMouse wiredMouse = new WiredMouse("USB", "DELL", "D451");

        WirelessKeyboard wirelessKeyboard = new WirelessKeyboard("BLUETOOTH", "HP", "H74");
        WirelessMouse wirelessMouse = new WirelessMouse("BLUETOOTH", "HP", "H65");

        // Create macbook with wired components
        MacBook macBookWithWiredComponents = new MacBook(wiredKeyboard, wiredMouse);

        macBookWithWiredComponents.getKeyboard().getSpecifications();
        macBookWithWiredComponents.getMouse().getSpecifications();

        // Create macbook with wireless components - we face no issue in creating
        MacBook macBookWithWirelessComponents = new MacBook(wirelessKeyboard, wirelessMouse);

        macBookWithWirelessComponents.getKeyboard().getSpecifications();
        macBookWithWirelessComponents.getMouse().getSpecifications();
    }
}
