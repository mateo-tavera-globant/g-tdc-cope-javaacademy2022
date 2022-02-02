package number_systems;

import java.util.HashMap;

public class bi2dec_bi2hex {

    public static void main(String[] args) {
//Convert the following binary numbers into hexadecimal and decimal numbers:
//1000011000 -> 0010_0001_1000
//10000000 -> 1000_0000
//101010101010 -> 1010_1010_1010

        int bitNumber = 0;
        float decResult = 0;
        String hexResult = "";
        final long biNumber = 101010101010L;
        String biNumberString = "";

        biNumberString = Long.toString(biNumber);//Convert Int to String
        //Binary to Decimal

        for (int i = biNumberString.length() - 1; i >= 0; i--) {
            char bit = biNumberString.charAt(i);
            bitNumber = Character.getNumericValue(bit);

            decResult = decResult + (float) ((bitNumber) * Math.pow(2, biNumberString.length() - i - 1));

        }

        System.out.println("The number in decimal is: " + decResult);


//Binary to Hexadecimal

        HashMap convertionTable = new HashMap();//Set the convertion table as a dictionary

        convertionTable.put("0000", "0");
        convertionTable.put("0001", "1");
        convertionTable.put("0010", "2");
        convertionTable.put("0011", "3");
        convertionTable.put("0100", "4");
        convertionTable.put("0101", "5");
        convertionTable.put("0110", "6");
        convertionTable.put("0111", "7");
        convertionTable.put("1000", "8");
        convertionTable.put("1001", "9");
        convertionTable.put("1010", "A");
        convertionTable.put("1011", "B");
        convertionTable.put("1100", "C");
        convertionTable.put("1101", "D");
        convertionTable.put("1110", "E");
        convertionTable.put("1111", "F");

    //If the number doesn't have groups of 4 digits, then add 0 at the beginning until it does
        while (biNumberString.length()%4!=0){
            biNumberString = "0"+biNumberString;
        }

        for (int i = 0; i <biNumberString.length(); i+=4) {

            String biDigit = biNumberString.substring(i,i+4);
            String hexDigit = convertionTable.get(biDigit).toString();
            hexResult = hexResult + hexDigit;

        }
        System.out.println("The number in hexadecimal is: " + hexResult);













    }






}
