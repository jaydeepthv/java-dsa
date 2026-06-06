import java.util.*;

public class Main{
    static boolean checkPallindrome(String str){
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1) ){
               return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]){
        System.out.println(checkPallindrome("lalal"));
        System.out.println(checkPallindrome(""));
        System.out.print(checkPallindrome("lakjhdlal"));
      }
}
