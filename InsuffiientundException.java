package day15;

// UserDefined Exception
public class InsuffiientundException extends Exception {
	
	double amount;
	InsuffiientundException(double amt){
		amount = amt;
	}
}
