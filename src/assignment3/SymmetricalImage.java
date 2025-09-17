import java.util.Scanner;

public class SymmetricalImage {
    public static void main(String[] args){

        Scanner in = new Scanner (System.in);

        System.out.println("How many rows do you want your array to be?");
        int numRows = in.nextInt();
        System.out.println("How many columns do you want your array to be?");
        int numColumns = in.nextInt();

        String array[][] = new String[numRows][numColumns];

        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[0].length; j++){
                array[i][j]=" ";
            }
        }

        for (int i=1; i<=(numRows*numColumns/4); i++){
            int rowCoordinate=(int)(Math.random()*(numRows-1));
            int columnCoordinate=(int)(Math.random()*((numColumns-1)/2));
            array[rowCoordinate][columnCoordinate]="*";
            array[rowCoordinate][columnCoordinate+(numColumns/2)]="*";
        }
        
        for (String row[] : array){
            for (String val : row){
                System.out.print(val);
            }
            System.out.println();
        }


    }
}
