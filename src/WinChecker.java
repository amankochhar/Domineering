// done
public class WinChecker extends Game{
	
	public static boolean Winner(String board[][], int num){
		// checks if there is a winner or not
		boolean winner = true;
		for(int i = 0; i < num-1; i++){
			for(int j = 0; j < num-1; j++){
				// checking row
				if(board[i][j] == "." && board[i][j+1] == "." || board[num-1][j] == "." && board[num-1][j+1] == "."){
					if(board[i][j] == "." && board[i+1][j] == "." || board[i][num-1] == "." && board[i+1][num-1] == "."){
						winner = false;
					}
				}
				// checking column
				if(board[i][j] == "." && board[i+1][j] == "." || board[i][num-1] == "." && board[i+1][num-1] == "."){
					if(board[i][j] == "." && board[i][j+1] == "." || board[num-1][j] == "." && board[num-1][j+1] == "."){
					winner = false;
					}
				}
			}
		}
		return winner;	
		
	}
}
