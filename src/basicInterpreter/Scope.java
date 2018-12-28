package basicInterpreter;

import java.util.HashMap;
import java.util.Map;

public class Scope {
    private Scope parent = null;
    private Map<String, Double> variables;

    Scope(){
        variables = new HashMap<>();
    }

    Scope(Scope parent){
        this.parent = parent;
        variables = new HashMap<>();
    }

    public void set(String name, Double value){
        variables.put(name, value);
    }

    public Double get(String name) {
        Double value;
        value = variables.get(name);
        if(value == null && parent != null){
            value = parent.get(name);
        }
        return value;
    }
}
