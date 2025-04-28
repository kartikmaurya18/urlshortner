package com.url.shortener.security;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] ans=new int[2];
        int n=nums.length;
        HashMap <Integer, Integer> mpp=new HashMap<>();
        for (int i=0;i<n;i++){
            int num=nums[i];
            int moreneed=target-num;
            if (mpp.containsKey(moreneed)){
                ans[0]=mpp.get(moreneed);
                ans[1]=i;
return ans;
            }
                            mpp.put(ans[0], ans[1]);

        }
        return ans;
}
}