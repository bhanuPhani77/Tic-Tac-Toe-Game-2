package com.bhanu.board;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		while(true)
		{
			try {
				System.out.println("ENTER NUM");
				n = sc.nextInt();
				 
			}catch (InputMismatchException e) {
				System.out.println("invali input");
				sc.next();
			}
			
		}

	}

}
