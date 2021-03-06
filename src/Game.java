import java.util.Scanner;

public class Game{
	  static int num = 6; // Matrix Size may be made dynamic in future versions
	  static String[][] board = new String[num][num];
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
	    
		// initializing the board
		for (int i = 0; i< num; i++ ){
			for(int j = 0; j< num; j++){
				board[i][j] = ".";
			}
		}
		
		// Welcome Message
		System.out.println("Welcome to Domineering game");
		System.out.println("This is a 6x6 matrix game");
		System.out.println("Menu");
		System.out.println("Play: ");
		System.out.println("Vs. Computer (Press 1)");
		System.out.println("Vs. Player 2 (Press 2)");
		int answer = scan.nextInt();
		if(answer == 1){ 
			// First move by computer - predefined
			CompMove.FirstMove(board, num);
			PrintBoard.printing(board, num);
			while(WinChecker.Winner(board, num) == false)
			{
			PlayerMove.play(board, num);
			CompMove.Move(board, num);
			PrintBoard.printing(board, num);
			//main(args);
			}
			if(WinChecker.Winner(board, num) == true){
				System.out.println("We have a winner!");
				System.exit(0);
			}
		}
		if(answer == 2){
			System.out.println("All the best :)");
			System.out.println();
			PrintBoard.printing(board, num);
			while(WinChecker.Winner(board, num) == false){
			PlayerMove.play(board, num);
			Player2Move.Move(board, num);
			}
			if(WinChecker.Winner(board, num) == true){
				System.out.println("We have a winner!");
				System.exit(0);
			}
		}
		else{
			System.out.println("Please choose again");
			main(args);
		}
	}
}