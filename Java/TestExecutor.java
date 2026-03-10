package spring;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class TestExecutor {
	public static void main(String[] args) {
		Runnable r = ()->System.out.println(Thread.currentThread().getName());	
		ExecutorService ex=Executors.newCachedThreadPool();
		for(int i=0; i<10; i++) {
//			Thread t=new Thread(r);
//			t.start();
			ex.execute(r);
		}
	}
}
