/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    // 先去掉多余符号
    const str = s.toLowerCase().replace(/[^0-9a-z]/g, '')
    let i = 0, j = str.length - 1
    while(i < j) {
        if(str[i] != str[j]) {
            console.log(str[i], str[j])
            return false
        }
        i ++;
        j --;
    }
    return true;
};

console.log(isPalindrome('A man, a plan, a canal: Panama'))

console.log(isPalindrome('race a car'))