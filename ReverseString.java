/*
 * Write a program to reverse a C-style string ('\0 at the end of the string')
 * */

import java.util.*;
public class ReverseString {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string: ");
		StringBuilder input = new StringBuilder();
		
		input.append(sc.nextLine());
		input.append("\0");
		
		System.out.println("Reversed string is "+getReverse(input));
	}
	
	public static String getReverse(StringBuilder sb){
		int l = sb.length();
		int startIndex = 0;
		//point to last character
		int endIndex = l-2;
		
		while(startIndex < endIndex){
			char temp = sb.charAt(startIndex);
			sb.setCharAt(startIndex, sb.charAt(endIndex));
			sb.setCharAt(endIndex, temp);
			startIndex++;
			endIndex--;
		}
		return sb.toString();
	}
}
