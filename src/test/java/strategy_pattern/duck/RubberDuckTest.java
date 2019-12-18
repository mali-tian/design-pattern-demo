package strategy_pattern.duck;

import static org.junit.Assert.*;

import org.junit.Test;
import strategy_pattern.behavior.FlyBehavior;
import strategy_pattern.behavior.FlyWithWings;
import strategy_pattern.behavior.QuackBehavior;
import strategy_pattern.behavior.Squeak;

public class RubberDuckTest {

    Duck rubberDuck = new RubberDuck();

    @Test
    public void should_not_fly_when_perform_fly() {
        assertEquals("I can not Fly", rubberDuck.performFly());
    }

    @Test
    public void should_squeck_when_perform_quack() {
        assertEquals("Squeak", rubberDuck.performQuack());
    }

    @Test
    public void should_swim_when_swim() {
        assertEquals("All ducks float, even decoys!", rubberDuck.swim());
    }

    @Test
    public void should_change_to_fly_with_wings_when_set_fly_behavior() {
        FlyBehavior flyBehavior = new FlyWithWings();
        rubberDuck.setFlyBehavior(flyBehavior);
        assertEquals("I can Fly", rubberDuck.performFly());
    }

    @Test
    public void should_change_to_squeak_when_set_quack_behavior_to_squeak() {
        QuackBehavior quackBehavior = new Squeak();
        rubberDuck.setQuackBehavior(quackBehavior);
        assertEquals("Squeak", rubberDuck.performQuack());
    }

    @Test
    public void should_show_rubber_duck_when_display() {
        assertEquals("I am the rubber duck", rubberDuck.display());
    }
}