import java.util.Scanner;

// done
public class PrintBoard extends Game {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void printing(String board[][], int num){
		// prints game board
		System.out.println("   0 1 2 3 4 5");
		System.out.println();
		
		for (int i = 0; i < num; i++ ){
			System.out.print(i+"  ");
			for(int j = 0; j < num; j++ ){
				System.out.print(board[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("");
		
	}
}