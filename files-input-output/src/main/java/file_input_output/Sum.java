package file_input_output;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by Andrey on 9/21/2015.
 */
public class Sum{

    //Define an input and output files
    public static File inputfile = new File ("sum.in");
    public static File outputfile = new File ("sum.out");

    //Main method
    public static void main(String[] args)throws Exception {
        CalculateSum();
    }

    public static void CalculateSum()throws Exception {
        try {
            PrintStream printstream = new PrintStream(outputfile);
            Scanner scanner = new Scanner(inputfile);
            //Write result into the file
            printstream.println(scanner.nextLong() + scanner.nextLong());
        }
        finally {
            System.out.println("Calculation has been completed");
        }
    }
}












