/*
package demo;

import java.util.Scanner;

class Processor extends Thread{
	private volatile boolean  flag = true;// for 
	public void shutdown(){
		flag = false;
	}
	public void run(){
		while(flag){
			System.out.println("Good Day!");
		}
		try {
			Thread.sleep(700);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		}
			/*	for (int i = 0; i < 10; i++) {
					System.out.println(i);
					try {
						Thread.sleep(700);
					  } catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		
}

 public class App{
	public static void main(String[] args) {
	//Thread Th1 = new Thread();
		System.out.println("Return key to stop the thread");
		Processor r1= new Processor();
		r1.start();
		
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
	r1.shutdown();
	}
	
}
*/