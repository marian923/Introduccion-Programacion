package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int [] mySingleArray;
	int size =0;
	int i= 0;
	int grade = 0;
	float averageResult =0;
	int j=0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please type the size for single array");
        size= keyboard.nextInt();
        mySingleArray = new int[size];
        System.out.println("Please type the grades that you know the average");

        while (i< mySingleArray.length){
            System.out.println("Pleasee type the "+(i+1)+"grade");// es i +1 por lo que i empieza en 0
            grade = keyboard.nextInt();
            mySingleArray[i] = grade;
            i++;
        }
        //call to calculateAverag
        averageResult=calculateAverage(mySingleArray);
        //show result with system.out.println
        for (j = 0; j<mySingleArray.length; j++ ){
            System.out.print(mySingleArray[j]+",");
        }
        System.out.println("Your average grades are: "+sumatory(mySingleArray));
        System.out.println("Your average grades is:"+averageResult);
    }
    public static int sumatory (int [] mySingleArray){
        int counter= 0, sum=0;
        while(counter<mySingleArray.length){
            sum = sum + mySingleArray[counter];
            counter++;
        }
        return sum;
    }
    public static float calculateAverage(int [] mySingleArray){

        float average = 0;
        int sum=0;
        sum = sumatory(mySingleArray);

        average=sum/mySingleArray.length;
        return average;
    }
}


