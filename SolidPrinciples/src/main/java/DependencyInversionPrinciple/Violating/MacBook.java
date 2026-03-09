package DependencyInversionPrinciple.Violating;

import DependencyInversionPrinciple.Keyboard;
import DependencyInversionPrinciple.Mouse;
import DependencyInversionPrinciple.WiredKeyboard;
import DependencyInversionPrinciple.WiredMouse;

// VIOLATION OF DIP
// High-level module directly depending on low-level module
public class MacBook {
    private final WiredKeyboard keyboard; // low-level module used
    private final WiredMouse mouse; // low-level module used

    public MacBook(WiredKeyboard keyboard, WiredMouse mouse) {
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
