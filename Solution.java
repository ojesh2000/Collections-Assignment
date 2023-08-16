//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] ss = s.toCharArray();
        TreeMap<Character , Integer> mp = new TreeMap<>();
        int lo = 0 , len = 0 , curIdx = 0;

        for(Character c : ss){
            if(mp.containsKey(c)){
                lo = Math.max(lo , mp.get(c) + 1);
                mp.put(c , curIdx);
            }
            else{
                mp.put(c , curIdx); 
            }
            len = Math.max(len , curIdx - lo + 1);
            curIdx++;
        } 
        return len;
    }
}