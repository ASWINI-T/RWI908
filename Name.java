package multithreading;

public class Name extends Thread {
	public void run() {
		System.out.println("Run method 1 " + Thread.currentThread().getName());
		System.out.println("inside Thread is alive: " +Thread.currentThread().isAlive());
		
	}
	
	public void home() {
		System.out.println("Home method 1 " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		Name obj = new Name();
		System.out.println("Before starts Thread :" +obj.isAlive());
		obj.start();
		System.out.println("After starts Thread :" +obj.isAlive());
		obj.setName("Run");
		
		System.out.println("from main method");
		
		obj.home();

	}

}
