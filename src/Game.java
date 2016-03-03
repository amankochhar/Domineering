public class Game{
	
	public static void main(String args[]){
		
	    int num = 6; // Matrix Size may be made dynamic in future versions

	    // creating array of size num+1 for win checker to work 
	    String[][] board = new String[num][num];
	    
		// initializing the board
		for (int i = 0; i< num; i++ ){
			for(int j = 0; j< num; j++){
				board[i][j] = ".";
			}
		}
		
		// computers first move by default placed
		board[0][1] = "|";
		board[1][1] = "|";
		
		// Welcome Message
		System.out.println("Welcome to Domineering game");
		System.out.println("This is a 6x6 matrix game and the computer will move first");
		System.out.println("All the best :)");
		System.out.println();
		
		// Main Game
		PrintBoard.printing(board, num);
		while(WinChecker.Winner(board, num) == false){
		PlayerMove.play(board, num);
		CompMove.Move(board, num);
		}
		
	}
}