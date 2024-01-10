/**
 * @param {number} n
 * @return {boolean}
 */

var processNumber = function (n){
    let result = 0
    while(n) {
        result += (n % 10) ** 2
        n = Math.floor(n / 10)
    }
    return result
}

var isHappy = function(n) {
    const map = new Map()
    while (true) {
        if(map.has(n)) return false
        if(n === 1) return true
        map.set(n, true)
        n = processNumber(n)

    }
};



console.log(isHappy(2))