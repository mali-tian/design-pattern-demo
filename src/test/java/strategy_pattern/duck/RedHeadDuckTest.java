package strategy_pattern.duck;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import strategy_pattern.behavior.FlyBehavior;
import strategy_pattern.behavior.FlyNoWay;
import strategy_pattern.behavior.MuteQuack;
import strategy_pattern.behavior.QuackBehavior;

public class RedHeadDuckTest {

    Duck redHeadDuck = new RedHeadDuck();

    @Test
    public void should_fly_with_wings_when_perform_fly() {
        assertEquals("I can Fly", redHeadDuck.performFly());
    }

    @Test
    public void should_quack_when_perform_quack() {
        assertEquals("Quack", redHeadDuck.performQuack());
    }

    @Test
    public void should_swim_when_swim() {
        assertEquals("All ducks float, even decoys!", redHeadDuck.swim());
    }

    @Test
    public void should_change_to_can_not_fly_when_set_fly_no_way() {
        FlyBehavior flyBehavior = new FlyNoWay();
        redHeadDuck.setFlyBehavior(flyBehavior);
        assertEquals("I can not Fly", redHeadDuck.performFly());
    }

    @Test
    public void should_change_to_can_not_quack_when_set_quack_behavior_to_squeak() {
        QuackBehavior quackBehavior = new MuteQuack();
        redHeadDuck.setQuackBehavior(quackBehavior);
        assertEquals("I can not quack", redHeadDuck.performQuack());
    }

    @Test
    public void should_show_redhead_duck_when_display() {
        assertEquals("I am red head duck", redHeadDuck.display());
    }
}