package stack_implementation;

/**

 * Created by Andrey Bespalov on 9/14/2015.
 * Homework for the lesson #2, Stack implementation
 */
import java.util.Objects;
import java.util.Scanner;
import static stack_implementation.TestStackPopOperation.*;

public class Stack {

    // Define and initialize variables and arraays
    final static int ArraySize = 5; // Define a constant for size of a stack
    static int[] Stack = new int[ArraySize]; // Define a array for a stack
    static int CashForStack = 0; // Define a variable for exchanging with a stack
    static String OperationType = ""; // Define a variable for operation type


    //Main method
    public static void main(String[] args) {

        // Initialise a new stack object
        Stack StackToWork = new Stack();

        //Do while 'exit' key word has been entered
        do {

            // Input an operation type
            Scanner s = new Scanner(System.in);
            System.out.println("Please input type of operation (pop/push/exit):");
            OperationType = s.next();

            switch (OperationType) {
                case "pop":{
                    System.out.println("Executing pop operation ... ");
                    if (StackToWork.isStackEmpty()) {
                        System.out.println("The stack is empty. Push a value first.");
                    }
                    else {
                        CashForStack = StackToWork.popFromTopAndDelete();
                        // Make Unit Testing
                        System.out.println("The Pop operation has been done successfully. " +
                                "Returned value : " + CashForStack);
                        //return result set, show an actual state of the stack
                        StackToWork.returnResultSet();
                    }
                    break;
                }
                case "push":{
                    System.out.println("Executing push operation ... ");
                    if (StackToWork.isStackFull()) {
                        System.out.println("The stack is full. Pop a value first.");
                    }
                    else {
                        System.out.print("Please enter a value to push: ");
                        CashForStack = s.nextInt();
                        StackToWork.pushToTop(CashForStack);
                        System.out.println("The Push operation has been done successfully.");
                        //return result set, show an actual state of the stack
                        StackToWork.returnResultSet();
                    }
                    break;
                }
                case "exit":{
                    System.out.println("The game is over. Thanks!");
                    return;
                }
                default:{
                    System.out.println("Wrong operation type");
                    break;
                }
            }
        } while (!Objects.equals(OperationType, "exit"));
    }


    // Define methods to work with a stack

    //Check if a stack is full
    public boolean isStackFull(){
        return Stack[0] != 0;
    }

    //Check if a stack is empty
    public boolean isStackEmpty(){
        return Stack[ArraySize - 1] == 0;
    }

    //Pop a value from the top of a stack and delete the value
    public int popFromTopAndDelete(){
        int ReturnValue = 0;
        for (int i=0; i<ArraySize; i++){
            if (Stack[i] != 0){
                ReturnValue = Stack[i];
                Stack[i] = 0;
                return ReturnValue;
            }
        }
        return ReturnValue;
    }

    //Push a value on the top of the stack if the stack is not full
    public void pushToTop(Integer ValueToPush){
        for (int i=ArraySize-1; i>-1; i--){
            if (Stack[i] == 0){
                Stack[i] = ValueToPush;
                return;
            }
        }
    }

    //Show result set (actual state of the stack)
    public void returnResultSet(){
        System.out.println("Thank you for your effort! Here is how the stack looks like : ");
        for (int i=0; i<ArraySize; i++){
            System.out.println(Stack[i]);
        }
    }




}
