package usta.fis;

/*AUTHOR: Marian Gabriela Mora Guerrero
  DATE:25 March of 2021
  DESCRIPTION: This software calculate time between two cities
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	p_show_info_program();

	//calculate TIME= DISTANCE/VELOCITY

        float v_time=0;
        int v_distance = p_user_distance();
        int v_velocity= p_user_velocity();
        v_time=v_distance/v_velocity;
        System.out.println(" The time between two cities is "+v_time+"hours");

    }
    public static void p_show_info_program (){
        //DESCRIPTION: This method show info program (software)
        System.out.println("-----------------------------");
        System.out.println("   SoftCalculateTime V1.0    ");
        System.out.println("Marian Gabriela Mora Guerrero");
        System.out.println("     Date: 2021-March-25     ");
        System.out.println("-----------------------------");
    }
    public static int p_user_distance(){
        //DESCRIPTION: This method return the distance than user input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the distance (KM) between two cities");
        int v_distance = keyboard.nextInt();
        while (v_distance<0){
            System.err.println("ERR:The distance should the greater than zero, input again the distance (KM):");
            v_distance=keyboard.nextInt();
        }
        return v_distance;
    }

    public static int p_user_velocity(){
        //DESCRIPTION: This method return the velocity than user input
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Input the constance velocity(KM/H) between two cities");
        int v_velocity = Keyboard.nextInt();
        while (v_velocity==0){
            System.err.println("ERR: The velocity cannot be same zero, input Again the velocity (KM/H) ");
            v_velocity= Keyboard.nextInt();
        }
        return v_velocity;
    }
}

