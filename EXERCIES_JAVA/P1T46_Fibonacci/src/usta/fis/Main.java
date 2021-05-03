package usta.fis;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to Fibonacci Software. Please, insert the limit of dates that you want see of Fibonacci serie:");
		int v_limit = keyboard.nextInt();
		int[] v_fibonacci = new int[100];
		v_fibonacci= serie_fibonacci(v_limit);
		System.out.println("Fibonacci Series upto " + v_limit);
		for(int i=0;v_fibonacci[i]!=-1;i++){
			System.out.print(v_fibonacci[i]+ ", ");
		}

	}
	public static int []serie_fibonacci(int v_limit){
		int v_fibonacci[] = new int[100];
		v_fibonacci[0] = 0;
		v_fibonacci[1] = 1;
		for (int i=1; (v_fibonacci[i-1]+v_fibonacci[i]) < v_limit;i++){
			v_fibonacci[i+1] = v_fibonacci[i-1] + v_fibonacci[i];
			v_fibonacci[i+2] = -1;
		}
		return v_fibonacci;
	}
}
