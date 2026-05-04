// problem statement : Given an integer array nums, find the subarray with the largest sum, and return its sum.

// leetcode 53
var maxSubArray = function(nums) {
    let sum = nums[0];
    let ttl = 0;
    for(let n of nums){
        if(ttl < 0){
            ttl =0;
        }
        ttl +=n;
        sum = Math.max(sum,ttl);
    }
    return sum;
};

 
console.log(maxSubArray([-2,1,2,-1,0,3,4,5]));