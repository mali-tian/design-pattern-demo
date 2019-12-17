package hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreeterTest {

    private Greeter greeter = new Greeter();

    @Test
    public void sayHello() {
        assertEquals("Hello World!", greeter.sayHello());
    }
}