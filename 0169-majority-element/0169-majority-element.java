class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
                hm.put(nums[i],hm.get(nums[i])+1);
            else
                hm.put(nums[i],1);
        }
        
      int temp = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry : hm.entrySet())
        {
            if(entry.getValue() > (nums.length/2)){
              temp = entry.getKey();
                break;
            }
        }
         return temp;
    }
}