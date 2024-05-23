package day3;


public class Stack{
	private int[] arr = new int[5];
	private	int top;
	
	Stack(){
		top = -1;
	}
	
	public void push(int val) {
		if(top==4) {
			System.out.println("Stack is full");
		}
		else {
			arr[++top]= val;
		}
	
	}
	
	public void pop() {
		if(top>=0){
			System.out.println("return last item from the stack " + arr[top--]);
		}
		else {
			System.out.println("stack is empty");
		}
	}
	
	 public void display() {
		 
		 if (top >= 0) { 
	       System.out.println("Stack elements are:");
	          for (int i = 0; i <= top; i++) {
	             System.out.print(arr[i] + " ");
	          }
	        } else {
	            System.out.println("Stack is empty");
	        }
         System.out.println(" ");
	    }
}



