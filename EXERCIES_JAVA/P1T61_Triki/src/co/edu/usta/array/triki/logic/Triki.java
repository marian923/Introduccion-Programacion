package co.edu.usta.array.triki.logic;

public class Triki {
    private char[][] triki;

    public void lugaresDelArreglo3() {
        triki = new char[3][3];
    }

    public void lugaresDelArreglo5() {
        triki = new char[5][5];
    }

    public String inicializarElArreglo() {// es String debido a que no solo es un caracter sino son dos
        String almacenadorChar = "";
        for (int i = 0; i < triki.length; i++) {
            for (int j = 0; j < triki.length; j++) {
                triki[i][j] = '°'; // es i y es j debido a que estos son los contadores que recorren al arreglo
                almacenadorChar = almacenadorChar + triki[i][j] + " "; //el char se almacena lo que ha recorrido mas el arreglo y deja un espacio almacenar los char dentro de la variable almacenadorChar que es un String
            }
            almacenadorChar = almacenadorChar + "\n"; //es para que cuando termina el for i haga un salto de linea para el for j

        }
        return almacenadorChar;
    }


    public boolean jugadas(int filasI, int columnasI) { //esta clase sirve para validar la jugada y es de tipo boollean porque solo puede esocger dos valores
        if (triki[filasI][columnasI] == '°') { // este seria para evaluar los espacios libres que hay si no hay entonces pasa al siguiente proceso
            return true;
        } else {
            return false;
        }

    }

    public char ubicarArregloJ1(int filasI, int columnasI) {
        if (jugadas(filasI, columnasI)) {
            triki[filasI][columnasI] = 'X'; // cuando lo vaya a jugar si el resulatdo es verdadero es porque un espacio existe y sera remplazado con X
        }
        return 0;
    }

    public char ubicarArregloJ2(int filasI, int columnasI) {
        if (jugadas(filasI, columnasI)) {
            triki[filasI][columnasI] = 'O'; // cuando lo vaya a jugar si el resulatdo es verdadero es porque un espacio existe y sera remplazado con O
        }
        return 0;
    }

    public String presentarTriqui() {
        String muestraTodoElTriqui = "";
        for (int i = 0; i < triki.length; i++) {
            for (int j = 0; j < triki[0].length; j++) {
                muestraTodoElTriqui = muestraTodoElTriqui + triki[i][j] + " ";
            }
            muestraTodoElTriqui = muestraTodoElTriqui + "\n";
        }
        return muestraTodoElTriqui;
    }

    public int verificarSiGanoElJuego3x3(int espacioslibres) {
        if (triki[0][0] == 'X') { // columna
            if (triki[0][1] == 'X') {
                if (triki[0][2] == 'X') {
                    return  -2;
                }
            }
        }
        if (triki[1][0] == 'X') { //columna
            if (triki[1][1] == 'X') {
                if (triki[1][2] == 'X') {
                    return -2;
                }
            }
        }
        if (triki[2][0] == 'X') { //columna
            if (triki[2][1] == 'X') {
                if (triki[2][2] == 'X') {
                    return  -2;
                }
            }
        }
        if (triki[0][0] == 'X') { //fila
            if (triki[1][0] == 'X') {
                if (triki[2][0] == 'X') {
                    return  -2;
                }
            }
        }
        if (triki[0][1] == 'X') { // fila
            if (triki[1][1] == 'X') {
                if (triki[2][1] == 'X') {
                   return  -2;
                }
            }
        }
        if (triki[0][2] == 'X') { //fila
            if (triki[1][2] == 'X') {
                if (triki[2][2] == 'X') {
                    return  -2;
                }
            }
        }
        if (triki[0][0] == 'X') { // diagonal
            if (triki[1][1] == 'X') {
                if (triki[2][2] == 'X') {
                    return  -2;
                }
            }
        }
        if (triki[0][2] == 'X') { //diagonal
            if (triki[1][1] == 'X') {
                if (triki[2][0] == 'X') {
                    return -2;
                }
            }
        }
        if (triki[0][0] == 'O') {
                if (triki[0][1] == 'O') {
                if (triki[0][2] == 'O') {
                    return  -3;
                }
            }
        }
        if (triki[1][0] == 'O') {
            if (triki[1][1] == 'O') {
                if (triki[1][2] == 'O') {
                    return -3;
                }
            }
        }
        if (triki[2][0] == 'O') {
            if (triki[2][1] == 'O') {
                if (triki[2][2] == 'O') {
                    return  -3;
                }
            }
        }
        if (triki[0][0] == 'O') {
            if (triki[1][0] == 'O') {
                if (triki[2][0] == 'O') {
                    return  -3;
                }
            }
        }
        if (triki[0][1] == 'O') {
            if (triki[1][1] == 'O') {
                if (triki[2][1] == 'O') {
                    return -3;
                }
            }
        }
        if (triki[0][2] == 'O') {
            if (triki[1][2] == 'O') {
                if (triki[2][2] == 'O') {
                    return  -3;
                }
            }
        }
        if (triki[0][0] == 'O') {
            if (triki[1][1] == 'O') {
                if (triki[2][2] == 'O') {
                    return  -3;
                }
            }
        }
        if (triki[0][2] == 'O') {
            if (triki[1][1] == 'O') {
                if (triki[2][0] == 'O') {
                    return -3;
                }
            }
        }
        return espacioslibres;

    }

