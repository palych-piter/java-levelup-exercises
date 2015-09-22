import file_input_output.Sum;
import org.junit.Test;
import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;
import static org.junit.Assert.assertEquals;

/**
 * Created by Andrey Bespalov on 9/21/2015.
 */

/* Task A - Sum 2 values stored in an input file
   and write a result into an output file
*/
public class TaskA {
    @Test
    public void TestOutputFile() throws Exception{

        Sum NewTestCalculation = new Sum();
        NewTestCalculation.CalculateSum();

        //Check results,
        //assuming that the input file stores 2 and 55 as inputs
        Scanner scanneroutput = new Scanner(NewTestCalculation.outputfile);
        assertEquals(57, scanneroutput.nextLong());
    }
}
