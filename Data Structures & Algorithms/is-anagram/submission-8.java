class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() !=t.length()){
            return false;
        } else {
        Map m1 = createFrequencyMap(s);
        Map m2 = createFrequencyMap(t);
       
         for(char item: s.toCharArray()){
            if(!Objects.equals(m1.get(item), m2.get(item))){
                return false;
            }
         }
         return true;
        }


    }

    private Map createFrequencyMap(String data) {
        char[] items = data.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char item: items) {
            if(map.containsKey(item)) {
               // System.out.println("contains key");
                Integer val = map.get(item);
                map.put(item, ++val);
            } else {
                map.put(item, 1);
            }

        }
        return map;

    }
}
