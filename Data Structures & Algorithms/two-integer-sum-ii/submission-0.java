class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i= 0; i<numbers.length;i++){
            int complement = target - numbers[i];
            if(map.containsKey(complement)) {
                return new int[]{ Math.min(i+1, map.get(complement)), Math.max(i+1, map.get(complement))};

            } else {
                map.put(numbers[i], i+1);
            }

        }
        return new int[] {};
    }
}
