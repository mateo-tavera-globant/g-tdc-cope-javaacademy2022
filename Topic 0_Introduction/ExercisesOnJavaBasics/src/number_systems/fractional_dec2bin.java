package number_systems;

public class fractional_dec2bin {

    public static void main(String[] args) {

    //Convert the following decimal numbers into binary equivalent:
    //19.25D
    //123.456D

        float decNumber = 123.456F; //Number to convert

        // We have to separte the values next to the decimal pont:
        int decNumberInt = (int)Math.floor(decNumber);
        float decNumberFrac = decNumber-decNumberInt;
        //Operation to round decimals
        decNumberFrac = Math.round(decNumberFrac*10000);
        decNumberFrac = decNumberFrac/10000;
        //Now we have two procedure:

        //Integer part:

        int remainderBi=0;
        int quotientBi=1;
        String binaryResult = "";
        final byte BINARY = 2;
        String parcialBinaryResult = "";

        while (quotientBi != 0){
            quotientBi = decNumberInt / BINARY;
            remainderBi = decNumberInt % BINARY;

            parcialBinaryResult = Integer.toString(remainderBi);//Convert Int to String
            binaryResult = parcialBinaryResult+binaryResult; //Append the number to te beginning of the string

            decNumberInt=quotientBi;
        }

        // Fractional part:

        float quotientFrac = 0;
        int quotientParcial = 0;
        String fracParcialResult = "";
        String fracResult = "";

        while (decNumberFrac!=0){

            quotientFrac = decNumberFrac*BINARY;
            quotientParcial = (int) Math.floor(quotientFrac);

            fracParcialResult = Integer.toString(quotientParcial);//Convert Int to String
            fracResult = fracResult+fracParcialResult;

            decNumberFrac=quotientFrac-quotientParcial;

        }

        System.out.println( decNumber + " in Binary is "+binaryResult + "." + fracResult);






    }

}
