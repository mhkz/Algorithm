/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    // 快慢指针
    if(nums.length == 0) return 0;
    let fast = 1, slow = 1
    while(fast < nums.length) {
        if(nums[fast] != nums[fast - 1]) {
            nums[slow] = nums[fast]
            slow ++
        }
        fast ++
    }
    return slow
}
console.log(removeDuplicates([0,0,1,1,1,2,2,3,3,4]))