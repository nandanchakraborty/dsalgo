function search(nums, target) {
    let low = 0;
    let high = nums.length - 1;

    while (low <= high) {
        const mid = Math.floor((low + high) / 2);

        if (nums[mid] === target) {
            return mid;
        }

        if (nums[mid] < target) {
            low = mid + 1;
        } else {
            high = mid - 1 ;
        }
    }

    return -1;
}

const nums = [-1,0,2,4,6,8];
const target = 4;
console.log(search(nums, target));
