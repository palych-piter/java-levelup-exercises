import java.lang.reflect.Modifier;

/**
 * Created by Andrey on 9/27/2015.
 */
public class ReflectionAPI {
    //test string
    String teststring = new String();
    public static void main(String[] args) {
        ReflectionAPI c = new ReflectionAPI();
        c.TestReflectionAPI(c.teststring);
        c.TestReflectionAPINoName();
    }

    public void TestReflectionAPI(Object obj){
        Class testapiclass = obj.getClass();

        System.out.println("Class Name: " + testapiclass.getName());
        System.out.println("Super Class Name: " + testapiclass.getSuperclass());

        // ???????? ???????????? ??????
        int mods = testapiclass.getModifiers();

        if (Modifier.isPublic(mods)) {
            System.out.println("public");
        }
        if (Modifier.isAbstract(mods)) {
            System.out.println("abstract");
        }
        if (Modifier.isFinal(mods)) {
            System.out.println("final");
        }

    }

    public void TestReflectionAPINoName(){
        try {
            Class testapiclassNoName = Class.forName("java.lang.String");
            System.out.println(testapiclassNoName.getName());
        } catch (Exception e){
            System.out.println("Error while creating s class: " + e.getMessage());
        }

    }
}
