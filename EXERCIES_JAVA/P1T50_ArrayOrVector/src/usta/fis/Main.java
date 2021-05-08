package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int array[]=new int[5];
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Please type 5 values to the array");
        //array[i] es donde se almacena el resultado en si

        for (int i = 0; i < array.length; i++) {
            System.out.println("please type value "+ (i+1));
            array[i]= keyboard.nextInt();
            while (array[i] %2==0){ //este while sirve para validar que si ingresa un numero par(que si su residuo es 0 se evidencia que es par) mande un error y luego este le permita volver a digitar el numero
                System.err.println("numero incorrecto por favor digitelo de nuevo");
                array[i]= keyboard.nextInt();
            }
        }

    }






}

