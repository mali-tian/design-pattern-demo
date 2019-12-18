package strategy_pattern.duck;

import strategy_pattern.behavior.FlyWithWings;
import strategy_pattern.behavior.Quack;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public String display() {
        return "I am red head duck";
    }
}
