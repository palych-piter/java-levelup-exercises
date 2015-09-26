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
        newstack.OverflowStack();
    }

    //Method to add a new value to overflow
    public void OverflowStack()throws Exception {
        try{
            Stack[5] = 666;
            System.out.println("fff");
        } catch (StackOverflowException e){
            System.out.println("Exception while populating an array: " + e);
        }
    }
}
