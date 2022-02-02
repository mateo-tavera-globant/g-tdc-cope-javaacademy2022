package number_systems;

import java.util.HashMap;

public class hex2dec_hex2bi {

    public static void main(String[] args) {
        //Convert the following hexadecimal numbers into binary and decimal numbers:
        //ABCDE
        //1234
        //80F
        String hexNumber = "1234";
        String biResult = "";

        //Hexadecimal to Binary

        HashMap convertionTable2Binary = new HashMap();//Set the convertion table as a dictionary

        convertionTable2Binary.put("0","0000");
        convertionTable2Binary.put("1","0001");
        convertionTable2Binary.put("2","0010");
        convertionTable2Binary.put("3","0011");
        convertionTable2Binary.put("4","0100");
        convertionTable2Binary.put("5","0101");
        convertionTable2Binary.put("6","0110");
        convertionTable2Binary.put("7","0111");
        convertionTable2Binary.put("8","1000");
        convertionTable2Binary.put("9","1001");
        convertionTable2Binary.put("A","1010");
        convertionTable2Binary.put("B","1011");
        convertionTable2Binary.put("C","1100");
        convertionTable2Binary.put("D","1101");
        convertionTable2Binary.put("E","1110");
        convertionTable2Binary.put("F","1111");

        for (int i = 0; i <hexNumber.length(); i++) {

            String hexDigit = hexNumber.substring(i,i+1);
            String biDigit = convertionTable2Binary.get(hexDigit).toString();
            biResult = biResult + " " + biDigit;
        }

        System.out.println("The number in Binary is: " + biResult.trim());


// Hexadecimal to Decimal

        HashMap<String,String> convertionTable2Decimal = new HashMap();//Set the convertion table as a dictionary

        convertionTable2Decimal.put("A","10");
        convertionTable2Decimal.put("B","11");
        convertionTable2Decimal.put("C","12");
        convertionTable2Decimal.put("D","13");
        convertionTable2Decimal.put("E","14");
        convertionTable2Decimal.put("F","15");

        String hexBit = "";//Digit of the number
        int hexDigitInt=0;
        float decResult=0;


      for (int i = hexNumber.length() - 1; i >= 0; i--) {
            hexBit = hexNumber.substring(i,i+1);//Digit of the number


            if (convertionTable2Decimal.containsKey(hexBit)){
                String valor = convertionTable2Decimal.get(hexBit).toString();
                hexDigitInt = Integer.parseInt(valor);
                }

            else{
                hexDigitInt = Integer.parseInt(hexBit);
            }


        decResult = decResult + (float) ((hexDigitInt) * Math.pow(16, hexNumber.length() - i - 1));

       }

        System.out.println("The number in Decimal is: " + decResult);
    }




}
