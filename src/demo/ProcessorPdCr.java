package demo;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProcessorPdCr  {
	private static BlockingQueue<Integer> queue= new ArrayBlockingQueue<Integer>(10); 
	
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1= new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}

			
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();

	}


	protected static void consumer() throws InterruptedException {
		Random random = new Random();
		
		while(true){
			Thread.sleep(100);
			if (random.nextInt()==0) {
				Integer value = queue.take();
				System.out.println("Taken Value"+value +"; Queue Size:"+queue.size());
			}
		}
		
	}


	protected static void producer() throws InterruptedException {
		Random random = new Random();
		while(true){
			queue.put(random.nextInt(100));
		}
		
		
	}
}

