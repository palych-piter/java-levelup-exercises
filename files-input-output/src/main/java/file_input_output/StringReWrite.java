package file_input_output;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Andrey on 9/21/2015.
 */
public class StringReWrite{

    //Main method
    public static void main(String[] args)throws Exception {
        RewritingString();
    }

    public static void RewritingString()throws Exception {
        try{
            //define files to handle
            FileWriter outputfile = new FileWriter ("string.out");
            FileReader inputfile = new FileReader ("string.in");

            //define new buffers
            BufferedReader bufferedReader = new BufferedReader(inputfile);
            BufferedWriter bufferedWriter = new BufferedWriter(outputfile);

            String inputstring = bufferedReader.readLine();
            String outputstring = "";

            for (int i=inputstring.length()-1; i>-1; i--){
                outputstring = outputstring + inputstring.substring(i,i+1);
            }

            //Write result into the file
            bufferedWriter.write(outputstring);
            //Close streams
            bufferedReader.close();
            bufferedWriter.close();

        }
        finally {
            System.out.println("The operation has been completed");
        }
    }
}












