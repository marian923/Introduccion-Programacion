package co.edu.usta.tunja.array.dimensional.v3;

import javax.swing.*;

public class Bidimensional {
    //
    public static void main(String[] args) {
        int[][] matrix;
        int value, biggestNumber, lengthBiggestNumber = 0;
        String columns, rows, input;
        columns = JOptionPane.showInputDialog("This program creates dynamic bi-dimensional arrays, " +
                "\nPlease, type/input the size of columns:");
        while (Integer.parseInt(columns)<=0) {
            columns = JOptionPane.showInputDialog("The size should be greater than 0! Please, type/input again the size of columns");
        }
        rows = JOptionPane.showInputDialog("Now, type/input the size of rows:");
        while (Integer.parseInt(rows) < 1) {
            rows = JOptionPane.showInputDialog("The size should be greater than 0! Please, type/input again the size of rows");
        }
        matrix = new int[Integer.parseInt(rows)][Integer.parseInt(columns)];
        JOptionPane.showMessageDialog(null, "Please, type the values for the bi-dimensional array of: " + rows + " and " + columns + ".");
        for (int i = 0; i < Integer.parseInt(rows); i++) {
            for (int j = 0; j < Integer.parseInt(columns); j++) {
                input = JOptionPane.showInputDialog("Please, type the value of Array [" + i + "][" + j + "].");
                value = Integer.parseInt(input);
                matrix[i][j] = value;
            }
        }
        JOptionPane.showMessageDialog(null,stringMatrix(matrix, rows, columns));
        biggestNumber=findBiggestValueImMatrix(matrix);
        lengthBiggestNumber=countDigitsNumber(biggestNumber);
    }

    public static String stringMatrix(int[][] matrix, String rows, String columns) {
        String finalAnswer="";
        for (int i = 0; i < Integer.parseInt(rows); i++) {
            for (int j = 0; j < Integer.parseInt(columns); j++) {
                finalAnswer+=matrix[i][j] + " "; //Sirve para imprimir los números de la matriz [i] (que son los j) y deja un espacio entre ellos
            }
            finalAnswer+="\n"; //Cuando termina de imprimir los números de la matriz [i] (quiere decir que son los j), crea una nueva línea
        }
        return finalAnswer;
    }
    public static int findBiggestValueImMatrix(int [][] matrix){ //sirve para verificar el numero mayor del arreglo
        int biggest=matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (biggest<matrix[i][j]){//verify if value strorage in the matrix is biggest than value storage in the variable
                    biggest=matrix[i][j];

                }

            }

        }
        return biggest;
    }
    public static int countDigitsNumber(int myNumber){ //subprograma para sirve verificar cual es la longuitud del numero mayor
        String value = String.valueOf(myNumber);
        return value.length();
    }
}
