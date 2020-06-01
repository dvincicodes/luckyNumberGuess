package testy;

import java.util.Arrays;
import java.util.Scanner;

public class luckyNumberGuess {
	
	public static void main(String args[]) {
		
		int guessCnt = 0;
        
		int luckyNumber = 7;
        Scanner scanner = new Scanner(System.in);
        int userInput;

      
        while (guessCnt < 3) {
            userInput = scanner.nextInt();
        	if (userInput != luckyNumber) {
        	System.out.println("Wrong!");
        	guessCnt++;
        		}
        	else{
        		  System.out.println("Correct!"); 
        		  break;
        		  }
            }
        	if (guessCnt == 3) {
        		System.out.println("  ");

        		System.out.println("You Lose!");
        	}
        }
        
      
        
        }

	
