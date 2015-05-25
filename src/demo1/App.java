package demo1;
class Runner implements Runnable{
	
	public void run(){
		{
			for (int i = 0; i < 10000; i++) {
				System.out.println(i);
				try {
					Thread.sleep(0);
				  } catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

public class App {
public static void main(String[] args) {
	Thread T1 = new Thread(new Runner());
	T1.start();
	}
}
