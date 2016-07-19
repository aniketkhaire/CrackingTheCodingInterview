/*
 * Write a program to replace all spaces by %20 in a given string
 * */

import java.util.*;
public class SpaceSwitch {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input line: ");
		String inputStr = sc.nextLine();
		
		System.out.println("Modified strig is \n"+ spaceSwitch(inputStr));
	}
	
	public static String spaceSwitch(String inputString){
		int spaceCount = 0;
		
		for(int i=0; i<inputString.length(); i++){
			if(inputString.charAt(i) == ' ')
				spaceCount++;
		}
		
		char outputStr[] = new char[inputString.length() + (2*spaceCount)];
		
		int j = outputStr.length - 1;
		for(int i = inputString.length()-1; i>=0; i--){
			if(inputString.charAt(i) == ' '){
				outputStr[j] = '0';
				outputStr[j-1] = '2';
				outputStr[j-2] = '%';
				j = j-3;
			}else{
				outputStr[j] = inputString.charAt(i);
				j--;
			}			
		}
		return String.valueOf(outputStr);
	}
}
