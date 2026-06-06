import java.util.*;

public class Main{
    
    public static void main(String args[]){
        
        // + operator overloading used for concatting to string
    
    System.out.println('a' + 'b'); // adding ascii value : 195
    
    System.out.println("a" +"b"); // o/p: ab
    
    System.out.println((char)('a' + 3)); // explicite typecast into charcater o/p : d 
    
    System.out.println("a" + 1); // implicite typecast to string o/p : a1
    System.out.println("Jaydeep" + new ArrayList<>()); // o/p Jaydeep[]
   System.out.println(new ArrayList<>() + " " + new ArrayList<>() );
   //Atleast one should be string 
    
      }
}
