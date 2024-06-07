package day14;

public class Count_Char_Freq {
	 public static void main(String[] args) {
	        String str = "Banana Tree";
	        countCharFreq(str);
	    }

	    public static void countCharFreq(String str) {
	    	str = str.replaceAll("\\s", "");
	    	System.out.println("Count char" +str);
	        int[] frequency = new int[256];

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            frequency[ch]++;
	        }

	        System.out.println("Character frequencies:");
	        for (int i = 0; i < 256; i++) {
	            if (frequency[i] > 0) {
	                System.out.println((char) i + ": " + frequency[i]);
	            }
	        }
	    }
}


