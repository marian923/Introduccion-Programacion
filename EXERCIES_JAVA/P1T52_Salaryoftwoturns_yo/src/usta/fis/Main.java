package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int  [] mañana;
	int  [] tarde;
	int personasMañana =0;
	int personasTarde=0;
	int salarioMañana;
	int salarioTarde;
	int v_result_total = 0;
	mañana = new int[personasMañana];
	tarde = new int[personasTarde];

	Scanner keyboard = new Scanner(System.in);
	System.out.println("Ingresar el salario de la mañana");
	salarioMañana=keyboard.nextInt();
	while (salarioMañana<=0){
		System.err.println("El numero digitado es incorrecto");
		salarioMañana= keyboard.nextInt();
	}
	System.out.println("Ingrese el salario de la tarde");
	salarioTarde=keyboard.nextInt();
	while (salarioTarde<=0){
		System.err.println("El numero digitado es incorrecto");
		salarioTarde=keyboard.nextInt();
	}
	System.out.println("ingrese la cantidad de personas de mañana");
	personasMañana= keyboard.nextInt();
        while (personasMañana<=0){
            System.err.println("El numero digitado es incorrecto");
            personasMañana=keyboard.nextInt();
        }
	System.out.println("ingrese la cantidad de personas de la tarde");
	personasTarde=keyboard.nextInt();
	while (personasTarde<=0){
	    System.err.println("El numero digitado es incorrecto");
	    personasTarde=keyboard.nextInt();
    }
	int v_total_salariomañana=salaryMorning( personasMañana,salarioMañana );
	int v_total_salariotarde=salaryAfternoon( personasTarde, salarioTarde );

	System.out.println("El valor total a pagar en la mañana es: "+v_total_salariomañana );
	System.out.println("El valor total a pagar en la tarde es: "+ v_total_salariotarde);

	 v_result_total=v_total_salariomañana+v_total_salariotarde;
	 System.out.println("El valor total al pagar es "+ v_result_total);

    }

    public static int salaryMorning(int personasMañana, int salarioMañana ) {
        int v_total_salariomañana;
        v_total_salariomañana=personasMañana*salarioMañana;
        return v_total_salariomañana;
    }
    public static int salaryAfternoon(int personasTarde, int salarioTarde ) {
        int v_total_salariotarde;
        v_total_salariotarde=personasTarde*salarioTarde;
        return v_total_salariotarde;
    }



}
