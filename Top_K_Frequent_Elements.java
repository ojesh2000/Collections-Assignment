//https://leetcode.com/problems/top-k-frequent-elements/description/

class cmp implements Comparator<Map.Entry<Integer , Integer>>{
    @Override public int compare(Map.Entry<Integer , Integer> l , Map.Entry<Integer , Integer> r){
        if(l.getValue() > r.getValue())return -1;
        if(l.getValue() < r.getValue())return 1;
        return 0;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        TreeMap<Integer , Integer> freq = new TreeMap<>();

        for(int x : nums){
            freq.putIfAbsent(x , 0);
            freq.put(x , freq.get(x) + 1);
        }

        List<Map.Entry<Integer , Integer>> l = new ArrayList<>(freq.entrySet());

        Collections.sort(l , new cmp());

        int[] ans = new int[k];
        int i = 0;
        for(Map.Entry<Integer , Integer> e : l){
            if(i >= k)break ;
            ans[i++] = (int)e.getKey();
        }
        return ans;

    }
}