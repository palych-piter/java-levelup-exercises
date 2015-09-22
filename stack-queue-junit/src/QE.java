import java.util.Scanner;
import static java.lang.Math.*;

public class QE {

public static final double dd = 4.44;

 public static void main(String[] args){

double a = 5;
double b = 6;
double c = 8;

System.out.println(dd);


Scanner s = new Scanner(System.in);

System.out.println("== Qe ==");
System.out.println("Input parameters");

System.out.print("a = ");
a = s.nextDouble();

System.out.print("b = ");
b = s.nextDouble();

System.out.print("c = ");
c = s.nextDouble();

double D = pow(b, 2) - 4 * a * c;

if (abs(D) < 1e-16) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
            return;
        }
        if (D < 0.0) {
            System.out.println("There is not a decision of the QE");
        } else {
            double x1 = (-b + sqrt(D)) / (2 * a);
            double x2 = (-b - sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + "   x2 = " + x2);
        }                       
        
}
}