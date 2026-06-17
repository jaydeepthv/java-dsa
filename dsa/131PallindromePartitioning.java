class Solution {
   static boolean isPallindrome(String s, int start, int end){
        while(start <= end){
            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
   }

   static void func(String s , List<List<String>> result, List<String> path , int idx){
    if(idx == s.length()){
        result.add(new ArrayList<>(path));
        return;
    }

    for(int i = idx; i < s.length(); ++i){
        if(isPallindrome(s,idx,i)){
            path.add(s.substring(idx,i+1));
            func(s, result, path , i+1);
            path.remove(path.size()-1);
        }
    }
   }

    public List<List<String>> partition(String s) {

        List<List<String>> result = new ArrayList<>();
        List<String> path = new ArrayList<>();

        func(s, result, path, 0);

        return result;
        
    }
}
