package co.edu.usta.tunja.array.dimensional.v3;

import javax.swing.*;

public class Bidimensional {
    //
    public static void main(String[] args) {
        int[][] matrix;
        int value;
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
}
