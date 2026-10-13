class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arrayS = s.toCharArray();
        char[] arrayT = t.toCharArray();

        Arrays.sort(arrayS);
        Arrays.sort(arrayT);

        String resultS = new String(arrayS);
        String resultT = new String(arrayT);

        return resultS.equals(resultT);
    }
}
