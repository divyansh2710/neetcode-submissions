class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] c = s.toCharArray();
        int l=0;
         int maxLength = 0;
        Set<Character> set = new HashSet<Character>();
           for (int right = 0; right < s.length(); right++) {
        while(set.contains(c[right])){
             set.remove(c[l]);
                l++;
        }
         set.add(s.charAt(right));

            maxLength = Math.max(maxLength, right - l + 1);
    }
     return maxLength;
}
}
