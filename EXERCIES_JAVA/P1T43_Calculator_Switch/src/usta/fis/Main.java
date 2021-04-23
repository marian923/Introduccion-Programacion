package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        Scanner keyboard = new Scanner(System.in);
        int v_operation= 0;
        int v_number_one= 0 ;
        int v_number_two= 0 ;
        do {
            System.out.println("Please write one to add two to subtract three to multiply four to divide and five to determine the prime of N numbers and six to calculate the above prime numbers ");
            v_operation= keyboard.nextInt();
            if (v_operation!=0) {
                System.out.println("Please enter the first number");
                v_number_one = keyboard.nextInt();
                if (v_operation > 0 && v_operation < 5) {
                    System.out.println("Please enter the second number");
                    v_number_two = keyboard.nextInt();
                }
            }
            //operate
            System.out.println("El resultado es:" + p_operate_numbers(v_number_one, v_number_two, v_operation));
        } while (v_operation!=0);


    }

    public static String p_operate_numbers( int v_number_one, int v_number_two, int v_operation){
        Scanner keyboard = new Scanner(System.in);
        int v_total_number=0;
        String v_convert="";
        switch (v_operation) {
            case 1 : v_total_number = v_number_one + v_number_two;
            break;
            case 2 : v_total_number = v_number_one - v_number_two;
            break;
            case 3 : v_total_number = v_number_one * v_number_two;
            break;
            case 4 :
                while (v_number_two == 0) {
                    System.err.println("Error the numbers entered are incorrect please type it again "); v_number_two= keyboard.nextInt();
                }
                v_total_number = v_number_one / v_number_two;
            break;
            case 5 : v_convert = "NO es un number primo";
                    if (p_validate_prime(v_number_one)){
                        v_convert= "Es number primo";
                    }
            break;
            case 6:
                v_convert = " Los numeros primos son:"+p_prime_numbers(v_number_one);
            default :
                v_convert= "Exit";
                System.exit(0);
        }
        if(v_convert.isEmpty()){
            v_convert=String.valueOf(v_total_number);
        }
        System.out.println("The result is: "+v_total_number+".");
        return Integer.toString(v_total_number);
        }

        public static String p_prime_numbers(int v_limit){
        String prime_numbers="";
        for(int counter = 1; counter<=v_limit; counter++){
            if(p_validate_prime(counter)){
                prime_numbers=prime_numbers+(counter)+ "";
            }
           }
            return prime_numbers;
        }

        public static boolean p_validate_prime (int v_number){
            int numbers_divide=0;
            for (int i=1;i<=v_number;i++){
                if (v_number%i==0){
                    numbers_divide++;
               }
            }
            if (numbers_divide!=2){
                return false;
            }
            return true;
        }





    public static void p_show_info_program(){
        System.out.println("this program is used to read 2 numbers add them subtract them multiply or divide them");
        System.out.println("Version 1.0");
        System.out.println("Maker: Marian Mora");
    }
}


