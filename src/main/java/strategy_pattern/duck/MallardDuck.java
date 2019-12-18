package strategy_pattern.duck;

import strategy_pattern.behavior.FlyWithWings;
import strategy_pattern.behavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public String display() {
        return "I am really a Mallard Duck";
    }
}
