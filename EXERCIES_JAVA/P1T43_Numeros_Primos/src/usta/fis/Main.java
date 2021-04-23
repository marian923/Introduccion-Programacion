package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int n;
        while (true){
          System.out.println("Enter a positive integer: ");
          n=lector.nextInt();

          if(n>0){
              for(int i=2;i<=n;i++){
                  int v_creciente = 2;
                  boolean v_esPrimo = true;

                  while(v_esPrimo && v_creciente<i){
                      if((i % v_creciente)==0){
                          v_esPrimo = false;
                      }
                      else {
                          v_creciente++;
                      }
                  }
                  if (v_esPrimo){
                      System.out.println(i+ "is a prime number.");

                  }
              }
          }
          else{
              System.out.println("The number entered is not correct, please enter it again.");
          }
        }
    }
}

