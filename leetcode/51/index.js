var solveNQueens = function (n) {
    let ans = [];
    const line = Array(n).fill('.');
    // x，y是要处理的下一个坐标，arr是之前皇后组成的数组
    const dfs = (x, y, arr) => {
        // 遍历之前皇后的位置
        for (let [x0, y0] of arr) {
            // 如果和之前的皇后在同一列或者在一条斜线上，直接return
            if (y == y0 || Math.abs(x - x0) == Math.abs(y - y0)) {
                return
            }
        }
        if(x == n -1) {
             // 将皇后的坐标转换成题目要求的字符串，并存入ans
             ans.push([...arr, [x, y]].map(([x0, y0]) => {
                let temp = [...line]
                temp[y0] = 'Q'
                return temp.join('')
            }))
        }
        for (let i = 0; i < n; i++) {
            dfs(x + 1, i, [...arr, [x, y]])
        }
     }

      // 从第一层开始DFS
    for (let i = 0; i < n; i++) {
        dfs(0, i, [])
    }
    return ans;
}

console.log(solveNQueens(4))