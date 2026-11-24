class Solution {
    /**
     * @param {string} s
     * @return {number}
     */
    lengthOfLastWord(s) {
        // const arr = s.split(" ").map((w) => w.trim()).filter((w) => w!== "");

        // return arr.at(-1).length;

        let idx = s.length - 1;
        let count = 0;
        while(s[idx] === ' '){
            idx--;
        }

        while(s[idx] !== ' ' && idx >= 0){
            count++;
            idx--;
        }

        return count;
    }
}
