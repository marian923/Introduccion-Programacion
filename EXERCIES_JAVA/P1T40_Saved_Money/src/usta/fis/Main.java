package usta.fis;
/*
* AUTHOR: Marian Gabriela Mora Guerrero
* DATE: 25- March-2021
* DESCRIPTION: This software calculate the total money saved in a year
 */
 import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	p_show_info_program();
	int v_total_saved=0;
	for ( int i=1; i<=12; i=i+1) {
	    System.out.println("----Month " +i+"----");
	    v_total_saved= v_total_saved+ p_user_saved__money();
     }
	System.out.println(" The total saved money in year is $"+ v_total_saved);

    }
    public static void p_show_info_program (){
        //DESCRIPTION: This method show info program (software)
        System.out.println("-----------------------------");
        System.out.println("   SoftCalculateTime V1.0    ");
        System.out.println("Marian Gabriela Mora Guerrero");
        System.out.println("     Date: 2021-March-25     ");
        System.out.println("-----------------------------");
    }
 public static int p_user_saved__money(){
        //DESCRIPTION: This method return the saved money in month
         Scanner keyboard = new Scanner(System.in);
         System.out.println("Input the saved money in the month (COP)");
         int v_saved_money = keyboard.nextInt();
         while (v_saved_money<0){
             System.err.println(" ERR: you saved money cannot be less than zero, input again the the saved money (COP)");
             v_saved_money= keyboard.nextInt();
         }
         return v_saved_money;




 }
}
