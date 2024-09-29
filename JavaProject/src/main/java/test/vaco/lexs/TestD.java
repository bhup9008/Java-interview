package test.vaco.lexs;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestD implements Runnable{
    @Override
    public void run() {
        System.out.println("nnksnkdnsa");

    }

    public static void main(String[] args) {
        TestD s=new TestD();
        Thread d=new Thread(s);
        d.start();
        ExecutorService executorService
                = Executors.newFixedThreadPool(4);
    }
}
