package usta.fis;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to Fibonacci Software. Please, insert the limit of dates that you want see of Fibonacci serie:");
		int v_limit = keyboard.nextInt();
		while (v_limit <= 0) {
			System.err.println("Remember, the number should be greater than 0. Please, input the number again.");
			v_limit = keyboard.nextInt();
		}
		int[] v_fibonacci = new int[v_limit];

		v_fibonacci[0] = 1;
		v_fibonacci[1] = 1;

		for (int i = 2; i < v_limit; i++) {
			v_fibonacci[i] = v_fibonacci[i - 1] + v_fibonacci[i - 2];
		}

		System.out.println("Fibonacci Series upto " + v_limit);
		for (int i = 0; i < v_limit; i++) {
			System.out.print(v_fibonacci[i] + " ");
		}
	}
}
