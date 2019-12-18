package strategy_pattern.duck;

import strategy_pattern.behavior.FlyNoWay;
import strategy_pattern.behavior.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
    @Override
    public String display() {
        return "I am the rubber duck";
    }
}
