package topic_0_java_basics;

import java.util.ArrayList;

public class Memory {
   final int COLUMNS=10;//10
   final int ROWS=20;//20

    Memory(){

    }
   // String [][] memory = new String[ROWS][COLUMNS];


public void buildMemory(ArrayList<GeneralProcess> process){
    String [][] memory = new String[ROWS][COLUMNS];
    int k=0;
    int id = 0;
    for (int i=0;i<ROWS;i++){

        for (int j=0;j<COLUMNS;j++){

            if((k<process.size())&&(process.get(k) instanceof AppProcess)){
                id = process.get(k).getID();
                memory[i][j] = "a00"+id;
            }
            else if((k<process.size())&&(process.get(k) instanceof SystemProcess)) {
                id = process.get(k).getID();
                memory[i][j] = memory[i][j] = "s00"+id;
            }
            else
                memory[i][j] = memory[i][j] = "****";
            k++;

        }

    }
   for (int i=ROWS-1;i>=0;i--){
        for (int j=COLUMNS-1;j>=0;j--){
            System.out.print(memory[i][j] + " ");
        }
        System.out.println("");
    }

}



}
