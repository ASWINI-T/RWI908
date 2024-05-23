package day3;

public class Access_Specifiers {

	public static void main(String[] args) {
		Stack obj = new Stack();
		obj.push(20);
		obj.push(78);
		obj.push(67);	
		
//		we can directly assign the value into the stack if variables is not private
//		int test =obj.arr[4]= 72;
//		System.out.println("not private " +test);
//		
		obj.push(88);
		obj.push(48);
		
		obj.display();
		
		obj.pop();
		obj.pop();
		obj.display();
	}


}
