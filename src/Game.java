import java.util.Scanner;

public class Game{
	
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
	    int num = 6; // Matrix Size may be made dynamic in future versions

	    // creating array of size num+1 for win checker to work 
	    String[][] board = new String[num][num];
	    
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
			//System.out.println("Coming Soon :)");
			// First move by computer
			CompMove.FirstMove(board, num);
			PrintBoard.printing(board, num);
			while(WinChecker.Winner(board, num) == false){
			PlayerMove.play(board, num);
			CompMove.Move(board, num);
			//main(args);
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
		}
		else{
			System.out.println("Please choose again");
			main(args);
		}

	}
}