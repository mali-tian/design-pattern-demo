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
        System.out.println(mallardDuck.display());
        System.out.println(mallardDuck.swim());
        System.out.println(mallardDuck.performFly());
        System.out.println(mallardDuck.performQuack());

        System.out.println("--------------------------------------------");

        Duck redHeadDuck = new RedHeadDuck();
        System.out.println(redHeadDuck.display());
        System.out.println(redHeadDuck.swim());
        System.out.println(redHeadDuck.performFly());
        System.out.println(redHeadDuck.performQuack());

        System.out.println("--------------------------------------------");

        Duck rubberDuck = new RubberDuck();
        System.out.println(rubberDuck.display());
        System.out.println(rubberDuck.swim());
        System.out.println(rubberDuck.performFly());
        System.out.println(rubberDuck.performQuack());

        System.out.println("--------------------------------------------");

        Duck decoyDuck = new DecoyDuck();
        System.out.println(decoyDuck.display());
        System.out.println(decoyDuck.swim());
        System.out.println(decoyDuck.performFly());
        System.out.println(decoyDuck.performQuack());

        System.out.println("--------------------------------------------");

//      make red head duck squeak
        redHeadDuck.setQuackBehavior(new Squeak());
        System.out.println(redHeadDuck.display());
        System.out.println(redHeadDuck.performQuack());

    }
}
