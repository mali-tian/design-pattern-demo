package strategy_pattern.duck;

import strategy_pattern.behavior.FlyBehavior;
import strategy_pattern.behavior.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    void Duck() {
    }

    public abstract String display();
    public String performFly() {
        return flyBehavior.fly();
    }

    public String performQuack() {
       return quackBehavior.quack();
    }

    public String swim() {
       return "All ducks float, even decoys!";
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
