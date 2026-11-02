class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product =1;
        int[] out = new int[nums.length];
        Map<Integer, Integer> map = new HashMap<Integer, Integer> ();
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=0) {
            product = product * nums[i];
            } else {
                if(map.containsKey(nums[i])) {
                   map.put(nums[i], map.get(nums[i]) + 1);
                } else {
                    map.put(nums[i], 1);
                }
            }
        }
        if(map.containsKey(0) && map.get(0)>=2) {
            return out;
        
        }
        for (int i=0;i<nums.length;i++) {
            if(nums[i]!=0 && !map.containsKey(0)) {
            out[i] = product/nums[i];
            }else if(nums[i]!=0 && map.containsKey(0) && map.get(0) == 1) {
                out[i] = 0;
            }
            
             else {
                out[i]= product;
            }
        }
        return out;
    }
}  
