package topic_0_java_basics;

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
            if (menu.equals("ca")) {//application process cration
                AppProcess ca = new AppProcess();//generates the object
                id = ca.getID();
                memoryGenerated = ca.getStorage();
                System.out.println("ca00" +id+" requires "+ memoryGenerated + " slots in memory");

                //Using the If structure to check if process can be stored
                if (memoryGenerated < (MEMORY_AVAILABLE - memoryUsed)) {
                    for (int i = 0; i < memoryGenerated; i++)
                        process.add(ca);//Add in the ArrayList the number of processes

                    memoryUsed += memoryGenerated;//Update the memory avalable
                    System.out.println("memoria acumuladaCA = " + memoryUsed);
                    System.out.println(process);
                    memory.buildMemory(process);
                } else {
                    System.out.println("Insufficient memory...");
                }
            }
            else if(menu.equals("cs")) {
                    SystemProcess cs = new SystemProcess();
                    // sys.add(cs);
                    id = cs.getID();
                    memoryGenerated = cs.getStorage();
                System.out.println("cs00" +id+" requires "+ memoryGenerated + " slots in memory");

                    if (memoryGenerated < (MEMORY_AVAILABLE - memoryUsed)) {
                        for (int i = 0; i < memoryGenerated; i++)
                            process.add(cs);
                        memoryUsed += memoryGenerated;
                        System.out.println("memoria acumuladaCA = " + memoryUsed);
                        System.out.println(process);
                        memory.buildMemory(process);
                    } else {
                        System.out.println("Insufficient memory...");
                    }
                }

            else if(menu.substring(0,1).equals("d")) {


                int rangeMin = -1;
                int rangeMax = -1;
                id = Integer.parseInt(menu.substring(1));

                for (int i = 0; i < process.size(); i++) {
                    if ((rangeMin < 0) && (process.get(i).getID() == id)) {
                        rangeMin = i;
                    } else if (((rangeMax < 0)
                            && (process.get(i).getID() != id)
                            && (rangeMin >= 0))) {
                        rangeMax = i;
                    } else if (i+1== process.size()&&(rangeMax<0)) {
                        rangeMax = i+1;
                    }
                }

                    process.removeRange(rangeMin, rangeMax);
                    memoryUsed-=rangeMax-rangeMin;
                    memory.buildMemory(process);

            }

            else
                System.out.println("Input is not valid. Try again\n");


        }


    }
}
