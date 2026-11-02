class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toCollection(HashSet::new));
       int longest =0;
       for(Integer item: set) {
        if(!set.contains(item-1)) {
                int current = item;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }
return longest;
       }

    }

