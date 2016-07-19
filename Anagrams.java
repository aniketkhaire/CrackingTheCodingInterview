import java.util.*;

/*
 * Write a program to check whether the two strings are anagram of each other or not
 * */
public class Anagrams {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1: ");
		String str1 = sc.nextLine();
		System.out.println("Enter string 2: ");
		String str2 = sc.nextLine();
		
		System.out.println("Both strings are anagrams of each other? "+ isAnagram(str1, str2));
	}
	
	public static boolean isAnagram(String str1, String str2){
		if(str1.length() != str2.length())
			return false;
		int resultSet[] = new int[256];
		int uniqueChars = 0;
		
		for(int i=0; i<str1.length(); i++){
			char thisChar = str1.charAt(i);
			if(resultSet[thisChar] == 0)
				uniqueChars++;
			resultSet[thisChar]+=1;
		}
		
		for(int i=0; i<str2.length(); i++){
			char thischar = str2.charAt(i);
			if(resultSet[thischar] == 0)
				return false;
			resultSet[thischar]-=1;
			if(resultSet[thischar] == 0)
				uniqueChars--;
		}
		
		if (uniqueChars ==0)
			return true;		
		return false;
	}
}
