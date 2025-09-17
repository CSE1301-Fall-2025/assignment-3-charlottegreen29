import java.util.Scanner;

public class FrequencyTable {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);

        System.out.println("How many dice would you like to roll?");
        int numDice = in.nextInt();

        int frequencyTable[][] = new int[1000][2];

        
        for (int i=0;i<frequencyTable.length;i++){
            frequencyTable[i][0]=i;
        }


        for (int i=0;i<frequencyTable.length;i++){
            int totalRolledValue = 0;
            for (int j=0; j<numDice;j++){
                totalRolledValue+=(int)(Math.random()*6)+1;
            }
            frequencyTable[totalRolledValue][1]++;
        }

        System.out.println("Times each value was rolled with " + numDice + " dice over 10000 rolls:");

        for (int i=0;i<frequencyTable.length;i++){
            if (frequencyTable[i][1]!=0){
                System.out.print(frequencyTable[i][0] + ": " + frequencyTable[i][1] + "  ");
            }
            
        }
        
    }
}
