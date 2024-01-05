/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    for(let i = 2; i< nums.length; i ++) {
        console.log(nums[i], nums[i - 1], nums[i - 2])
        if(nums[i] == nums[i - 1] && nums[i] === nums[i - 2]) {
            
            nums.splice(i - 1, 1);
            i --
        }
    }
    return nums.length
};

console.log(removeDuplicates([1,1,1,2,2,3]))

console.log(removeDuplicates([0,0,1,1,1,1,2,3,3]))

console.log(removeDuplicates([1,1,1]))