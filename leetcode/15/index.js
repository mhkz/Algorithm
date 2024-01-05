var threeSum = function(nums) {
    if(!nums || nums.length < 3) return []

    
    nums.sort((a, b) => a - b )

    const res = []

    for(let i = 0; i < nums.length - 2; i ++) {
        let n1 = nums[i];
        if(n1 > 0) break;
        // 查看当前值是否与前一个值重复, 如果相等，跳到下一个
        if(i - 1 >= 0 && n1 == nums[i - 1]) continue

        let j = i + 1, k = nums.length - 1
        while(j < k) {
            let n2 = nums[j], n3 = nums[k]
            if(n1 + n2 + n3 === 0) {
                res.push([n1, n2 ,n3])
                j ++; k --
                while(j < k && n2 === nums[j]) j ++
                while(j < k && n3 === nums[k]) k --
            } else if (n1 + n2 + n3 < 0) {
                j ++
            } else {
                k --
            }
        }
    }
    return res;
}


console.log(threeSum([-1,0,1,2,-1,-4]))