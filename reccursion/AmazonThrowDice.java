import java.util.*;
class Main {
    
    static ArrayList<String> dice(String p, int target ){
        
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 1; i<= 6 && i <=target; i++){
         ArrayList<String> temp = new ArrayList<>();
         temp = dice(p + i, target - i);
         ans.addAll(temp);
        }
        
        return ans;
   
    }
   
    
    public static void main(String[] args) {
        System.out.println(dice("",4));
    
    }
}
