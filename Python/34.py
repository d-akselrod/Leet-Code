class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        first = None
        last = None

        if target not in nums:
            return [-1,-1]

        for i,n in enumerate(nums):
            if n == target:
                if first is None:
                    first = i
                last = i

        return [first, last]