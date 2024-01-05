/**
 * @param {number[]} coins
 * @param {number} amount
 * @return {number}
 */
var coinChange = function(coins, amount) {
    // 假设 coins 数组有序
    // let i = coins.length - 1;
    // let count = 0;
    // // 循环进行贪心选择，直到无剩余金额
    // while (amt > 0) {
    //     // 找到小于且最接近剩余金额的硬币
    //     while (i > 0 && coins[i] > amt) {
    //         i--;
    //     }
    //     // 选择 coins[i]
    //     amt -= coins[i];
    //     count++;
    // }
    // // 若未找到可行方案，则返回 -1
    // return amt === 0 ? count : -1;
    // 初始化一个dp数组，为了方便初始化为Infinity，其实大于amount的都行吧
    let dp = new Array(amount + 1).fill(Infinity);
    dp[0] = 0; // 面额为0的需要0个硬币兑换

    for(let i = 1; i <= amount; i++) { // 循环面额
        for(let coin of coins) { // 循环硬币数组
            if(i >= coin) { // 当面额大于硬币价值时
                // dp[i - coin]：当前面额i减当前硬币价格所需要的最少硬币
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
    }
    // 如果dp[amount]为Infinity，则无法兑换
    return dp[amount] === Infinity ? -1 : dp[amount];
};

console.log(coinChange([1,2,5], 11))

console.log(coinChange([2],3))

console.log(coinChange([1],1))

console.log(coinChange([2,5,10,1], 27))