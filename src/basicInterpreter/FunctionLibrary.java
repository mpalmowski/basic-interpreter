package basicInterpreter;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

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
        builtInFunctions.put("rnd", (Double x) -> new Random().nextDouble());
        builtInFunctions.put("int", (Double x) -> (double)Math.round(x));
    }

    public void set(String name, Function item) {
        functions.put(name, item);
    }

    public Double run(String name, Double argumentValue, Scope parentScope) {
        Function function = functions.get(name);
        if(function != null){
            return function.run(argumentValue, parentScope, this);
        }

        name = name.toLowerCase();
        BuiltInFunction<Double> builtInFunction = builtInFunctions.get(name);
        if(builtInFunction != null) {
            return builtInFunction.run(argumentValue);
        } else {
            return null;
        }
    }
}