    public int verificarSiGanoElJuego5x5(int espacioslibres) {
        if (triki[0][0] == 'X') { //columna
            if (triki[0][1] == 'X') {
                if (triki[0][2] == 'X') {
                    if (triki[0][3] == 'X') {
                        if (triki[0][4] == 'X') {
                            return  -2;
                        }
                    }
                }
            }
            if (triki[0][0] == 'X') { //fila
                if (triki[1][0] == 'X') {
                    if (triki[2][0] == 'X') {
                        if (triki[3][0] == 'X') {
                            if (triki[4][0] == 'X') {
                                return  -2;
                            }
                        }
                    }
                }
            }
            if (triki[0][0] == 'X') { //diagonal
                if (triki[1][1] == 'X') {
                    if (triki[2][2] == 'X') {
                        if (triki[3][3] == 'X') {
                            if (triki[4][4] == 'X') {
                                return  -2;
                            }
                        }
                    }
                }
            }
            if (triki[0][4] == 'X') { //fila
                if (triki[1][4] == 'X') {
                    if (triki[2][4] == 'X') {
                        if (triki[3][4] == 'X') {
                            if (triki[4][4] == 'X') {
                                return  -2;
                            }
                        }
                    }
                }
            }
            if (triki[0][4] == 'X') { //diagonal
                if (triki[1][3] == 'X') {
                    if (triki[2][2] == 'X') {
                        if (triki[3][1] == 'X') {
                            if (triki[4][0] == 'X') {
                                return  -2;
                            }
                        }
                    }
                }
            }
            if (triki[1][0] == 'X') { //columna
                if (triki[1][1] == 'X') {
                    if (triki[1][2] == 'X') {
                        if (triki[1][3] == 'X') {
                            if (triki[1][4] == 'X') {
                                return  -2;
                            }
                        }
                    }
                }
            }
            if (triki[2][0] == 'X') { //columna
                if (triki[2][1] == 'X') {
                    if (triki[2][2] == 'X') {
                        if (triki[2][3] == 'X') {
                            if (triki[2][4] == 'X') {
                                return  -2;
                            }
                        }
                    }
                }
            }
            if (triki[3][0] == 'X') { //columna
                if (triki[3][1] == 'X') {
                    if (triki[3][2] == 'X') {
                        if (triki[3][3] == 'X') {
                            if (triki[3][4] == 'X') {
                                return  -2;
                            }
                        }
                    }
                }
            }
            if (triki[4][0] == 'X') { //columna
                if (triki[4][1] == 'X') {
                    if (triki[4][2] == 'X') {
                        if (triki[4][3] == 'X') {
                            if (triki[4][4] == 'X') {
                                return  -2;
                            }
                        }
                    }
                }
            }
            if (triki[0][1] == 'X') { //fila
                if (triki[1][1] == 'X') {
                    if (triki[2][1] == 'X') {
                        if (triki[3][1] == 'X') {
                            if (triki[4][1] == 'X') {
                                return  -2;
                            }
                        }
                    }
                }
            }
            if (triki[0][2] == 'X') { //fila
                if (triki[1][2] == 'X') {
                    if (triki[2][2] == 'X') {
                        if (triki[3][2] == 'X') {
                            if (triki[4][2] == 'X') {
                                return  -2;
                            }
                        }
                    }
                }
            }
            if (triki[0][3] == 'X') { //fila
                if (triki[1][3] == 'X') {
                    if (triki[2][3] == 'X') {
                        if (triki[3][3] == 'X') {
                            if (triki[4][3] == 'X') {
                                return -2;
                            }
                        }
                    }
                }
            }

            if (triki[0][0] == 'O') {
                if (triki[0][1] == 'O') {
                    if (triki[0][2] == 'O') {
                        if (triki[0][3] == 'O') {
                            if (triki[0][4] == 'O') {
                                return -3;
                            }
                        }
                    }
                }
                if (triki[0][0] == 'O') {
                    if (triki[1][0] == 'O') {
                        if (triki[2][0] == 'O') {
                            if (triki[3][0] == 'O') {
                                if (triki[4][0] == 'O') {
                                    return -3;
                                }
                            }
                        }
                    }
                }
                if (triki[0][0] == 'O') {
                    if (triki[1][1] == 'O') {
                        if (triki[2][2] == 'O') {
                            if (triki[3][3] == 'O') {
                                if (triki[4][4] == 'O') {
                                    return -3;
                                }
                            }
                        }
                    }
                }
                if (triki[0][4] == 'O') {
                    if (triki[1][4] == 'O') {
                        if (triki[2][4] == 'O') {
                            if (triki[3][4] == 'O') {
                                if (triki[4][4] == 'O') {
                                    return -3;
                                }
                            }
                        }
                    }
                }
                if (triki[0][4] == 'O') {
                    if (triki[1][3] == 'O') {
                        if (triki[2][2] == 'O') {
                            if (triki[3][1] == 'O') {
                                if (triki[4][0] == 'O') {
                                    return -3;
                                }
                            }
                        }
                    }
                }
                if (triki[1][0] == 'O') {
                    if (triki[1][1] == 'O') {
                        if (triki[1][2] == 'O') {
                            if (triki[1][3] == 'O') {
                                if (triki[1][4] == 'O') {
                                    return -3;
                                }
                            }
                        }
                    }
                }
                if (triki[2][0] == 'O') {
                    if (triki[2][1] == 'O') {
                        if (triki[2][2] == 'O') {
                            if (triki[2][3] == 'O') {
                                if (triki[2][4] == 'O') {
                                    return -3;
                                }
                            }
                        }
                    }
                }
                if (triki[3][0] == '0') {
                    if (triki[3][1] == '0') {
                        if (triki[3][2] == '0') {
                            if (triki[3][3] == '0') {
                                if (triki[3][4] == '0') {
                                    return -3;
                                }
                            }
                        }
                    }
                }
                if (triki[4][0] == '0') {
                    if (triki[4][1] == '0') {
                        if (triki[4][2] == '0') {
                            if (triki[4][3] == '0') {
                                if (triki[4][4] == '0') {
                                    return -3;
                                }
                            }
                        }
                    }
                }
                if (triki[0][1] == 'O') {
                    if (triki[1][1] == 'O') {
                        if (triki[2][1] == 'O') {
                            if (triki[3][1] == 'O') {
                                if (triki[4][1] == 'O') {
                                    return -3;
                                }
                            }
                        }
                    }
                }
                if (triki[0][2] == 'O') {
                    if (triki[1][2] == 'O') {
                        if (triki[2][2] == 'O') {
                            if (triki[3][2] == 'O') {
                                if (triki[4][2] == 'O') {
                                    return -3;
                                }
                            }
                        }
                    }
                }
                if (triki[0][3] == 'O') {
                    if (triki[1][3] == 'O') {
                        if (triki[2][3] == 'O') {
                            if (triki[3][3] == 'O') {
                                if (triki[4][3] == 'O') {
                                    return -2;
                                }
                            }
                        }
                    }
                }


            }

        }
        return espacioslibres;

    }

    public int mostrarTriquiO(){
        int contarcantidadesdeO=0;
        for (int i = 0; i < triki.length; i++) {
            for (int j = 0; j < triki[0].length; j++) {
                if(triki[i][j]=='O'){
                    contarcantidadesdeO++;
                }


            }

        }
        return contarcantidadesdeO;
    }
    public int mostrarTriquiX(){
        int contarcantidadesdeX=0;
        for (int i = 0; i < triki.length; i++) {
            for (int j = 0; j < triki[0].length; j++) {
                if(triki[i][j]=='X'){
                    contarcantidadesdeX++;
                }
            }

        }
        return contarcantidadesdeX;
    }

}
