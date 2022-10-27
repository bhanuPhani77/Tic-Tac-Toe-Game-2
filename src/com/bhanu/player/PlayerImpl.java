package com.bhanu.player;

public class PlayerImpl implements Player {

	@Override
	public char whoWon(char[][] board) {

		// for checking rows
		for (int i = 0; i < 3; i++) {
			if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
				return board[0][i];
			}
		}
		// for checking columns
		for (int j = 0; j < 3; j++) {
			if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-') {
				return board[0][j];
			}
		}

		// for checking diagonally
		if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[1][1] != '-') {
			return board[0][0];
		}
		if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[1][1] != '-') {
			return board[2][0];
		}
		return '-';

	}

	@Override
	public boolean isTied(char[][] board) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == '-') {
					return false;
				}
			}
		}
		return true;
	}

}
