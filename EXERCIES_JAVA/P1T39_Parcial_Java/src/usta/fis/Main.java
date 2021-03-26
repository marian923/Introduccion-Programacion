package usta.fis;
//AUTHORS:Marian Gabriela Mora Guerrero, Jesus Esteban Blanco, Daniel Nuñez
//DATE:23/06/2021
//DESCRIPTION: PARTIAL FIRST CUT
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	p_show_info_program();
	int v_sum=0;
	for(int i=1; i<=5; i=i+1){
	   v_sum=v_sum+p_height();
	 }
	System.out.println(v_sum);
	System.out.println("The average height is "+ (v_sum/5));
    }
    public static void p_show_info_program(){
        //DESCRIPTION: This method show info program
        System.out.println("-------------------------------------------------");
        System.out.println("   average height V1.0                           ");
        System.out.println(" MAKERS: Marian Mora, Jesus Blanco, Daniela Nuñez");
        System.out.println("              DATE:23/06/2021                    ");
        System.out.println("-------------------------------------------------");
    }
    public static int p_height() {
        //DESCRIPTION: This method return the height of the childrens
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the height of the children (cm)");
        int p_height = keyboard.nextInt();
        while (p_height < 50|| p_height > 200)
        {
            System.err.println("ERR: The height cannot be more than 200 cm or less than 50cm");
            p_height = keyboard.nextInt();
        }
        return p_height;
    }
}
