package TicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {

	Deque<Player> players;
	Board gameBoard;
	
	public TicTacToeGame() {
		initializeGame();
	}
	
	public void initializeGame() {
		players = new LinkedList<>();
		
		PlayingPiece crossPiece = new PlayingPieceX();
		Player player1 = new Player("Player 1", crossPiece);
		
		PlayingPiece noughtPiece = new PlayingPieceO();
		Player player2 = new Player("Player 2", noughtPiece);
		
		players.add(player1);
		players.add(player2);
		
		gameBoard = new Board(3);
		
	}
	
	public String startGame() {
		boolean noWinner = true;
		while(noWinner) {
			Player playerTurn = players.removeFirst();
			List<Pair<Integer, Integer>> freeSpace = gameBoard.getFreeCells();
			if(freeSpace.isEmpty()) {
				noWinner = false;
				continue ;
			}
			
			System.out.print("Player: " + playerTurn.name + " Enter row, column: ");
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			String str[] = s.split(",");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);
			
			boolean pieceAddedSuccessfully = gameBoard.addPiece(x, y, playerTurn.playingPiece);
			if(!pieceAddedSuccessfully) {
				System.out.println("Incorrect position choosen, try again");
				players.addFirst(playerTurn);
				continue;
			}
			players.addLast(playerTurn);
			gameBoard.printBoard();
			boolean winner = isThereWinner(x, y,playerTurn.playingPiece.pieceType);
			if(winner) {
				return playerTurn.name;
			}
		}
		return "tie";
	}
	
	public boolean isThereWinner(int row, int column, PieceType pieceType) {
		boolean rowMatch = true;
		boolean columnMatch = true;
		boolean diagonalMatch = true;
		boolean antiDiagonalMatch = true;
		
		for(int i=0;i<gameBoard.size;i++) {
			if(gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType) {
				rowMatch = false;
			}
		}
		
		for(int i=0;i<gameBoard.size;i++) {
			if(gameBoard.board[i][column] == null || gameBoard.board[i][column].pieceType != pieceType) {
				columnMatch = false;
			}
		}
		
		for(int i=0;i<gameBoard.size;i++) {
			if(gameBoard.board[i][i] == null || gameBoard.board[i][i].pieceType != pieceType) {
				diagonalMatch = false;
			}
		}
		
		for(int i=0;i<gameBoard.size;i++) {
			if(gameBoard.board[i][gameBoard.size-i-1] == null || gameBoard.board[i][gameBoard.size-i-1].pieceType != pieceType) {
				antiDiagonalMatch = false;
			}
		}
		
		if(rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch)
			return true;
		
		return false;
	}
}
