package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int numberOne=0;
	int numberTwo=0;
	int result=0;
	int operationToDo=0;
	Scanner keyboard = new Scanner(System.in);
	programInfo();
	System.out.println("please type the aritmetic operation: 1 to add, 2 to subtract, 3 multiply, 4 divide, 5 numbers prime");
	operationToDo=keyboard.nextInt();
	System.out.println("please type the first number: ");
	numberOne=keyboard.nextInt();
	System.out.println("please type the second number: ");
	numberTwo=keyboard.nextInt();
	result=operationCalc(numberOne, numberTwo, operationToDo);

	System.out.println("The result is: "+result);

    }
    public static int operationCalc(int number1, int number2, int operation){

        if (operation==1){
            return number1+number2;
        }
        if (operation==2){
            return number1-number2;
        }
        if (operation==3){
            return number1*number2;
        }
        if (operation==4&&number2>0){
            return number1/number2;
        }
        if (operation==5){
            p_validate_prime(number1);
            return number1/number2;
        }
        return 0;
    }
    public static boolean p_validate_prime (int v_number){
        int numbers_divide=0;
        for (int i=1;i<=v_number;i++){
            if (v_number%i==0){
                numbers_divide++;
            }
        }
        return numbers_divide == 2; //retornara aquellos valores que solo tengan dos divisores
    }


    public static void programInfo(){
        System.out.println("This program is a calculator to add, substract, multiply and divide 2 integer numbers");
        System.out.println("Author: Marian Gabriela Mora Guerrero");
        System.out.println("Date:2021/05/07");

    }
}
