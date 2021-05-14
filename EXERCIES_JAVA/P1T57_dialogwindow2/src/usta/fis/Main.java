package usta.fis;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	String answer;
	int amount=0, operation=0, result;
	int []array;
	answer= JOptionPane.showInputDialog("Hi, this program is a calculator, "+
            "\n and do it a arithmetic operations, "+
            "\n please type the amount of numbers that you will use");
	amount=Integer.valueOf(answer);//para convertir de un string a un entero
        array=new int[amount];

        answer=JOptionPane.showInputDialog("Please type: \n 1 to sum \n 2 to subtract \n 3 multiply \n divide or 0 to exit ");
        operation=Integer.valueOf(answer);
        for (int i = 0; i < amount; i++) {
            answer = JOptionPane.showInputDialog("Please type the "+(i+1)+" number"); // es i+1 porque como i empieza en 0 se le tiene que ir sumando 1
            array[i]=Integer.valueOf(answer);
        }
        //llamar al metodo
        result=calculator(array,operation);
        JOptionPane.showMessageDialog(null, "Your result is: "+result) ;
    }

    public static int calculator(int []array, int operation){
        int result=0;


        return result;

    }
}
