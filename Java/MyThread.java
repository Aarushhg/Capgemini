package spring;

public class MyThread implements Runnable {
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName() + "is Runnning");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Thread Interrupted");
			}
		}
	}
	
}
