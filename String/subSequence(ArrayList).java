import java.util.*;

class Main {
    
  static ArrayList<String> subSequence(String proccessed, String unProccessed){
  
        if(unProccessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(proccessed);
            return list;
        }
        char ch = unProccessed.charAt(0);
        
        ArrayList<String> left = new ArrayList<>();
        ArrayList<String> right = new ArrayList<>();
        left = subSequence(proccessed,unProccessed.substring(1));
        right = subSequence(ch + proccessed,unProccessed.substring(1));
        
         left.addAll(right);
       
       return left;
    }
    
    public static void main(String[] args) {

     ArrayList<String> list = new ArrayList<>();
     list = subSequence("","abc");
     for(String s : list){
         System.out.println(s);
     }

    }
}
