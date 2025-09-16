import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);   

        System.out.println("How big would you like the array to be?");

        int arrayLength = in.nextInt();
        int[] myArray = new int[arrayLength];

        for (int i=0; i<myArray.length; i++){
            System.out.println("Give me a number for your array:");
            myArray[i]=in.nextInt();
        }

        System.out.println("Array before sorting:");
        for (int val : myArray){
            System.out.println(val);
            }


        int val1=0;
        int val2=0;

        for (int i=0; i<myArray.length-1; i++) {
            val1=myArray[i];
            val2=myArray[i+1];
            if (val1<val2){
                myArray[i]=val2;
                myArray[i+1]=val1;
                }
            }


        System.out.println("Array after sorting:");
        for (int val : myArray){
            System.out.println(val);
            }

        }

    }

