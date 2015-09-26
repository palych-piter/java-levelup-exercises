package StackOverflowException;

/**
 * Created by Andrey on 9/27/2015.
 */
public class StackOverflowException extends Exception{

    public static void main(String[] args) throws Exception {
        throw new StackOverflowException();
    }

}
