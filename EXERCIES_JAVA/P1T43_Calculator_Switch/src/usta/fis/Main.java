package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int v_total_number=0;
        p_show_info_program();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the first number");
         int v_number_one= keyboard.nextInt();
        System.out.println("Please enter the second number");
        int v_number_two= keyboard.nextInt();
        System.out.println("Please Write one to add two to subtract three to multiply and four to divide ");
        int v_operation= keyboard.nextInt();
        p_operate_numbers(v_number_one,v_number_two,v_operation,v_total_number);
    }

    public static void p_operate_numbers( int v_number_one, int v_number_two, int v_operation, int v_total_number){
        Scanner keyboard = new Scanner(System.in);
        switch (v_operation) {
            case 1 -> v_total_number = v_number_one + v_number_two;
            case 2 -> v_total_number = v_number_one - v_number_two;
            case 3 -> v_total_number = v_number_one * v_number_two;
            case 4 -> {
                while (v_number_two == 0) {
                    System.err.println("Error the numbers entered are incorrect please type it again "); v_number_two= keyboard.nextInt();
                }
                v_total_number = v_number_one / v_number_two;
            }
            default -> System.err.println("Oh no, we've a problem. Please, insert again the number. Remember, your selection should be an integer");
        }
        System.out.println("The result is: "+v_total_number+".");

        }
    public static void p_show_info_program(){
        System.out.println("this program is used to read 2 numbers add them subtract them multiply or divide them");
        System.out.println("Version 1.0");
        System.out.println("Maker: Marian Mora");
    }
}


