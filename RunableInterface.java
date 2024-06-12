package multithreading;

class Note  implements Runnable{
	public void run() {
		for(int i= 1; i<=5;i++)
			System.out.println("Updating DB");
		try {
			Thread.sleep(8000);
		}
		catch(InterruptedException e){
			
		}
	}
}

class Letter extends Thread{
	public void run() {
		for(int i= 1; i<=5;i++)
			System.out.println(i);
		try {
			Thread.sleep(4000);
		}
		catch(InterruptedException e){		
		}
	}
	
}
public class RunableInterface {
	public static void main(String[] args)  {
		Runnable note = new Note();
		Letter letter = new Letter();
		
		Thread t1 = new Thread(note);
		t1.start();
		letter.start();

		System.out.println("End of the program");
	}
}
