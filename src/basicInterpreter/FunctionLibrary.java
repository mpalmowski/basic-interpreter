package basicInterpreter;

import java.util.HashMap;
import java.util.Map;

public class FunctionLibrary {
    private Map<String, Function> functions;
    private Map<String, BuiltInFunction<Double>> builtInFunctions;

    @FunctionalInterface
    public interface BuiltInFunction<T> {
        T run(T argumentValue);
    }

    FunctionLibrary() {
        functions = new HashMap<>();
        builtInFunctions = new HashMap<>();

        builtInFunctions.put("sin", Math::sin);
        builtInFunctions.put("cos", Math::cos);
        builtInFunctions.put("tan", Math::tan);
        builtInFunctions.put("atn", Math::atan);
        builtInFunctions.put("exp", Math::exp);
        builtInFunctions.put("abs", Math::abs);
        builtInFunctions.put("log", Math::log);
        builtInFunctions.put("sqr", Math::sqrt);
        builtInFunctions.put("rnd", (Double x) -> (double)Math.round(x));
        builtInFunctions.put("int", Math::floor);
    }

    public void set(String name, Function item) {
        functions.put(name, item);
    }

    public double run(String name, Double argumentValue, Scope parentScope) {
        Function function = functions.get(name);
        if(function != null){
            return function.run(argumentValue, parentScope, this);
        }

        name = name.toLowerCase();
        BuiltInFunction<Double> builtInFunction = builtInFunctions.get(name);
        if(builtInFunction != null) {
            return builtInFunction.run(argumentValue);
        } else {
            //TODO throw exception
        }

        return 0.0;
    }
}
