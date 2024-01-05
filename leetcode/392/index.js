
// 暴力
// var isSubsequence = function(s, t) {
//     let res = '', j = 0;
//     if(s.length === 0) return true;
//     for(const char of s) {
//         for(var z = j; z < t.length; z ++) {
//             j  ++;
//             if(char === t[z]) {
//                 res += t[z]
//                 break
//             }
//         }
//     }
//     return res === s
// };

// 双指针
var isSubsequence = function(s, t) {
    let i = 0, j = 0
    while(i < s.length && j < t.length) {
        if(s[i] == t[j]) i ++;
        j ++
    }
    return i === s.length
};

console.log(isSubsequence('abc', 'ahbgdc'))

console.log(isSubsequence('aaaaaa', 'bbaaaa'))

// console.log(isSubsequence('axc', 'ahbgdc'))