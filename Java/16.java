import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution 
{
    public int threeSumClosest(int[] nums, int target) 
    {
        List<int []> combos = new ArrayList<>();
        int closestSum = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i+1; j < nums.length; j++)
            {
                for(int k = j+1; k < nums.length; k++)
                {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(Math.min(Math.abs(sum-target), Math.abs(closestSum-target)) == Math.abs(sum-target))
                    {
                        closestSum = sum;
                    }
                }
            }
        }

        return closestSum;
    }
}