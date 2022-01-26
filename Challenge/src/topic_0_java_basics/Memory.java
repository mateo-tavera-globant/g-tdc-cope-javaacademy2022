package topic_0_java_basics;

import java.util.ArrayList;
import java.util.Arrays;

public class Memory {
   final int COLUMNS=2;//10
   final int ROWS=5;//20

    Memory(){

    }
   // String [][] memory = new String[ROWS][COLUMNS];


public void buildMemory(ArrayList<GeneralProcess> objetos, GeneralProcess process, int memoryUsage){
    String [][] memory = new String[ROWS][COLUMNS];
    int k=0;
    for (int i=0;i<ROWS;i++){

        for (int j=0;j<COLUMNS;j++){

            if((k<objetos.size())&&(objetos.get(k) instanceof AppProcess)&&(k<memoryUsage)){
                memory[i][j] = "ca00"+objetos.get(i).getID();
            }
            else if((k<objetos.size())&&(objetos.get(k) instanceof SystemProcess)&&(k<=memoryUsage)) {
                memory[i][j] = memory[i][j] = "cs00"+objetos.get(i).getID();
            }
            else
                memory[i][j] = memory[i][j] = "****";
            k++;
        }
    }
    for (int i=0;i<ROWS;i++){
        for (int j=0;j<COLUMNS;j++){
            System.out.print(memory[i][j] + " ");
        }
        System.out.println("");
    }

}

void test(int marco){
    System.out.println(marco);
}


}
