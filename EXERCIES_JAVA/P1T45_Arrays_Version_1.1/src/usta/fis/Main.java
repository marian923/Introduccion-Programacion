package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float [] numbers = new float[5];

        for(int counter=0;counter<5;counter++){
            System.out.print((counter+1)+". Digite el numero: ");
            numbers[counter]= entrada.nextFloat();
        }
        System.out.println("Su calificacion del corte es");
        for( float counter:numbers){
            System.out.println(counter);
        }
    }
}
