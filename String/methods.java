import java.util.*;

public class Main{
    
    public static void main(String args[]){
        
        String name = "Jaydeep Sanjay Thorat";
      
        System.out.println(Arrays.toString(name.toCharArray())); // o/p [J,a,y,d,e,e,p, , ......., a,t]
        
        System.out.println(name.toLowerCase());
      
        System.out.println(name.indexOf('e')); // o/p : 5
      
        System.out.println(name.strip()); //remove leading and trailing whitespace
      
        System.out.println(Arrays.toString(name.split(" "))); // convert to array at spaces
        
      }
}

/*
output
[J, a, y, d, e, e, p,  , S, a, n, j, a, y,  , T, h, o, r, a, t]
jaydeep sanjay thorat
4
Jaydeep Sanjay Thorat
[Jaydeep, Sanjay, Thorat]
*/
