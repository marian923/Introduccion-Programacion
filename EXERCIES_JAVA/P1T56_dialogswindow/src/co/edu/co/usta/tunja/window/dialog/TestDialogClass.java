package co.edu.co.usta.tunja.window.dialog;


import javax.swing.*;


public class TestDialogClass {
    public static void main(String[] args){

        //Dialogo que solo muestra un mensaje
        JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
        //Dialogo que muestra un mensaje y un titulo
        JOptionPane.showMessageDialog(null, "Mensaje dentro de la ventana", "Mensaje en la barra de titulo",JOptionPane.NO_OPTION);
        //Dialogo que muestra un mensaje y un icono a la izquierda para significar alarma
        JOptionPane.showMessageDialog(null, "Mensaje dentro de la ventana", "Mensaje en la barra de titulo", JOptionPane.WARNING_MESSAGE);
        //Dialogo que muestra un mensaje y un icono
        JOptionPane.showMessageDialog(null, "Mensaje dentro de la ventana", "Titulo", JOptionPane.INFORMATION_MESSAGE);







        //Sirve para que muestre un mensaje y retorna un String
        //JOptionPane.showInputDialog(Mensaje);
        String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
        //Sirve para mostrar un mensaje con su respectivo texto inicial
        //JOptionPane.showInputDialog(Mensaje, Texto Inicial);
        respuesta = JOptionPane.showInputDialog("¿Cual es su nombre?", "atxy2k");
        //Sirve para mostrar un mensaje al igual que el primero solo que se utiliza el componente null
        //JOptionPane.showInputDialog(Componente padre, Mensaje);
        respuesta = JOptionPane.showInputDialog(null, "Escribe tu nombre");
        //Sirve para mostrar un mensaje al igual que el segundo pero con el componente padre o null
        //JOptionPane.showInputDialog(Componente padre, Mensaje, Texto Inicial);
        JOptionPane.showInputDialog(null, "¿Cual es su nombre?", "atxy2k") ;
        //Sirve para mostrar un mensaje, un titulo, un icono por defecto
        //JOptionPane.showInputDialog(Componente padre, Mensaje, Titulo, Tipo De Mensaje (WARNING,ERROR,ETC.) );
        respuesta = JOptionPane.showInputDialog(null, "Escriba nuevamente su nombre", "Error!", JOptionPane.ERROR_MESSAGE);
        //Sirve para mostar un mensaje, un titulo, un icono que se le asigne
        //JOptionPane.showInputDialog(Componente padre, Mensaje, Titulo, Tipo De Mensaje, Icono, Arreglo de opciones, Seleccion por defecto );


        //Sirve para mostrar un mensaje, la cual tiene 3 opciones si , no, cancelar
        //JOptionPane.showConfirmDialog(Componente padre, "Mensaje");
        int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro?");
        //Sirve para lo nombrado anteriormente, pero se añade el titulo de la ventana, y un parámetro nuevo, el tipo de selección
        //JOptionPane.showConfirmDialog(Componente padre, "Mensaje", "Titulo","Tipo de seleccion");
        resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
        //Los mismos parametros establecidos anteriormente, pero se añade el tipo de mensaje
        //JOptionPane.showConfirmDialog(Componente padre, "Mensaje", "titulo", "tipo de seleccion", "tipo de mensaje");
        resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);








    }
}
