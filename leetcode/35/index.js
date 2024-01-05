
// 二分法
var searchInsert = function(nums, target) {
    let i = 0, j = nums.length - 1;
    while(i <= j) {
        let m =  Math.floor(i + (j - i) / 2);;
        if(nums[m] > target) {
            j = m - 1;
        } else if(nums[m] < target) {
            i = m + 1;
        } else {
            return m;
        }
    }
    return i;
};

console.log(searchInsert([1,3,5,6], 5))

console.log(searchInsert([1,3,5,6], 2))

console.log(searchInsert([1,3,5,6], 7))