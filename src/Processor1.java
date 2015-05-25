import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Create a latch , Create a pool 
//submit the pool and then latch -> await 
// run method countdown the latch.
//used for synchronization

public class Processor1 implements Runnable {
	private CountDownLatch latch;
	public Processor1(CountDownLatch latch) {
		this.latch = latch;
	}
	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(3);
		ExecutorService pool = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 3; i++) {
			pool.submit(new Processor1(latch));
			
		}
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Completed");
}
	@Override
	public void run() {
		System.out.println("Started: ");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			latch.countDown();
	}
}
