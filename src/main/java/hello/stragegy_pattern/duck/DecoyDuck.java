package hello.stragegy_pattern.duck;

import strategy_pattern.behavior.FlyNoWay;
import strategy_pattern.behavior.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
    @Override
    public void display() {
        System.out.println("I am decoy duck");
    }
}
