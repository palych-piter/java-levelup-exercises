package stack_implementation;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Andrey on 9/16/2015.
 */
public class TestStackPopOperation extends Assert{

    @Test
    public void testPop(){
        Stack StackToTest = new Stack();
        //Check if a stack is empty
        assertTrue(StackToTest.isStackEmpty());
        //Check push/pop
        StackToTest.pushToTop(3);
        StackToTest.pushToTop(4);
        StackToTest.pushToTop(5);
        assertEquals(5,StackToTest.popFromTopAndDelete());
        assertEquals(4,StackToTest.popFromTopAndDelete());
        assertEquals(3,StackToTest.popFromTopAndDelete());
        //Just check that the code is being executed here
        fail("The test. The code shouldn't being executed here.");
    }
}
