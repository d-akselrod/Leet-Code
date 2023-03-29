/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var findMedianSortedArrays = function(nums1, nums2) 
{
    let nums = nums1.concat(nums2);
    nums.sort((a,b) => a-b);

    let n = nums.length;

    if(n % 2 == 1)
    {
        return nums[Math.floor(n/2)];
    }
    else
    {
        return (nums[n/2] + nums[(n/2) - 1])/2;
    }
};