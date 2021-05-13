package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Type the total digits of oyur capicua number");
	int v_capicua = keyboard.nextInt();
	int [] capicuaNum = new int [v_capicua];
        for (int i = 0; i < capicuaNum.length; i++) {
            System.out.println("Enter your capicua number, DIGIT BY DIGIT");
            capicuaNum[i]= keyboard.nextInt();
        }
        System.out.println("The result of validation is: "+ CapicuaResult(capicuaNum));
        System.out.println("The result of the sum between the first and last digit is:"+(capicuaNum[0]+capicuaNum[(capicuaNum.length-1)]));
    }
    public static boolean CapicuaValidate(int [] capicuaNum){
        for (int i=0; i<capicuaNum.length; i++){
            if (capicuaNum [i]!=capicuaNum[capicuaNum.length-(1+i)]){
                return false;
            }
        }return true;
    }
    public static String CapicuaResult (int [] capicuaNum){
        if(CapicuaValidate(capicuaNum)){
            return "The number is capicua";
        }
        return "The number is not capicua";
    }
}
