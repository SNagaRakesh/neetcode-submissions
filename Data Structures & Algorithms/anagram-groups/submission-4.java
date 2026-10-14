class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;

        HashMap<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String anagram = new String(charArray);
            if(map.containsKey(anagram)) {
                map.get(anagram).add(strs[i]);
            }
            else{
                map.put(anagram, new ArrayList<>());
                map.get(anagram).add(strs[i]);
            }
        }

        List<List<String>> ans = new ArrayList<>();

        for(List<String> v : map.values()){
            ans.add(v);
        }
        return ans;
    }
}
