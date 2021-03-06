/*
Memory Simulator
Mateo Tavera
01/26/2022
 */
package topic_0_java_basics;
/**This class takes a list of processes and organizes them in a 20x10 Matrix
 */

import java.util.ArrayList;

public class Memory {
    //Constant Inputs
   final int COLUMNS=10;
   final int ROWS=20;

public void buildMemory(ArrayList<GeneralProcess> process){
    //Declare Memory Matrix
    String [][] memory = new String[ROWS][COLUMNS];
    int k=0;//Index to take each value of the ArrayList of processes
    int id = 0;
    //Move across the matrix using two for loops
    for (int i=0;i<ROWS;i++){
        for (int j=0;j<COLUMNS;j++){

            //Generate the App process
            if((k<process.size())&&(process.get(k) instanceof AppProcess)){
                id = process.get(k).getID();
                memory[i][j] = "a00"+id;
            }
            //Generate the System process
            else if((k<process.size())&&(process.get(k) instanceof SystemProcess)) {
                id = process.get(k).getID();
                memory[i][j] = memory[i][j] = "s00"+id;
            }
            //Generate available memory
            else
                memory[i][j] = "****";
            k++;

        }

    }

    //Print the matrix backwards
   for (int i=ROWS-1;i>=0;i--){
        for (int j=COLUMNS-1;j>=0;j--){
            System.out.print(memory[i][j] + " ");
        }
        System.out.println("");
    }

}


}
