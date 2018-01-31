package task;

        import java.util.HashMap;
        import java.util.Map;

public class MapFunction {
    private Map<String, Algorithm> function;

    public MapFunction() {
        function = new HashMap<>();
    }


    public Map<String, Algorithm> getFunction() {
        return function;
    }

    public void setFunction(Map<String, Algorithm> function) {
        this.function = function;
    }

    public MapFunction  (Map<String, Algorithm> map){
        function.putAll(map);
    }

    @Override
    public String toString() {
        return "MapFunction{" +
                "function=" + function +
                '}';
    }
}
