/**
 * @param {number[]} ratings
 * @return {number}
 */
var candy = function(ratings) {
    // 初始化糖果数量，每个孩子先分配一个糖果
    const candies = new Array(ratings.length).fill(1)

    // 从左边开始扫描
    for(let i = 1; i < ratings.length; i ++) {
        if(ratings[i] > ratings[i - 1]) {
            candies[i] = candies[i - 1] + 1
        }
    }

    // 从右边开始扫描
    for(let i = ratings.length - 2; i >= 0; i --) {
        if(ratings[i] > ratings[i + 1]) {
            candies[i] = Math.max(candies[i], candies[i + 1] + 1);
        }
    }

    const total = candies.reduce((total = 0, item)=> total + item)
    return total
};

console.log(candy([1,0,2]))
console.log(candy([1,2,2]))

console.log(candy([4,5,1,1,3,7]))