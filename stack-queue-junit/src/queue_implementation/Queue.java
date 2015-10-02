package queue_implementation;

/**
 * Created by Andrey Bespalov on 9/14/2015.
 * Homework for the lesson #2, Queue implementation
 */

import java.util.Objects;
import java.util.Scanner;

public class Queue {

    // Define and initialize variables and arrays
    final static int ArraySize = 5; // Define a constant for size of a queue
    static int[] Queue = new int[ArraySize]; // Define a array for a queue
    static int BufferVariable = 0; // Define a variable for exchanging with a queue
    static String OperationType = ""; // Define a variable for operation type


    //Main method
    public static  void main(String[] args) {

        // Initialise a new stack object
        Queue QueueToWork = new Queue();

        //Do while 'exit' key word has been entered
        do {

            // Input an operation type
            Scanner s = new Scanner(System.in);
            System.out.println("Please input type of operation (put/get/exit):");
            OperationType = s.next();

            switch (OperationType) {
                case "get":{
                    System.out.println("Executing put operation ... ");
                    if (QueueToWork.isQueueEmpty()) {
                        System.out.println("The queue is empty. Put a value first.");
                    }
                    else {
                        BufferVariable = QueueToWork.getFromEndAndDelete();
                        System.out.println("The Get operation has been done successfully. " +
                                "Returned value : " + BufferVariable);
                        //return result set, show an actual state of the stack
                        QueueToWork.returnResultSet();
                    }
                    break;
                }
                case "put":{
                    System.out.println("Executing put operation ... ");
                    if (QueueToWork.isQueueFull()) {
                        System.out.println("The stack is full. Get a value first.");
                    }
                    else {
                        System.out.print("Please enter a value to put: ");
                        BufferVariable = s.nextInt();
                        QueueToWork.putToBeginning(BufferVariable);
                        System.out.println("The Put operation has been done successfully.");
                        //return result set, show an actual state of the stack
                        QueueToWork.returnResultSet();
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

    // Define methods to work with a queue

    //Check if a queue is full
    public boolean isQueueFull(){
        return Queue[0] != 0;
    }

    //Check if a queue is empty
    public boolean isQueueEmpty(){
        return Queue[ArraySize - 1] == 0;
    }

    //Get a value from the end of a queue and delete the value
    public int getFromEndAndDelete(){
        int ReturnValue = 0;
        // Define the returned value
        ReturnValue = Queue[ArraySize-1];
        // Re-arrange the queue
        for (int i=ArraySize-1; i>-1; i--){
            if (i>0) {Queue[i] = Queue[i-1];}
            else Queue[i] = 0;
        }
        return ReturnValue;
    }

    //Put a value in the beginning of the queue if the queue is not full
    public void putToBeginning(Integer ValueToPut){
        for (int i=ArraySize-1; i>-1; i--){
            if (Queue[i] == 0){
                Queue[i] = ValueToPut;
                return;
            }
        }
    }

    //Show result set (actual state of the queue)
    public void returnResultSet(){
        System.out.println("Thank you for your effort! Here is how the queue looks like : ");
        for (int i=0; i<ArraySize; i++){
            System.out.println(Queue[i]);
        }
    }


}
