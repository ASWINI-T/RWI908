package day15;

public class CustomExceptionEx {
	public static void main(String[] args) {
		double bal = 500;
		double withdraw =700;
		
		try {
		if(bal<withdraw) 
			throw new InsuffiientundException(withdraw-bal);
		}
		catch(InsuffiientundException e){
			System.out.println("Not enough money");
		}

	}

}
