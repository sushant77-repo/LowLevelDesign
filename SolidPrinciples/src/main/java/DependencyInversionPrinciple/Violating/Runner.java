package DependencyInversionPrinciple.Violating;

import DependencyInversionPrinciple.WiredKeyboard;
import DependencyInversionPrinciple.WiredMouse;
import DependencyInversionPrinciple.WirelessKeyboard;
import DependencyInversionPrinciple.WirelessMouse;

// Demonstrates DIP violation
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

        // Create macbook with wireless components
        // MacBook macBookWithWirelessComponents = new MacBook(wirelessKeyboard, wirelessMouse)
        // cannot create macbook with bluetooth keyboard and mouse because
        // macbook depends on wired keyboard and mouse - tight coupling - violation of DIP
    }
}
