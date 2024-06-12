package multithreading;

class Book extends Thread{
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

class Num extends Thread{
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
public class ThreadClass {
	public static void main(String[] args)  {
		Book book = new Book();
		Num num = new Num();
		book.start();
		num.start();

		System.out.println("End of the program");
	}
}
