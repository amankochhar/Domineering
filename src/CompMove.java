import java.util.Scanner;

public class CompMove extends PrintBoard{
	
	public static void Move(String board[][], int num){
		// Computers move calculated using minmax strategy and decision trees - works as 2nd player now with 1st move already played
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Computer Move");
		System.out.println("Please enter the row");
		int rowc = scan.nextInt();
		System.out.println("Please enter the column");
		int colc = scan.nextInt();
		if(rowc > 4 || colc > 5 || rowc < 0 || colc < 0){
			System.out.println("This is not a valid move. Please play move again");
			Move(board, num);
		}
		else{
		// check if legal move or not
		if(board[rowc][colc] == "." && board[rowc+1][colc] == "."){
		// Saving player move on board
		board[rowc][colc] = "|";
		board[rowc+1][colc]="|";
		printing(board, num);
		}
		else{
			System.out.println("This is not a valid move. Please play move again");
			Move(board, num);
			}
		}
	}
}