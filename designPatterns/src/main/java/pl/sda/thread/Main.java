package pl.sda.thread;

/**
 * Created by RENT on 2017-02-27.
 */
public class Main {
    public static void main(String[] args) {
        Runnable runnable1 = new SDAThread(1);
        Runnable runnable2 = new SDAThread(2);

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        System.out.println("TUTAJ SKONCZYL SIE MAIN");
    }
}
