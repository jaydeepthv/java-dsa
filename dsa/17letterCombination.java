class Solution {
    static void combination(String p, String uP, List<String> ans){
        if(uP.isEmpty()){
            ans.add(p);
            return;
        }

        String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        int digit = uP.charAt(0) - '0';

        String letters = keypad[digit];

        for(int i =0 ; i< letters.length(); i++){
            combination(p + letters.charAt(i) , uP.substring(1), ans);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        combination("",digits,ans);

        return ans;
    }
}
