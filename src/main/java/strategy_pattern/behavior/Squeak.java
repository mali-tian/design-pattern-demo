package strategy_pattern.behavior;

public class Squeak implements QuackBehavior {

    @Override
    public String quack() {
        return "Squeak";
    }
}
