package multithreading;

public class Priority extends Thread {
	public void run() {
		System.out.println("Run method 1: " + Thread.currentThread().getPriority());	
	}
	
	public void home() {
		System.out.println("Home method 1: " + Thread.currentThread().getPriority());
	}
	
	
	public static void main(String[] args) {
		Priority obj = new Priority();
		obj.setPriority(7);
		obj.start();
		obj.setPriority(7);
		obj.home();
		

	}

}
