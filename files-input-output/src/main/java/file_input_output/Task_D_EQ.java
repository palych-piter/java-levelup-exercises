import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.Scanner;
import static java.lang.Math.*;
import java.io.File;

public class Task_D_EQ {
    public static void main(String[] args) throws Exception{

        //define input file name
        File inputfile = new File("sqreq.in");
        File outputfile = new File("sqreq.out");

        //read parameters from an input file
        Scanner s = new Scanner(inputfile);

        Float a = s.nextFloat();
        Float b = s.nextFloat();
        Float c = s.nextFloat();

        System.out.println("a: " + a + " b: " + b + " c: " + c);

        //define output stream
        PrintStream ps = new PrintStream(outputfile);

        //a corner case - infinitely many decisions
        if (a == 0 && b==0 && c==0){
            ps.println(-1);
            return;
        }

        //a corner case - no decisions
        if (a == 0){
            ps.println(0);
            return;
        }

        //resolve the eq
        double D = pow(b, 2) - 4 * a * c;
        if (abs(D) < 1e-16) {
            double x = -b / (2 * a);
            ps.println(1);
            ps.println(x);
            return;
        }
        if (D < 0.0) {
            ps.println("There is not a decision of the QE");
        } else {
            ps.println(2);
            Double x1 = (-b + sqrt(D)) / (2 * a);
            Double x2 = (-b - sqrt(D)) / (2 * a);

            BigDecimal xBD1 = BigDecimal.valueOf(x1).setScale(0, BigDecimal.ROUND_HALF_EVEN);
            BigDecimal xBD2 = BigDecimal.valueOf(x2).setScale(0, BigDecimal.ROUND_HALF_EVEN);

            if (x2>x1){
                ps.println(xBD1);
                ps.println(xBD2);
            }
            else{
                ps.println(xBD2);
                ps.println(xBD1);
            }
        }
        ps.close();
        s.close();
    }
}