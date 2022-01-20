/*
ColumnsInWall
Mateo Tavera
19/01/2022
Array-Loop practice
 */
package tutoria_1;
/** Write a program which calculate how many movements should we do in order to
 * get all columns of a wall to be the same size. Represent the wall with an array and each column with
 * an integer:
 * Assume that the sum of columns is multiple of the size of the array
 */

public class ColumnsInWall {
    public static void main(String[] args) {

        //Input
        int [] wall = {3,4,2,4,2};
        int sum = 0;
        int vault = 0; //Here we store the transfer
        int movement = 0; //How many blocks we move
        int length = wall.length;
        int average = 0;

        // sum of all values in array using for loop
        for (int i = 0; i < wall.length; i++) {
            sum += wall[i];
        }
        average = sum / length; //This is the value we should have on each column
                                //Note that we are interested only in the integer part
        //Using for loop to move among all items in the wall
        for (int col = 0; col < length; col++){ //col = 0,1,2,...length
            int blockComparison = wall[col] - average;
            if (blockComparison < 0){ //If negative, means that we need to add a block
                vault -= Math.abs(blockComparison);
                movement += Math.abs(blockComparison);
            }
            else if ((blockComparison > 0)){//If positive, means that we need to remove a block
                vault += Math.abs(blockComparison);;
            }

        }
        if (vault == 0){ //Checking that any block isn't in a column
            System.out.println("We need to move " + movement + " blocks");
        }
        else
            System.out.println("There are blocks missing");
    }
}
