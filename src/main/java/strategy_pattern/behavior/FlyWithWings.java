package strategy_pattern.behavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public String fly() {
        return "I can Fly";
    }
}
