package usta.fis;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to Fibonacci Software. Please, insert the limit of dates that you want see of Fibonacci series:");
        int v_limit = keyboard.nextInt();
        System.out.println("Fibonacci Series to " + v_limit);
        series_fibonacci(v_limit);
    }

    public static int[] series_fibonacci(int v_limit) {
        int[] v_fibonacci = new int[100];
        v_fibonacci[0] = 0;
        v_fibonacci[1] = 1;
        int i = 1;
        int j = 0;
        while ((v_fibonacci[i - 1] + v_fibonacci[i]) < v_limit) {
            v_fibonacci[i + 1] = v_fibonacci[i - 1] + v_fibonacci[i];
            v_fibonacci[i + 2] = -1;
            i++;
        }
        while (v_fibonacci[j] != -1) {
            if (j < i) {
                System.out.print(v_fibonacci[j] + ", ");
            }
            if (j == i) {
                System.out.print(v_fibonacci[j]);
            }
            j++;
        }
        return v_fibonacci;
    }
}
