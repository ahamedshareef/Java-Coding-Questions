package Splunk_karat;

public class CheckPasswordRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}

/*

You are working on an authentication system and there is a set of rules the users have to follow when picking a new password:

1. It has to be at least 16 characters long.
2. The password cannot contain the word "password". This rule is not case-sensitive.
3. The same character cannot be used more than 4 times. This rule is case-sensitive, "a" and "A" are different characters.
4. The password has to contain at least one uppercase and one lowercase letter.
5. The password has to contain at least one of the following special characters "*","#","@".

Write a function that takes in a password and returns a collection of any rule numbers that are not met.

password_1 = "Strongpwd9999#abc"             ==> []
password_2 = "Less10#"                       ==> [1]
password_3 = "Password@"                     ==> [1,2]
password_4 = "#PassWord011111112222223x"     ==> [2,3]
password_5 = "password#1111111"              ==> [2,3,4]
password_6 = "aaaapassword$$"                ==> [1,2,3,4,5]
password_7 = "LESS10#"                       ==> [1,4]
password_8 = "SsSSSt#passWord"               ==> [1,2]
password_9 = "SsSSSt#passWordpassword"       ==> [2,3]


All test cases:

validate(password_1) ==> []
validate(password_2) ==> [1]
validate(password_3) ==> [1,2]
validate(password_4) ==> [2,3]
validate(password_5) ==> [2,3,4]
validate(password_6) ==> [1,2,3,4,5]
validate(password_7) ==> [1,4]
validate(password_8) ==> [1,2]
validate(password_9) ==> [2,3]


Complexity variables:

N = length of the password

*/

import java.io.*;
import java.util.*;
import javafx.util.Pair;

public class Solution {
  public static void main(String[] argv) {
    String password_1 = "Strongpwd9999#abc";
    String password_2 = "Less10#";
    String password_3 = "Password@";
    String password_4 = "#PassWord011111112222223x";
    String password_5 = "password#1111111";
    String password_6 = "aaaapassword$$";
    String password_7 = "LESS10#";
    String password_8 = "SsSSSt#passWord";
    String password_9 = "SsSSSt#passWordpassword";
    authenticationCheck(password_8);
  }
  
  public static int[] authenticationCheck(String password){
    
    List <Integer> ans = new ArrayList<Integer>();
   boolean charLen = false;// 1. It has to be at least 16 characters long.
   boolean isPass = false;//2. The password cannot contain the word "password". This rule is not case-sensitive.
   boolean fourOrMore = false;//3. The same character cannot be used more than 4 times. This rule is case-sensitive, "a" and "A" are different characters.
  boolean isUpper = false; boolean isLower=false;//4. The password has to contain at least one uppercase and one lowercase 
  boolean isSpecial = false; //5. The password has to contain at least one of the following special characters "*","#","@".
    
    
    int n = password.length(); // password lenght.
    
    if(n >= 16){ charLen=true;ans.add(1); } //1
    if(!password.toLowerCase().isequals("password")) { isPass=true;ans.add(2); } //2
    //4
    char[] chars = password.toCharArray();
    
    for(int i=0;i<n;i++){
      if(Character.isUpperCase(chars[i]))
      {
        isUpper=true;
      }
      
      if(Character.isLowerCase(chars[i]))
      {
        isLower=true;
      }
      
     
      if(isUpper && isLower){
        ans.add(4);
        break;
      }
      
    }
    
    //5
    for(int i=0;i<n;i++){
    
     if(chars[i]=='*' || chars[i]=='#' || chars[i]=='@')
      {
        isSpecial = true;
        ans.add(5);
        break;
      }
      
    }
    
    // 3
    int[] count = new int[128];
    
    
    for(int i=0;i<n;i++){
      count[chars[i]]++;
    }
    
    for(int i=0;i<count.lenght;i++){
      if(count[i] <=4) {
        continue;
      }
      else{
        break;
      }
      fourOrMore = true;
      ans.add(3);
    }
       
    return List.asArrays(ans);
    
  }
}


public static boolean authenticatePassword(String password) {
    // Rule 1: Password should not contain "password"
    if (password.toLowerCase().contains("password")) {
        return false;
    }

    // Rule 2: Password should have at least one uppercase and one lowercase letter
    boolean hasUpperCase = false;
    boolean hasLowerCase = false;

    // Rule 3: Password can have lower, upper, and special characters "*", "#", "@"
    char[] specialChars = {'*', '#', '@'};

    // Rule 4: No character should be used more than 4 times consecutively
    int consecutiveCount = 1;

    for (int i = 0; i < password.length(); i++) {
        char currentChar = password.charAt(i);

        // Check for uppercase and lowercase letters
        if (Character.isUpperCase(currentChar)) {
            hasUpperCase = true;
        } else if (Character.isLowerCase(currentChar)) {
            hasLowerCase = true;
        }

        // Check for special characters
        for (char specialChar : specialChars) {
            if (currentChar == specialChar) {
                // Handle consecutive characters
                if (i > 0 && currentChar == password.charAt(i - 1)) {
                    consecutiveCount++;
                    if (consecutiveCount > 4) {
                        return false;
                    }
                } else {
                    consecutiveCount = 1;
                }
            }
        }
    }

    return hasUpperCase && hasLowerCase;
    }
