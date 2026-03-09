package DependencyInversionPrinciple.Following;

import DependencyInversionPrinciple.Keyboard;
import DependencyInversionPrinciple.Mouse;

// Compliance of DIP
// High-level module uses abstraction
public class MacBook {
    private final Keyboard keyboard; // abstraction used
    private final Mouse mouse; // abstraction used

    public MacBook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }
}
