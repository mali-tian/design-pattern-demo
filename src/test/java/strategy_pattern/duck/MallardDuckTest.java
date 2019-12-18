package strategy_pattern.duck;

import static org.junit.Assert.*;

import org.junit.Test;
import strategy_pattern.behavior.FlyBehavior;
import strategy_pattern.behavior.FlyNoWay;
import strategy_pattern.behavior.QuackBehavior;
import strategy_pattern.behavior.Squeak;

public class MallardDuckTest {

    private Duck mallardDuck = new MallardDuck();

    @Test
    public void should_fly_with_wings_when_perform_fly() {
        assertEquals("I can Fly", mallardDuck.performFly());
    }

    @Test
    public void should_quack_when_perform_quack() {
        assertEquals("Quack", mallardDuck.performQuack());
    }

    @Test
    public void should_swim_when_swim() {
        assertEquals("All ducks float, even decoys!", mallardDuck.swim());
    }

    @Test
    public void should_change_to_can_not_fly_when_set_fly_no_way() {
        FlyBehavior flyBehavior = new FlyNoWay();
        mallardDuck.setFlyBehavior(flyBehavior);
        assertEquals("I can not Fly", mallardDuck.performFly());
    }

    @Test
    public void should_change_to_squeak_when_set_quack_behavior_to_squeak() {
        QuackBehavior quackBehavior = new Squeak();
        mallardDuck.setQuackBehavior(quackBehavior);
        assertEquals("Squeak", mallardDuck.performQuack());
    }

    @Test
    public void should_show_duck_type_when_display() {
        assertEquals("I am really a Mallard Duck", mallardDuck.display());
    }
}