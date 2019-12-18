package strategy_pattern.behavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public String quack() {
       return "I can not quack";
    }
}
