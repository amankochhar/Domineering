// done
public class WinChecker extends Game{
	
	public static boolean Winner(String board[][], int num){
		// checks if there is a winner or not
		boolean winner = false;
		for(int i = 0; i < num-1; i++){
			for(int j = 0; j<num-1; j++){
				if(board[i][j] == "." && board[i][j+1] == "." || board[num-1][j] == "." && board[num-1][j+1] == "."){
					winner = false;
				}
				if(board[i][j] == "." && board[i+1][j] == "." || board[i][num-1] == "." && board[i+1][num-1] == "."){
					winner = false;
				}
				else{
					//winner = true;
					//System.out.println("We have a winner!");
					//break;
				}
			}
		}
		return winner;	
		
	}
}
