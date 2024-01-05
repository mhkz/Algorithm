/**
 * @param {number[]} height
 * @return {number}
 */
// 盛最多水的容器 双指针法

var maxArea = function(height) {
    let i = 0, j = height.length - 1, maxArea = Math.min(height[i], height[j]) * j
    while(i < j) {
        const area = Math.min(height[i], height[j]) * (j - i)
        maxArea = Math.max(area, maxArea)
        height[i] > height[j] ?  j -- : i ++
    }
    return maxArea
}


console.log(maxArea([1,8,6,2,5,4,8,3,7]))