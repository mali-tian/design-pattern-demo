package hello;

import strategy_pattern.duck.DecoyDuck;
import strategy_pattern.duck.Duck;
import strategy_pattern.duck.MallardDuck;
import strategy_pattern.duck.RedHeadDuck;
import strategy_pattern.duck.RubberDuck;
import strategy_pattern.behavior.Squeak;

public class HelloWorld {
    public static void main(String[] args) {

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());

        System.out.println("--------------------------------------------");

        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println("--------------------------------------------");

        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.swim();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();

        System.out.println("--------------------------------------------");

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        System.out.println("--------------------------------------------");

        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.swim();
        decoyDuck.performFly();
        decoyDuck.performQuack();

        System.out.println("--------------------------------------------");

//      make red head duck squeak
        redHeadDuck.setQuackBehavior(new Squeak());
        redHeadDuck.display();
        redHeadDuck.performQuack();

    }
}
