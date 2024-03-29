import java.util.*;

public class TTT {
	public static int row,column;
	static Scanner sc=new Scanner(System.in);
	public static char[][] board=new char[3][3];
	public static char turn='X';
	
	public static void main(String[] args)
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				board[i][j]='_';
		
			}
		}
		play();
		//printBoard();
	}
	
	public static void play()
	{
		boolean playing=true;
		while(playing)
		{
			System.out.println("please enter row and column number");
			row=sc.nextInt()-1;
			column=sc.nextInt()-1;
			board[row][column] = turn;
			
			if(gameOver(row, column))
			{
				playing=false;
				System.out.println("player "+turn+" won");
			}
				
			printBoard();
			if(turn=='X')
				turn='O';
			else
				turn ='X';
			
			
		}
	}
	
	public static void printBoard()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println();
			for(int j=0;j<3;j++)
			{
				if(j==0)
					System.out.print("| ");
				System.out.print(board[i][j]+" | ");
			}
			
		}
		System.out.println();
	}
	public static boolean gameOver(int rMove,int cMove)
	{
		//check perpendicular victory
		if(board[0][cMove]==board[1][cMove]&& board[0][cMove]==board[2][cMove])
			return true;
		if(board[rMove][0]==board[rMove][1]&&board[rMove][0]==board[rMove][2])
			return true;
		//check diagonal victory
		if(board[0][0]==board[1][1]&&board[0][0]==board[2][2]&&board[1][1]!='_')
			return true;
		if(board[0][2]==board[1][1]&&board[0][2]==board[2][0]&&board[1][1]!='_')
			return true;
		return false;
	}

}
