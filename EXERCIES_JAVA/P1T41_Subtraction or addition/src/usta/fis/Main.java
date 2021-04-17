package usta.fis;

/*AUTHOR: Marian Gabriela Mora Guerrero
  DATE:15 april of 2021
  DESCRIPTION: this program allows you to read two integers and ask if you want to do an addition or a subtraction.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("--------------------------");
        System.out.println("Soft Input Num version 1.0");
        System.out.println("MAKER: Marian Gabriela Mora Guerrero");
        System.out.println("---------------------------");
        Scanner keyboard= new Scanner (System.in);

        int v_number1, v_number2, v_sum;
        System.out.println("Input the first number:");
        v_number1= keyboard.nextInt();
        System.out.println("Input the second number:");
        v_number2= keyboard.nextInt();
        v_sum = v_number1+v_number2;
        System.out.println("The total sum is " +v_sum);

        int v_number3, v_number4, v_res;
        System.out.println("Input the first number:");
        v_number3= keyboard.nextInt();
        System.out.println("Input the second number:");
        v_number4= keyboard.nextInt();
        v_res = v_number3-v_number4;
        System.out.println("The total res is " +v_res);

        int v_number5, v_number6, v_multiplication;
        System.out.println("Input the first number:");
        v_number5= keyboard.nextInt();
        System.out.println("Input the second number:");
        v_number6= keyboard.nextInt();
        v_multiplication = v_number5*v_number6;
        System.out.println("The total multiplication is " +v_multiplication);

    }

    }










