package file_input_output;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by Andrey on 9/30/2015.
 */
public class ToHex {

    //define input file name
    public static File inputfile = new File("tobin.in");
    public static File outputfile = new File("tobin.out");

    public static void main(String[] args) throws Exception {
        String stringToConvert;
        String convertedString;

        //define scanning from an input file
        Scanner s = new Scanner(inputfile);
        //define output stream
        PrintStream ps = new PrintStream(outputfile);

        //read a number of tests
        Integer numberOfTests = s.nextInt();

        //initialize an array
        Long[] inputValues = new Long[numberOfTests];

        //read values to an array
        for (int i=0;i<=numberOfTests-1;i++) {
            Long a = s.nextLong();
            inputValues[i] = a;
            if (a < 0) {
                throw new Exception("Negative value has been detected");
            }
        }

        //read next value to handle and make calculation
        for (int i=0;i<=numberOfTests-1;i++) {

            convertedString = "";

            valueToconvert val = new valueToconvert();
            stringToConvert = val.defineResidue(inputValues[i]);

            for (int ilength=stringToConvert.length()-1; ilength>-1; ilength--){
                convertedString = convertedString + stringToConvert.substring(ilength,ilength+1);
            }

            //Write into an output file
            ps.println(convertedString);
        }

        //Close
        ps.close();
        s.close();
    }

    public static class valueToconvert{
        //initialize variables
        String aBin;

        //constructor to reset a converted value
        valueToconvert(){
            aBin = "";
        }

        //method to return a residue
        public String defineResidue(Long valueToconvert){
            if (valueToconvert==0)return "";
            aBin = aBin + valueToconvert%2;
            defineResidue(valueToconvert/2);
            return aBin;
        }

    }
}
