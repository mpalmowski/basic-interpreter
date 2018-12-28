package basicInterpreter;

import java.util.HashMap;
import java.util.Map;

public class Memory <Type> {
    private Map<String, Type> items;

    Memory() {
        items = new HashMap<>();
    }

    public void set(String name, Type item) {
        items.put(name, item);
    }

    public Type get(String name) {
        return items.get(name);
    }
}
