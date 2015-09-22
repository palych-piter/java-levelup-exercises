//define Class
public class Cat{

//Set how many legs cats usually have
//We define the Static constant out of Main class to be reachable 
//even if no one object has been created for the Main class  
//the constant is available in EVERY method of the class
public static final int NumberOfCatLegsOverall = 4;
// Initialize variable to count created objects (cats)
public static int numberOfCats = 0;
// Initialize variable to define how many legs a particular cat has
public int NumberOfCatLegs;
// Initialize ID of cats, ID is increased once a new object(cat) has been created 
public int CatID = ++numberOfCats;



// define method main
public static void main(String[] args){

// How many legs cats have overall?
// Call the static method without creating a new object
 displayNumberOfCatLegsOverall();

// We want to create a new object (cat) and display some properties of the cat
// To call the nonStaticMethod we need to create an object firts
 Cat Barsic = new Cat();
// Then call the non static method to display number of Barsic's legs 
 Barsic.displayNumberOfCatLegs();
// Display Barsic's ID and overall count of cats
 System.out.println("Barsic properties:");
 System.out.println(Barsic.CatID);
 System.out.println(numberOfCats);

// Then, We want to create another object (cat) and display some properties of the cat
// To call the nonStaticMethod we need to create an object firts
 Cat Funtic = new Cat();
// Then call the non static method to display number of Barsic's legs 
 Funtic.displayNumberOfCatLegs();
// Display Barsic's ID and overall count of cats
 System.out.println("Funtic properties:"); 
 System.out.println(Funtic.CatID);
 System.out.println(numberOfCats);



}

//define a static method
public static void displayNumberOfCatLegsOverall(){
 System.out.println("Printing a number of cats' legs");
 System.out.println(NumberOfCatLegsOverall);
}


//define non static method
public void displayNumberOfCatLegs(){
   // define how many legs a particula cat has
    NumberOfCatLegs = NumberOfCatLegsOverall; 
    System.out.println("Now many legs Barsic has?");
    System.out.println(NumberOfCatLegs);
 
}


}






