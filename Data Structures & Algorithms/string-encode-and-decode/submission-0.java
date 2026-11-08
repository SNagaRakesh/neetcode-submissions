class Solution {

    public String encode(List<String> strs) {
        int n = strs.size();
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String s = strs.get(i);
            int l = s.length();
            str.append(String.valueOf(l));
            str.append('#');
            str.append(s);
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        int n = str.length();

        int i = 0;

        List<String> strs = new ArrayList<>();
        
        while(i < n) {
            int j = i+1;
            while(str.charAt(j) != '#') j++;
            String l = str.substring(i, j);
            int num = Integer.valueOf(l);
            i = j+1;
            strs.add(str.substring(i, i+num));
            i += num;
        }
        return strs;
    }
}
