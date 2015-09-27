import StackOverflowException.StackOverflowException;

import java.lang.RuntimeException;

/**
 * Created by Andrey on 9/24/2015.
 */
public class StackToOverflow{
    //Initialize a new array
    int[] Stack = new int[5];

    public static void main(String[] args) throws Exception{
        StackToOverflow newstack = new StackToOverflow();
        newstack.OverflowStack(5);
    }

    //Method to add a new value to overflow
    public void OverflowStack(Integer ArrayIndex) throws Exception{
        try{ if (ArrayIndex > 4){
                 //"e" variable will contain this message
                 throw new StackOverflowException("Out of index error.");
             }
        } catch (StackOverflowException e){
            System.out.println("Array error: " + e.getMessage());
        }
    }
}
