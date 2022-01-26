/*
Memory Simulator
Mateo Tavera
01/26/2022
 */

package topic_0_java_basics;
/**This program simulates a 200 slots memory to store two types of process:
 * Application process and System Process
 * Each process has an ID and the possibility to be deleted at any moment
 * Once a process is deleted, the memory is compressed and all stored values move to the bottom
 * of the structure
 *
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends ArrayList<GeneralProcess> {//To use the protected method removeRange()
    public static void main(String[] args) {

        //Declare inputs
        String menu=" ";
        final int MEMORY_AVAILABLE = 200;
        int memoryUsed=0;//Memory consumption
        int memoryGenerated;//Memory needed per process
        int id;//Identification number for each process

        Scanner scanner = new Scanner(System.in);//To input values from cmd
        Memory memory = new Memory();//Craate Memory object
        Main process = new Main();//Creat ArrayList to store each process



        while (memoryUsed<MEMORY_AVAILABLE) {//While memory to store is less than my memory capacity

            System.out.println("""
                    Select the option:
                    ca: create application process
                    cs: create system process
                    d+id: delete process marked with given ID\s""");
            menu = scanner.next();//Register the option form the menu

            //Use Nested-If's to decide what to do
            if (menu.equals("ca")) {//application process creation
                AppProcess ca = new AppProcess();//generates the object
                id = ca.getID();
                memoryGenerated = ca.getStorage();
                System.out.println("ca00" +id+" requires "+ memoryGenerated + " slots in memory");

                //Using the If structure to check if process can be stored
                if (memoryGenerated < (MEMORY_AVAILABLE - memoryUsed)) {
                    for (int i = 0; i < memoryGenerated; i++)
                        process.add(ca);//Add in the ArrayList the number of processes

                    memoryUsed += memoryGenerated;//Update the memory available
                    System.out.println("Memory Available: " + (MEMORY_AVAILABLE - memoryUsed));
                    memory.buildMemory(process);//Construct the memory according to processes created
                } else {
                    System.out.println("Insufficient memory...");
                }
            }
            //Same structure as the application process
            else if(menu.equals("cs")) {
                    SystemProcess cs = new SystemProcess();
                    id = cs.getID();
                    memoryGenerated = cs.getStorage();
                System.out.println("cs00" +id+" requires "+ memoryGenerated + " slots in memory");

                    if (memoryGenerated < (MEMORY_AVAILABLE - memoryUsed)) {
                        for (int i = 0; i < memoryGenerated; i++)
                            process.add(cs);
                        memoryUsed += memoryGenerated;
                        System.out.println("Memory Available: " + (MEMORY_AVAILABLE - memoryUsed));
                        memory.buildMemory(process);
                    } else {
                        System.out.println("Insufficient memory...");
                    }
                }

            //Takes only the first character of the input value to access this block
            else if(menu.substring(0,1).equals("d")) {


                int rangeMin = -1;//to be set in the loop
                int rangeMax = -1;//to be set in the loop
                id = Integer.parseInt(menu.substring(1));//Takes the rest of characters of the input value
                //Using for loop to get the range of processes we would like to delete
                for (int i = 0; i < process.size(); i++) {//i=0,1,2..total of processes
                    if ((rangeMin < 0) && (process.get(i).getID() == id)) {//Get the first process we need to delete
                        rangeMin = i;
                    } else if (((rangeMax < 0)//Get the las process we need to delete
                            && (process.get(i).getID() != id)
                            && (rangeMin >= 0))) {
                        rangeMax = i;
                    } else if (i+1== process.size()&&(rangeMax<0)) {//Get the las process we need to delete
                        rangeMax = i+1;
                    }
                }
                    //Using the removeRange method to take out given values from the ArrayList
                    process.removeRange(rangeMin, rangeMax);
                    memoryUsed-=rangeMax-rangeMin;//Update memory available
                    memory.buildMemory(process);//Re-construct the memory according to processes deleted

            }
            else//Wrong input
                System.out.println("Input is not valid. Try again\n");


        }


    }
}
