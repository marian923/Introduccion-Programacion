package co.edu.usta.array.triki.view;

import co.edu.usta.array.triki.logic.Triki;

import javax.swing.*;

public class FormView {
    private static Triki myTriki;
    public static void main(String[] params){
        myTriki=new Triki();
        int opcion,filasI=0,columnasI=0, espacioslibres = 0, espacioslibresfinal=0;
        char triki;
        String option,filasS,columnasS;
        option= JOptionPane.showInputDialog("Bienvenido a la empresa Takis, te vamos a ofrecer el juego de triki, " +
                "\nsi digitas la opcion 0 es para salir del juego," +
                "\nsi digitas la opcion 1 es para jugar 3x3, " +
                "\nsi digitas la opcion 2 es para jugar 5x5");
        opcion=Integer.parseInt(option);
        while(opcion>2){
            JOptionPane.showMessageDialog(null,"El numero ingresado es incorrecto ", "Error", JOptionPane.ERROR_MESSAGE);
            option=JOptionPane.showInputDialog("Digite el numero nuevamente");
            opcion=Integer.parseInt(option);
        }
        if(opcion==1){
            espacioslibres=9;//
            myTriki.lugaresDelArreglo3();
        }
        if (opcion==2){
            espacioslibres=25;
            myTriki.lugaresDelArreglo5();
        }
        JOptionPane.showMessageDialog(null,myTriki.inicializarElArreglo() );
        do { // sirve para que los jugadores digiten sus movimientos, mientras que los espaciosvacios o como tal la clase validarjuego sea mayor a 0 va a seguir ejecutandose

            if (espacioslibres>0){ // si hay mas de 0 espacios libresse peude seguir jugando
                filasS=JOptionPane.showInputDialog(null,"Jugador X por favor digite la fila en que desea poner su jugada ");
                filasI=Integer.parseInt(filasS);
                columnasS=JOptionPane.showInputDialog(null, "Jugador X por favor digite la columna en que desea poner su jugada");
                columnasI=Integer.parseInt(columnasS);
                while(myTriki.jugadas(filasI,columnasI)==false){ // si la opcion es falsa este no permitiria seguir hasta ingrese un valor verdadero, tabien sirve para cuando el numero digitado sea en la misma posicion que el de otro jugado no se pueda ejecutar
                    JOptionPane.showMessageDialog(null," Jugador X los valores ingresados son incorrectos  ","ERR",JOptionPane.INFORMATION_MESSAGE);
                    filasS=JOptionPane.showInputDialog(null, "Digitelo nuevamente la fila ");
                    filasI=Integer.parseInt(filasS);
                    columnasS = JOptionPane.showInputDialog(null, "Digite nuevamente la columna");
                    columnasI=Integer.parseInt(columnasS);
                }
                myTriki.ubicarArregloJ1(filasI,columnasI);
                espacioslibres--;// espacios libres es igual al profegrama para identificar cuantos espacios
                espacioslibresfinal=espacioslibres; //

            }
            JOptionPane.showMessageDialog(null,myTriki.presentarTriqui());
            if(opcion ==1){
                espacioslibres=myTriki.verificarSiGanoElJuego3x3(espacioslibres);
            }
            if(opcion ==2){
                espacioslibres=myTriki.verificarSiGanoElJuego5x5(espacioslibres);
            }


            if (espacioslibres>0){
                filasS=JOptionPane.showInputDialog(null,"Jugador O por favor digite la fila en que desea poner su jugada ");
                filasI=Integer.parseInt(filasS);
                columnasS=JOptionPane.showInputDialog(null, "Jugador O por favor digite la columna en que desea poner su jugada");
                columnasI=Integer.parseInt(columnasS);
                while(myTriki.jugadas(filasI,columnasI)==false){
                    JOptionPane.showMessageDialog(null,"Jugador O los valores ingresados son incorrectos ","ERR",JOptionPane.INFORMATION_MESSAGE);
                    filasS=JOptionPane.showInputDialog(null, "Digitelo nuevamente la fila ");
                    filasI=Integer.parseInt(filasS);
                    columnasS = JOptionPane.showInputDialog(null, "Digite nuevamente la columna");
                    columnasI=Integer.parseInt(columnasS);
                }
                myTriki.ubicarArregloJ2(filasI,columnasI);

                espacioslibres--;
                espacioslibresfinal=espacioslibres; // e.final nunca cambia como si lo es espacioslibres
            }
            JOptionPane.showMessageDialog(null, myTriki.presentarTriqui());; //  se le va restando cada vez a los espacios libres ,se hace este proceso debido a que di los espacios son difrentes a O alida los if cada vez que esta jugando hace el cambio
        }while(espacioslibres>0); // es mayor que = porque cunaod obtenga valores de 0 o menores uqe 0 es porque se termino el juego o alguien perdio


        if(espacioslibres ==0){ //se acaban los espacios libres y nadie gano
            JOptionPane.showMessageDialog(null, "Ninguno de los jugadores gano"+
                    "\n Los espacios libres son : "+ espacioslibresfinal + " Cantidades de O fueron:"+myTriki.mostrarTriquiO()+" y cantidades de X digitadas fueron"+myTriki.mostrarTriquiX());


        }
        if (espacioslibres == -2){
            JOptionPane.showMessageDialog(null, "Jugador X ha ganado"+
                    "\n Los espacios libres son : "+ espacioslibresfinal + " Cantidades de O fueron :"+myTriki.mostrarTriquiO()+" y cantidades de X digitadas fueron: "+myTriki.mostrarTriquiX());
        }
        if (espacioslibres == -3){
            JOptionPane.showMessageDialog(null, "Jugador O ha ganado"+
                    "\n Los espacios libres son : "+ espacioslibresfinal+ " Cantidades de O fueron :"+myTriki.mostrarTriquiO()+" y cantidades de X digitadas fueron: "+myTriki.mostrarTriquiX());
            
        }







    }
}
