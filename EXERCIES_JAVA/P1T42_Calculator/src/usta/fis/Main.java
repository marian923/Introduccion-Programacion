package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      int v_number_one=0;
      int v_number_two=0;
      int v_operation=0;
      p_show_info_program();
      Scanner keyboard = new Scanner(System.in);

      System.out.println("Please enter the first number");
      v_number_one= keyboard.nextInt();
      System.out.println("Please enter the second number");
      v_number_two= keyboard.nextInt();
      System.out.println("Please Write one to add two to subtract three to multiply and four to divide ");
      v_operation= keyboard.nextInt();

      System.out.println("The result is:"+p_operate_numbers(v_number_one, v_number_two,v_operation));

    }

    public static int p_operate_numbers( int v_number_one, int v_number_two, int v_operation){
        if(v_operation==1){
            return v_number_one+v_number_two;
        }
        if(v_operation==2){
            return v_number_one-v_number_two;
        }
        if(v_operation==3){
            return v_number_one*v_number_two;
        }
            return v_number_one/v_number_two;

    }



    public static void p_show_info_program(){
        System.out.println("this program is used to read 2 numbers add them subtract them multiply or divide them");
        System.out.println("Version 1.0");
        System.out.println("Maker: Marian Mora");
    }
}
