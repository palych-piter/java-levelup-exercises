package file_input_output;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by Andrey on 9/30/2015.
 */
public class ToBin {

    //define input file name
    public static File inputfile = new File("tobin.in");
    public static File outputfile = new File("tobin.out");

    //initialize variables
    public static String aBin = "";
    public static String aBinReWrite = "";

    public static void main(String[] args) throws Exception {

        //read parameters from an input file
        Scanner s = new Scanner(inputfile);
        Integer a = s.nextInt();

        //define output stream
        PrintStream ps = new PrintStream(outputfile);

        valueToconvert val = new valueToconvert();
        val.defineResidue(a);

        for (int i=aBin.length()-1; i>-1; i--){
            aBinReWrite = aBinReWrite + aBin.substring(i,i+1);
        }

        //Write into an output file
        ps.println(aBinReWrite);

        //Close
        ps.close();
        s.close();
    }

    public static class valueToconvert{
        //method to return a residue
        public void defineResidue(int valueToconvert){
            if (valueToconvert==0) return;
            aBin = aBin + valueToconvert%2;
            defineResidue(valueToconvert/2);
        }
    }

}
