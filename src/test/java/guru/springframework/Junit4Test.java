package guru.springframework;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Junit4Test {
    @Test
    public void name() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assertEquals("Hello World",javaHelloWorld.getHello());
    }


}
