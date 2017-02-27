package pl.sda.designPatterns.singleton;

import org.junit.Test;


public class singletonTest {
    @Test
    public void singletonTest() throws Exception {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getCounter());

        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2.getCounter());
    }
}
