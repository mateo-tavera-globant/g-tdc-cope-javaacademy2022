package tutoria_1;

import java.util.*;

public class CacheMemory {

    public static void main(String[] args) {
        //Input
        ArrayList<String> dataBase = new ArrayList<String>(
                Arrays.asList("001", "name1", "002", "name2", "003", "name3"));
        HashMap<String, String> cacheMemory = new HashMap<String, String>();
        Scanner scanner = new Scanner(System.in);
        String id = "0";

    //Using an infinite loop to look up in the memory
    while (id != "") {
        System.out.print("Enter the ID or press Enter to close: ");
         id = scanner.nextLine();

        if (cacheMemory.containsKey(id)) {//If the ID is in the memory, then print data from there
            System.out.print(id + " - " + cacheMemory.get(id));
            System.out.println(" (from cache)");//To see from where we are getting the data
        }

        else {//otherwise, print data form database and move it to memory

            if (dataBase.contains(id)){//Validate if the ID entered is a correct value
                cacheMemory.putIfAbsent(id, dataBase.get(dataBase.indexOf(id) + 1));
                System.out.print(id + " - " + dataBase.get(dataBase.indexOf(id) + 1));
                System.out.println(" (from datbase)");//To see from where we are getting the data
            }
            else if (id == ""){//Finish the infinite loop
                System.out.println("Closing program...");
            }
            else{
                System.out.println("Invalid ID, please try again...");
            }

        }

    }

    }
}
