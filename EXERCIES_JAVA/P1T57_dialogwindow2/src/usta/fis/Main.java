package usta.fis;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	String answer;
	int amount, operation, result = 0;
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
            if(operation==4){
                if(i>0){
                    while(array[i]==0){
                        answer = JOptionPane.showInputDialog(null,"Escriba nuevamente su nombre", "Error! x_x",JOptionPane.ERROR_MESSAGE);
                        array[i]=Integer.valueOf(answer);
                    }
                }
            }
        }

        //llamar al metodo
        result=calculator(array,operation,amount);
        JOptionPane.showMessageDialog(null, "Your result is: "+result) ;
    }

    public static int calculator(int []array, int operation, int amount){

        int result = array[0];
        if(operation==1){
            for (int i = 1; i < amount; i++) {
                result += array[i];
            }
        }
        if(operation==2){
            for (int i = 1; i < amount; i++) {
                result -= array[i];
            }
        }
        if(operation==3){
            for (int i = 1; i < amount; i++) {
                result *= array[i];
            }
        }
        if(operation==4){
            for (int i = 1; i < amount; i++) {
                result /= array[i];
            }
        }
        return result;

    }
}
