package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int rows = 5, columns =4;
        Scanner keyboard =new Scanner(System.in);
        int [][] matrix = new int[rows][columns];
        System.out.println("Please type the values for the bidimensiional array(matrix)");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("This value will locate in matrix["+i+"]["+j+"]=");
                matrix[i][j]= keyboard.nextInt();
            }
        }
        System.out.println("The values inserted were: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println(" "+matrix[i][j]+ " ");
                if(matrix[i][j]<10){ // se creo porque cuando los digitos eran menores que 10 los espacios quedaban mal ubicados, solo se evalua la condicion cuando el numero digitado es menor a 10
                    System.out.print(" ");
                }
            }
            System.out.println(""); //imprime un espacio para que vaya a la otra fila
        }
    }
}
