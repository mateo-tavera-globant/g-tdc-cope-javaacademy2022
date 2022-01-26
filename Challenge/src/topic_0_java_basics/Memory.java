package topic_0_java_basics;

import java.util.ArrayList;
import java.util.Arrays;

public class Memory {
   final int COLUMNS=10;//10
   final int ROWS=20;//20

    Memory(){

    }
   // String [][] memory = new String[ROWS][COLUMNS];


public void buildMemory(ArrayList<GeneralProcess> objetos, GeneralProcess process, int memoryUsage){
    String [][] memory = new String[ROWS][COLUMNS];
    int k=0;
    for (int i=0;i<ROWS;i++){

        for (int j=0;j<COLUMNS;j++){

            if((k<objetos.size())&&(objetos.get(k) instanceof AppProcess)){
                memory[i][j] = "a00"+objetos.get(i).getID();
            }
            else if((k<objetos.size())&&(objetos.get(k) instanceof SystemProcess)) {
                memory[i][j] = memory[i][j] = "s00"+objetos.get(i).getID();
            }
            else
                memory[i][j] = memory[i][j] = "****";
            k++;
            System.out.print(memory[i][j] + " ");
            //System.out.print("(" + memory[i][j] + " k: " + k + ")");
        }
        System.out.println("");
    }
   // for (int i=0;i<ROWS;i++){
     //   for (int j=0;j<COLUMNS;j++){
       //     System.out.print(memory[i][j] + " ");
        //}
        //System.out.println("");
   // }

}



}
