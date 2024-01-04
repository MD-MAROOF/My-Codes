class Solution {
    public int minOperations(int[] nums) {

        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
            else
                map.put(nums[i],1);
            
        }
        
        int count = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            int t = entry.getValue();
            
            if(t == 1)
                return -1;
            
            count = count + (t/3);
            if(t % 3 != 0)
                count++;
        }
        
        return count;
    }
}