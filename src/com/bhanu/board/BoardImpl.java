package com.bhanu.board;

public class BoardImpl implements Board {

	@Override
	public void getBordStatus(char[][] board) {
		// method to get current status of the board
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}

}
