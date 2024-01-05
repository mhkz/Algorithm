/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    if(nums.length <= 2) return nums.length;

    let slow = 2, fast = 2
    while(fast < nums.length) {
        if(nums[slow - 2] != nums[fast]) {
            nums[slow] = nums[fast]
            slow ++
        }
        fast ++
    }
    return slow
};

console.log(removeDuplicates([1,1,1,2,2,3]))

console.log(removeDuplicates([0,0,1,1,1,1,2,3,3]))

console.log(removeDuplicates([1,1,1]))