class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>> map = new HashMap<String, List<String>>();
        for(String str: strs) {
            char[] inp = str.toCharArray();
            int[] out = new int[26];
            for(char c : inp) {
            out[c-'a'] = out[c-'a'] + 1;
            }
            StringBuilder key = new StringBuilder();
            for(int val: out){
            key.append("#").append(val);
            }
           
            if(map.containsKey(key.toString())) {
                List<String> existingList = map.get(key.toString());
                existingList.add(str);
                map.put(key.toString(), existingList);

            } else {
                List<String> newList = new ArrayList<>();
                newList.add(str);
                map.put(key.toString(), newList);
            }

        }
    return new ArrayList<> (map.values());    
    }
    
}
