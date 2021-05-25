package usta.fis;

import javax.swing.*;
public class Main {

	public static void main(String[] args) {
		int [][] matrixBuses,matrixBuses_value;
		int columnas=4, value, asiento=0;
		String filas, input;
		filas= JOptionPane.showInputDialog("Por favor inserte el numero de filas");
		matrixBuses=new int[Integer.parseInt(filas)][columnas];
		matrixBuses_value=new int[Integer.parseInt(filas)][columnas];
		for (int i = 0; i < Integer.parseInt(filas); i++) {
			for (int j = 0; j < columnas; j++) {
				asiento++;
				matrixBuses_value[i][j] = asiento;
			}
		}
		JOptionPane.showMessageDialog(null, Visualicionasientos(matrixBuses_value, filas));
		JOptionPane.showMessageDialog(null, "Los valores ingresados del arreglo fueron: " + filas + " and " + columnas + ".");
		for (int i = 0; i < Integer.parseInt(filas); i++) {
			for (int j = 0; j < 4; j++) {
				input = JOptionPane.showInputDialog("Please, type the value of Array [" + i + "][" + j + "].");
				value = Integer.parseInt(input);
				matrixBuses[i][j] = value;
			}
		}
	}
	public static String Visualicionasientos(int[][] matrixBuses_value, String filas) {
		String asiento = "";
		for (int j = 0; j < 4; j++){
			for (int i = 0; i < Integer.parseInt(filas); i++) {
				{
					if (matrixBuses_value[i][j] % 2 == 0) {
						asiento += "D ";
					} else {
						asiento += "X ";
					}
				}
			}
			asiento += "\n";
		}
		return asiento;
	}
}
