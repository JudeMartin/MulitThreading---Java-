package demo;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class App1 {
	//private static Object lock1 = new Object();
	//private static Object lock2 = new Object();
	private static Random random = new  Random();
	static List <Integer> l1 = new ArrayList<Integer>();
	static List <Integer> l2 = new ArrayList<Integer>();
	public static void process(){
		for (int i = 0; i <1000; i++) {
			stage1();
			stage2();
		}
	}
	
	public static void stage1(){
		

		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		l1.add(random.nextInt(2000));

		
			
	/*	synchronized (lock1) {
}	*/
		
	}
	public static void stage2(){
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		l2.add(random.nextInt(2000));

/*		synchronized (lock2) {
	
		}
*/	}
	public static void main(String[] args) {
	Long start =System.currentTimeMillis();
	process();
	Long end =System.currentTimeMillis();
	System.out.println("Total Time: "+ (end-start));
	System.out.println(l1.size()+" "+" "+l2.size());
	}
}
