package file_input_output;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by Andrey on 9/21/2015.
 */
public class StringReWrite{

    //Define an input and output files
    public static File inputfile = new File ("string.in");
    public static File outputfile = new File ("string.out");

    //Main method
    public static void main(String[] args)throws Exception {
        RewritingString();
    }

    public static void RewritingString()throws Exception {
        try {
            PrintStream printstream = new PrintStream(outputfile);
            Scanner scanner = new Scanner(inputfile);
            String inputstring = scanner.next();
            String outputstring = "";

            for (int i=inputstring.length()-1; i>-1; i--){
                outputstring = outputstring + inputstring.substring(i,i+1);
            }

            //Write result into the file
            printstream.println(outputstring);
        }
        finally {
            System.out.println("The operation has been completed");
        }
    }
}












