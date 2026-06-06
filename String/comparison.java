public class Main{
    
    public static void main(String args[]){
        String a = new String("Jay");
        String b = new String ("Jay");
        
        String c = "Jaydeep";
        String d = "Jaydeep";
        
        // == method is used to check if reference variable are pointing towards same object
       System.out.println( a==b );
       System.out.println( c==d );
       
       //.equals method is used check if values are equal
       System.out.println("a.equals(b) " + a.equals(b));
       System.out.println("c.equals(d) " + c.equals(d));
    }
}
