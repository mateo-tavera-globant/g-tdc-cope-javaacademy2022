package topic_0_java_basics;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String menu;
        final int MEMORY_AVAILABLE = 200;
        int memoryUsed=0;
        int memoryGenerated;
        int id;
        Scanner scanner = new Scanner(System.in);
        Memory mem = new Memory();
        ArrayList<GeneralProcess> sys = new ArrayList<>();
        //ArrayList<AppProcess> app = new ArrayList<>();


        while (memoryUsed<MEMORY_AVAILABLE) {

            System.out.println("""
                    Select the option:
                    ca: create application process
                    cs: create system process
                    d+id: delete process marked with given ID\s""");
            menu = scanner.nextLine();

            switch (menu) {
                case "ca":
                    AppProcess ca = new AppProcess();
                    //app.add(ca);
                    id = ca.getID();
                    memoryGenerated = ca.getStorage();
                    System.out.println("memoria genreadaCA = " + memoryGenerated);
                    if (memoryGenerated<(MEMORY_AVAILABLE - memoryUsed)) {
                        for(int i =0;i<memoryGenerated;i++)
                            sys.add(ca);

                        memoryUsed += memoryGenerated;
                        System.out.println("memoria acumuladaCA = " + memoryUsed);
                        System.out.println(sys);
                        mem.buildMemory(sys,ca,memoryGenerated);
                    }
                    else {
                        System.out.println("Insufficient memory...");
                    }


                    break;
                case "cs":
                    SystemProcess cs = new SystemProcess();
                   // sys.add(cs);
                    id = cs.getID();
                    memoryGenerated = cs.getStorage();
                    System.out.println("memoria genreadaCA = " + memoryGenerated);

                    if (memoryGenerated<(MEMORY_AVAILABLE - memoryUsed)){
                        for(int i =0;i<memoryGenerated;i++)
                            sys.add(cs);

                        memoryUsed += memoryGenerated;
                        System.out.println("memoria acumuladaCA = " + memoryUsed);
                        System.out.println(sys);
                        mem.buildMemory(sys,cs,memoryGenerated);
                    }
                    else {
                        System.out.println("Insufficient memory...");


                    }
                    break;
                case "d":
                    break;
                default:
                    System.out.println("Input is not valid. Try again\n");
                    break;
            }

        }

        //System.out.println(sys.get(1).getID());
        //System.out.println(app.get(0).getID());
        //System.out.println("random " + sys.get(1).getStorage());
        //System.out.println("random " + app.get(1).getStorage());

    }
}
