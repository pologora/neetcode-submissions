class Solution {
    /**
     * @param {string} s
     * @return {number}
     */
    lengthOfLastWord(s) {
        const arr = s.split(" ").map((w) => w.trim()).filter((w) => w!== "");
        
        return arr.at(-1).length;
    }
}
