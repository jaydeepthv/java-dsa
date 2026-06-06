class Solution {
    public int largestAltitude(int[] gain) {
        int current = 0;
        int highest = 0;

        for(int n : gain){
            current += n;
            highest = Math.max(highest,current);
        }
        return highest;
    }
}
