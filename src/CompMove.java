

public class CompMove extends PrintBoard{
	
	private static final int RECURSIVITY = 4;
	private static final String VERTICAL = "VERTICAL";
	private static final String HORIZONTAL = "HORIZONTAL";
	private static  int row=0;
	private static int column=0;
	

	public static void FirstMove(String board[][], int num){
		
		System.out.println("Computer plays: ");
		// computers first move by default placed
		//board[0][1] = "|";
		//board[1][1] = "|";
		minimax();
	}
	
	public static void Move(String board[][], int num){
		// Computers move calculated using minmax strategy and decision trees - works as 2nd player now with 1st move already played

		minimax();
	}
	
	public static void minimax(){
		int i = 0;
		int j = 0;
		System.out.println("Computer turn using minimax...");
		max(RECURSIVITY, VERTICAL, i, j);
		System.out.println("Placed item on column "+ column + ", row " + row );;
		place_item(row, column, VERTICAL, true);
	}
	
	

	static int  max(int recursivity, String dir, int ri, int rj){
		if(recursivity == 0)
			return get_possibilities(VERTICAL) - get_possibilities(HORIZONTAL);

		int eval = -Game.num * Game.num;
		
		for(int i = 0; i < Game.num; i ++){
			for(int j = 0; j < Game.num; j ++){
				if(place_item(i, j, dir, true)){
					int l = min(recursivity-1, ((dir==VERTICAL)?HORIZONTAL:VERTICAL));
					remove_item(i, j, dir);
					if(l > eval){
						eval = l;
						ri = i;
						rj = j;
						column=j;
						row=i;
						
					}
				}
			}
		}
		return eval;
	}
	
	static int get_possibilities(String dir){
		int sum = 0;
		int row_m = 0;
		int col_m = 0;
		if(dir == VERTICAL){
			row_m = 1;
		}else{
			col_m = 1;
		}

		for(int i = 0; i < Game.num-row_m; i++){
			for(int j = 0; j < Game.num-col_m; j++){
				if(board[i][j] == "." && board[i+row_m][j+col_m] == "."){
					sum += 1;
				}
			}
		}

		return sum;
	}
	
	
	
	static boolean place_item(int row, int col, String direction, boolean silent){
		int col_m = 0;
		int row_m = 0;
		String dir;
		if(direction == VERTICAL){
			row_m = 1;
			dir="|";
		}else{
			col_m = 1;
			dir="-";
		}

		if(row+row_m >= Game.num || col+col_m >= Game.num || Game.board[row+row_m][col] != "." || board[row][col+col_m] != "."){
			if(!silent)
				System.out.println("Please check your input and try again." );
			return false;
		}else{
			board[row][col] = dir;
			board[row+row_m][col+col_m] = dir;
		}

		return true;
	}

	static void remove_item(int row, int col, String dir){
		if(dir == VERTICAL){
			board[row][col] = ".";
			board[row+1][col] = ".";
		}else{
			board[row][col] = ".";
			board[row][col+1] = ".";
		}
	}
	
	
	static int min(int recursivity, String dir){
		if(recursivity == 0)
			return get_possibilities(VERTICAL) - get_possibilities(HORIZONTAL);

		int eval = num*num;
		int ri = 0;
		int rj = 0;
		for(int i = 0; i < num; i ++){
			for(int j = 0; j < num; j ++){
				if(place_item(i, j, dir, true)){
					int l = max(recursivity-1, ((dir==VERTICAL)?HORIZONTAL:VERTICAL), ri, rj);
					remove_item(i, j, dir);
					if(l < eval)
						eval = l;
				}
			}
		}
		return eval;
	}
	
	static void computer()
	{
		System.out.println("Computer turn..." );

		int maxI = 0, maxJ = 0;
		int max = -1;

		for(int i = 0; i < num; i ++){
			for(int j = 0; j < num; j ++){
				if(place_item(i, j, VERTICAL, true)){
					int sP = get_possibilities(VERTICAL) - get_possibilities(VERTICAL);
					remove_item(i, j, VERTICAL);
					if(sP > max){
						max = sP;
						maxI = i;
						maxJ = j;
					}
				}
			}
		}

		System.out.println( "Placed item on column " + maxJ+1 +", row " + maxI+1);
		place_item(maxI, maxJ, VERTICAL, true);
	}
	
	
	
	
}