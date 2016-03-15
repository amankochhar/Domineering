// done
import java.util.Scanner;

public class PlayerMove extends PrintBoard{
	
	public static void play(String board[][], int num){
		// Players move - get input, check if move legal and add to board
		
		System.out.println("Player 1 Moves");
		System.out.println("Please enter the row");
		int rowp = scan.nextInt();
		System.out.println("Please enter the column");
		int colp = scan.nextInt();
		if(rowp > 5 || colp > 4 || rowp < 0 || colp < 0){
			System.out.println("This is not a valid move. Please play move again");
			play(board, num);
		}
		else{
		// check if legal move or not
		if(board[rowp][colp] == "." && board[rowp][colp+1] == "."){
		// Saving player move on board
		CompMove.place_item(rowp, colp, "HORIZONTAL", true);
			
		//board[rowp][colp] = "-";
		//board[rowp][colp+1]="-";
		printing(board, num);
		}
		else{
			System.out.println("This is not a valid move. Please play move again");
			play(board, num);
			}
		}
		
	}
}