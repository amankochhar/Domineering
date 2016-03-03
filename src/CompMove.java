import java.util.Scanner;

public class CompMove extends PrintBoard{
	
	public static void FirstMove(String board[][], int num){
		
		System.out.println("Computer plays: ");
		// computers first move by default placed
		board[0][1] = "|";
		board[1][1] = "|";		
	}
	
	public static void Move(String board[][], int num){
		// Computers move calculated using minmax strategy and decision trees - works as 2nd player now with 1st move already played


	}
}