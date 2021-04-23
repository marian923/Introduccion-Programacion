package usta.fis;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
    	Scanner entrada = new Scanner(System.in);
    	int nElementos;

    	nElementos= Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo"));

    	int [] p_array_or_vector = new int[nElementos];

    	System.out.println("Digite los elementos del arreglo: ");
    	for (int i=0;i<nElementos;i++){
    		System.out.println((i+1)+ " Digite el numero: ");
    		p_array_or_vector[i] = entrada.nextInt();
		}
    	System.out.println("Las calificaciones son: ");
    	for (int i=0;i<nElementos;i++){
    		System.out.println(p_array_or_vector[i]);
		}
    }
}

