
//33. Search in Rotated Sorted Array

function searchInRotatedArray(nums,target){
    for(let i =0;i<nums.length;i++){
        if(nums[i] === target) return i;
        
    }
    return -1;
}


// another one :
// ==============242. Valid Anagram==================

/*angram means : An anagram is a word or phrase formed by rearranging the 
letters of a different word or phrase, using all the original
letters exactly once.  using hashmap
*/

var isAnagram = function(str1, str2) {
   if (str1.length !== str2.length) return false;
    const hist = {};
    for (let char of str1) {
        hist[char] = (hist[char] || 0) + 1;
    }
    for (let char of str2) {
        if (!hist[char]) return false;
        hist[char]--;
    }
    return true;
}

  
