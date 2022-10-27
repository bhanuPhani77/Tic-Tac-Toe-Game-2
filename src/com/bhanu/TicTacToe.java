package com.bhanu;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bhanu.board.BoardImpl;
import com.bhanu.player.PlayerImpl;

public class TicTacToe {
	static boolean isP1 = true;
	static boolean gameEnded = false;
	static int row = 0, col = 0;
	static Scanner sc = new Scanner(System.in);
	static char[][] board;

	public static void main(String[] args) {
		BoardImpl b = new BoardImpl();
		PlayerImpl p = new PlayerImpl();
		// taking two players names

		String p1, p2;
		System.out.println("enter your name for p1");
		p1 = sc.next();
		System.out.println("enter your name for p2:");
		p2 = sc.next();
		// a 2 dimensional array with size 3
		board = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = '-';
			}
		}
		// what symbols are using to play
		while (!gameEnded) {
			// draw the board
			b.getBordStatus(board);
			char symbol = ' ';
			if (isP1) {
				symbol = 'x';
			} else {
				symbol = 'o';
			}
			if (isP1) {
				System.out.println(p1 + "'s turn (x)");
			} else {
				System.out.println(p2 + "'s turn (o)");
			}
			play();

			// set the position on game board
			board[row][col] = symbol;
			if (p.whoWon(board) == 'x') {
				System.out.println(p1 + " has won.");
				gameEnded = true;
			} else if (p.whoWon(board) == 'o') {
				System.out.println(p2 + " has won.");
				gameEnded = true;
			} else {
				if (p.isTied(board)) {
					System.out.println("game is tied!!");
					gameEnded = true;
				} else {
					// continuing the turns
					isP1 = !isP1;
				}
			}
		}
		// get the current status of the board
		b.getBordStatus(board);
	}

	public static void play() {
		boolean b = true;
		while (b) {
			try {
				System.out.println("enter row: (0,1 or 2)");
				row = sc.nextInt();
				System.out.println("enter col: (o,1 or 2)");
				col = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Invalid input");
				sc = new Scanner(System.in);
				continue;
			}
			if (row < 0 || col < 0 || row > 2 || col > 2) {
				System.out.println("row and column are out of range:");
			} else if (board[row][col] != '-') {
				System.out.println("already occupied:");
			} else {
				break;
			}

		}
	}
}
