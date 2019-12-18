package strategy_pattern.behavior;

public class Quack implements QuackBehavior {

    @Override
    public String quack() {
        return "Quack";
    }
}
