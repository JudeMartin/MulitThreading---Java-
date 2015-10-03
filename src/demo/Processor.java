package demo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Processor implements Runnable {
	private int id;
	public Processor(int id){
		this.id	 = id;
	}
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		for (int i = 0; i < 5; i++) {
			service.submit(new Processor(i));
		}
		service.shutdown();
		try {
			service.awaitTermination(1, TimeUnit.DAYS);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}

	@Override
	public void run() {
		System.out.println("Starting:"+id);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Completed: "+id);
	}
}
