import java.util.*;

class Main {
    
  static void subSequence(String proccessed, String unProccessed){
       if(unProccessed.isEmpty()){
           System.out.println(proccessed);
           return;
       } 
       
       char ch = unProccessed.charAt(0);
       
       subSequence(proccessed + ch, unProccessed.substring(1));
       subSequence(proccessed, unProccessed.substring(1));
    }
    
    public static void main(String[] args) {

      subSequence("","abc");

    }
}
