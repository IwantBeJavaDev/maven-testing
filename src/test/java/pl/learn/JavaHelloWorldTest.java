package pl.learn;

public class JavaHelloWorldTest {

    public void testGetHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();

        assert ("Hello World".equalsIgnoreCase(javaHelloWorld.getHello()));
    }
}