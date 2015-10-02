package file_input_output;
import java.io.*;


/**
 * Created by Andrey on 9/21/2015.
 */
public class StringReWriteInputAPI{

    //Main method
    public static void main(String[] args)throws Exception {
        RewritingStringFromFile();
    }

    public static void RewritingStringFromFile()throws Exception {
        try{
            //define files to handle
            FileWriter outputfile = new FileWriter ("string.out");
            FileReader inputfile = new FileReader ("string.in");

            //define new buffers
            BufferedReader bufferedReader = new BufferedReader(inputfile);
            BufferedWriter bufferedWriter = new BufferedWriter(outputfile);
            //read string to rewrite from a file
            String inputstring = bufferedReader.readLine();
            //rewrite a string
            String outputstring = RewriteString(inputstring);
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

    public static String RewriteString (String inputstring){
        String rewrittenstring = "";
        for (int i=inputstring.length()-1; i>-1; i--){
            rewrittenstring = rewrittenstring + inputstring.substring(i,i+1);
        }
        return rewrittenstring;
    }
}
