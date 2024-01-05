/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    if(!prices || prices.length === 0) return 0
    let max = 0, slow = 0, fast = 0
    while(fast < prices.length) {
        if(prices[slow] >= prices[fast]) {
            slow = fast
        } else {
            max = Math.max(max, prices[fast] -  prices[slow])
        }
        fast++
    }
    
    return max > 0 ? max : 0
};

console.log(maxProfit([7,1,5,3,6,4]))