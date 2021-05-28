package co.edu.usta.array.triki.view;

import co.edu.usta.array.triki.logic.Triki;

import javax.swing.*;

public class FormView {
    private static Triki myTriki;
    public static void main(String[] params){
        myTriki=new Triki();
        int opcion;
        String option;
        option= JOptionPane.showInputDialog("Bienvenido a la empresa Takis, te vamos a ofrecer el juego de triki, " +
                "\n si digitas la opcion 1 es para 3x3, si digitas la opcion 2 es para 5x5");
        opcion=Integer.parseInt(option);
        myTriki.lugarArray();

    }
}
