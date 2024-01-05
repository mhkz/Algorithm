/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findKthLargest = function(nums, k) {
    nums.sort((a, b) => b - a);

    for(let i = 0; i < nums.length; i ++) {
        if(i == k - 1) {
            return nums[i]
        }
        
        if(i >0 && nums[i] === nums[i + 1]) {
            i ++
        }
    }
};

console.log(findKthLargest([3,2,1,5,6,4], 2))

console.log(findKthLargest([3,2,3,1,2,4,5,5,6], 4))