package day14;

import java.util.LinkedHashSet;

class String_Ex{

	public static void Count_Occurences(String str) {
		
		char target = 'h';
		int count = 0;
		for(int i = 0; i <str.length(); i++) {
			if(str.charAt(i)== target)
				count++;
		}
		System.out.println("Count Ocuurences: "+count);	
	}
	
	public static void reverse_String(String str) {
//		Using StringBuilder reverse Method
		StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();
        
		System.out.print("Reversed String: " +reversed);
//		Using ForLoop
//		for(int i = str.length()-1;i>=0;i--)
//			System.out.print(str.charAt(i));
	}
	
	public static void isPalindrome(String str) {
		str = str.toLowerCase();
		boolean check = true;
		for(int i =0; i <str.length()/2;i++)
			if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
				check = false;
			}
		System.out.println("\nPalindrome: " +check);		
	}
	
	public static void remove_Duplicates(String str) {
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		for(int i = 0 ; i<str.length();i++) {
			set.add(str.charAt(i));
		}
		
		StringBuilder sb = new StringBuilder();
        for (Character ch : set) {
            sb.append(ch);
        }	
		System.out.println("Removing Duplicates"+ sb.toString());	
	}
	
	public static void areAnagrams(String str1, String str2) {
		str1 = str1.replaceAll("\\s", ""); str2= str2.replaceAll("\\s", "");
		System.out.println("trim str1 "+str1);
		
		 if (str1.length() != str2.length()) {
			 System.out.println("Given Strings Are not Anagrams (no.of words diff)");
			 return;
	     }
		 boolean check =false;
		 for(int i = 0; i<str1.length();i++) {
			 for(int j = 0;j<str2.length();j++) {
				 if(str2.charAt(j)==str1.charAt(i)) {
					 check = true;
				 }	
			 }
			 if (check== false) {
				 System.out.println("given Strings are not anagrams");
				 break;	 
			 } 
		 }
		 System.out.println("given Strings are anagrams"); 
	}
	
	public static void count_Lc_Uc(String str){
		 int LowerCase = 0;
	        int UpperCase = 0;
	        
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            

	            if (ch >= 'a' && ch <= 'z') {
	            	LowerCase++;
	            }	            
	            else if (ch >= 'A' && ch <= 'Z') {
	            	UpperCase++;
	            }
	        }
	        
	        System.out.println("No.of lowercase: " + LowerCase);
	        System.out.println("No.of uppercase: " + UpperCase);
	}
	
	public static void RemoveLowerCase(String str) {
		 str=str.replaceAll("[a-z]","");
		 
	     System.out.println("Removing LowerCase: " + str);
	}
	
	public static void Count_Vowels(String str) {
		int vowelCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels in the string: " + vowelCount);
	}
}


public class RWI_String_Qns {

	public static void main(String[] args) {
		String Str = "AswINi";
		String Str1 ="the classroom";
		String Str2 ="school master"; 
		String_Ex.Count_Occurences(Str);
		String_Ex.reverse_String(Str);
		String_Ex.isPalindrome(Str2);
		String_Ex.remove_Duplicates(Str2);
		String_Ex.areAnagrams(Str1, Str2);
		String_Ex.count_Lc_Uc(Str);
		String_Ex.RemoveLowerCase(Str);
		String_Ex.Count_Vowels(Str2);
	}

}
