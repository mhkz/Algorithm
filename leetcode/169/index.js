// 多数元素

/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    let map = {}, maxNumber = nums[0], maxCount = 1
    for(let i = 0; i < nums.length; i ++) {
        if(map[nums[i]]) {
            map[nums[i]] = map[nums[i]] + 1
            if(map[nums[i]] > maxCount) {
                console.log(map[nums[i]], )
                maxCount = map[nums[i]]
                maxNumber = nums[i]
            }
        } else {
             map[nums[i]] = 1
        }
    }
    return maxNumber
};


// console.log(majorityElement([2,2,1,1,1,2,2]))

// console.log(majorityElement([3,2,3]))

console.log(majorityElement([3,3,4]))