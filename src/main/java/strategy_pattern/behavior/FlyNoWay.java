package strategy_pattern.behavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public String fly() {
        return "I can not Fly";
    }
}
