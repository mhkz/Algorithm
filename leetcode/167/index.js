/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(numbers, target) {
    let i = 0, j = numbers.length - 1, res = [];
    while(i < j) {
        const total = numbers[i] + numbers[j]
        if(total < target) i ++
        if(total > target) j --
        if(total == target) break
        
    }
    return [i + 1, j + 1]
};

console.log(twoSum([2,7,11,15], 9))
console.log(twoSum([2,3,4], 6))