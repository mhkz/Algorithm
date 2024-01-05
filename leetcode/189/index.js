// 轮转数组

var rotate = function(nums, k) {
    nums.splice(0,0,...nums.splice(-k))

    return nums
};


console.log(rotate([-1,-100,3,99],2))

console.log(rotate([1,2,3,4,5,6,7],3))