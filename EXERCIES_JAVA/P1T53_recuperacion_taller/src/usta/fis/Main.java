package usta.fis;

import java.util.Scanner;

public class Main {
//hacer un programa que lea los numeros de un arreglo y compruebe si el numero digitado es capicua o no
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        int v_cantidad_de_numeros=0;
	int array[]=new int[50];
	System.out.println("Digite la cantidad que quiere tener en su arreglo");
	v_cantidad_de_numeros= keyboard.nextInt();

	for(int i=0;i<v_cantidad_de_numeros;i++){
	    System.out.println("ingrese el numero "+ (i+1));
	    array[i]= keyboard.nextInt();
    }
        System.out.println("Los numeros digitados son capicua: "+capicua(array));
    }
    public static boolean capicua(int []array){
        String palabra = String.valueOf(array);
        for (int i=0, j =palabra.length() -1; i<=j;i++, --j){ //j se desplaza de derecha a izquierda, i se desplaza de izquierda a derecha, a medida que se va aumentando i va reduciendo j
            if (palabra.charAt(i) !=palabra.charAt(j)){
                return false;
            }

        }
        return true;
    }
}
