class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer> ();
        int index =0;
        for(int num: nums) {
            int complement = target - num;
            if(map.containsKey(complement)){
                int in1 = map.get(complement);
                return new int[]{in1, index };
            } else {
                map.put(num, index);
            }
            index++;
        }

        return new int[]{};
    }
}
