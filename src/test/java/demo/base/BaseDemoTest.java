package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }

    @Test
    public void should_return_6() {
        BaseDemo baseDemo = new BaseDemo();
        assertEquals(6, baseDemo.sum(3,3));
    }

    @Test
    public void should_return_10() {
        BaseDemo baseDemo = new BaseDemo();
        assertEquals(10, baseDemo.sum(5,5));
    }
}
