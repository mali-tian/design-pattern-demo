package strategy_pattern.duck;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import strategy_pattern.behavior.FlyBehavior;
import strategy_pattern.behavior.FlyWithWings;
import strategy_pattern.behavior.QuackBehavior;
import strategy_pattern.behavior.Squeak;

public class DecoyDuckTest {

    Duck decoyDuck = new DecoyDuck();

    @Test
    public void should_not_fly_when_perform_fly() {
        assertEquals("I can not Fly", decoyDuck.performFly());
    }

    @Test
    public void should_not_quack_when_perform_quack() {
        assertEquals("I can not quack", decoyDuck.performQuack());
    }

    @Test
    public void should_swim_when_swim() {
        assertEquals("All ducks float, even decoys!", decoyDuck.swim());
    }

    @Test
    public void should_change_to_fly_with_wings_when_set_fly_behavior() {
        FlyBehavior flyBehavior = new FlyWithWings();
        decoyDuck.setFlyBehavior(flyBehavior);
        assertEquals("I can Fly", decoyDuck.performFly());
    }

    @Test
    public void should_change_to_squeak_when_set_quack_behavior_to_squeak() {
        QuackBehavior quackBehavior = new Squeak();
        decoyDuck.setQuackBehavior(quackBehavior);
        assertEquals("Squeak", decoyDuck.performQuack());
    }

    @Test
    public void should_show_decoy_duck_when_display() {
        assertEquals("I am decoy duck", decoyDuck.display());
    }
}