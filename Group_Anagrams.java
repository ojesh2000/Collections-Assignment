//https://leetcode.com/problems/group-anagrams/description/
class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> mp = new TreeMap<>();

        for(String s : strs){
            char[] ss = s.toCharArray();
            Arrays.sort(ss);
            String sortedString = new String(ss);
            mp.putIfAbsent(sortedString , new ArrayList<String>());
            mp.get(sortedString).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}