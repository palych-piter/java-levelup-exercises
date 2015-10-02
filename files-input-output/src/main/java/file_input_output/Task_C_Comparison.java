package file_input_output;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by Andrey on 9/25/2015.
 */
public class Task_C_Comparison {

    /* Define variables */
    public static File file_input = new File("eq.in");
    public static File file_output = new File("eq.out");
    public static Float firstvalue;
    public static Float secondvalue;
    public static Float summ;


    public static void main(String[] args) throws Exception{
      CompareValues();
    }

    public static void CompareValues() throws Exception{

        try {
            Scanner scr = new Scanner(file_input);
            String stringtoverify = scr.nextLine();

            /*Define values*/
            firstvalue = Float.parseFloat(
                    stringtoverify.substring(0, stringtoverify.indexOf(' ')));
            secondvalue = Float.parseFloat(
                    stringtoverify.substring(stringtoverify.indexOf(' ') + 1,
                            stringtoverify.lastIndexOf(' ')));
            summ = Float.parseFloat(
                    stringtoverify.substring(stringtoverify.lastIndexOf(' ') + 1,
                            stringtoverify.length()));

            scr.close();
        } catch(Exception e){
            System.out.printf("Exception while reading " +
                    "data from file: " + e);
        }

        try {

            PrintStream printstream = new PrintStream(file_output);

            if (summ == firstvalue + secondvalue ){
               printstream.println("YES");
            } else {printstream.println("NO");
            }
            printstream.close();

        } catch(Exception e){
            System.out.printf("Exception while writing " +
                    "data to a file: " + e);
        }


    }

}
