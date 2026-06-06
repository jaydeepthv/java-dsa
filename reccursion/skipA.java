

class Main {
    
    static String skipA(String s){
        if(s.length() == 0) return "";
        
        char ch = s.charAt(0);

        if(ch != 'a'){
            
            return ch + skipA(s.substring(1));
        }  
        return skipA(s.substring(1));
    }
    
    public static void main(String[] args) {

        String s = "aaabbabbabba";
        System.out.println(skipA(s));

    }
}
