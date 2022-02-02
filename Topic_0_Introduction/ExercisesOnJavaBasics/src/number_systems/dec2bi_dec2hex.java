package number_systems;

public class dec2bi_dec2hex {

    public static void main(String[] args) {

    //Convert the following decimal numbers into binary and hexadecimal numbers:
    //108
    //4848
    //9000

        int remainderBi=0;
        int quotientBi=1;
        int remainderHex=0;
        int quotientHex=1;
        final int HEX = 16;
        final int BI = 2;
        final int NUM = 9000; // Number to convert
        String binaryResult = "";
        String parcialBinaryResult = "";
        String hexResult = "";
        String parcialHexResult = "";


        int number = NUM;
        System.out.print(number + " in binary and hexadecimal is ");

        //Decimal to Binary:
        while (quotientBi != 0){
            quotientBi = number/BI;
            remainderBi = number%BI;


            parcialBinaryResult = Integer.toString(remainderBi);//Convert Int to String
            binaryResult = parcialBinaryResult+binaryResult; //Append the number to te beginning of the string

            number=quotientBi;

        }


         // Decimal to Hexadecimal
        number = NUM;
        while (quotientHex != 0){
            quotientHex = number/HEX;
            remainderHex = number%HEX;


            if (remainderHex<9)
                parcialHexResult = Integer.toString(remainderHex);//Convert Int to String
            else{
                switch(remainderHex){
                    case 10:
                        parcialHexResult = "A";
                        break;
                    case 11:
                        parcialHexResult = "B";
                        break;
                    case 12:
                        parcialHexResult = "C";
                        break;
                    case 13:
                        parcialHexResult = "D";
                        break;
                    case 14:
                        parcialHexResult = "E";
                        break;
                    case 15:
                        parcialHexResult = "F";
                        break;
                }
            }

            hexResult = parcialHexResult+hexResult; //Append the number to te beginning of the string
            number=quotientHex;

        }


        System.out.println(binaryResult + " and " + hexResult + " respectively");


    }
}
