/**
 * Created by Aniket on 7/15/2016.
 * Write a program to find whether the given string contains all unique characters or not.
 */
import java.util.*;

public class UniqueCharactersInAString {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = sc.nextLine();

        System.out.println("The string is unique: "+isUnique(inputStr));
    }
    public static boolean isUnique(String inputStr) {
        //Assuming the input string to contain only ASCII characters.
        boolean validationArray[] = new boolean[256];
        for (int i = 0; i < inputStr.length(); i++) {
            char thisChar = inputStr.charAt(i);
            if (validationArray[thisChar])
                return false;
            validationArray[thisChar] = true;
        }
        return true;
    }
}