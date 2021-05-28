package co.edu.usta.array.triki.logic;

public class Triki {
    private char [][] triki;


    public void lugarArray(){
        boolean letras=true; // es de tipo boolena ya que solo son dos valores por ende tenemos que evaluar si es verdadero o flaso
        //son dos for debido a que es un arreglo bidimensional
        for (int i = 0; i < triki.length; i++) {
            for (int j = 0; j < triki[0].length; j++) {
                if (letras==true){
                    triki[i][j]='X';
                }else {
                    triki[i][j]='O';
                }
            }
            if(letras==true){
                letras=false;
            }else{
                letras=true;
            }
        }
    }

}
