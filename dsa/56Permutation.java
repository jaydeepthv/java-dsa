import java.util.*;

public class Main{

static void permutation(String p , String uP){
    if(uP.isEmpty()){
        System.out.println(p);
        return;
    }
    
    char ch = uP.charAt(0);
    
    for(int i = 0; i <= p.length(); i++){
        
        String first= p.substring(0,i);
        String second = p.substring(i,p.length());
        
        permutation(first+ ch + second , uP.substring(1));
    }
}
    
    public static void main(String args[]){
        permutation("","ab");
      }
}
