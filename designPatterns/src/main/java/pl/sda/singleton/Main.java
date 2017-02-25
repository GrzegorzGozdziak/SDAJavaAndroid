package pl.sda.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getCounter());

        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2.getCounter());
    }
}
