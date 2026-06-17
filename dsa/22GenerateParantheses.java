class Solution {

    static void helper(List<String> list, int n, String s, int open, int close){
        if(s.length() == n*2){
            list.add(s);
            return;
        }
        
            if(open > close && close < n){

             helper(list, n, s+")", open, close + 1);

            }
            
            if(open < n){
                
                 helper(list, n, s+"(", open + 1, close);

            }
           
    }
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        String s = "";

        helper(list,n,s,0,0);
        return list;
    }
}
