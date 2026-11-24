class Solution {
    /**
     * @param {string} s
     * @return {number}
     */
    scoreOfString(s) {
        if(!s || s.length < 2) return 0;
        let sum = 0;

        for(let i = 0; i < s.length - 1; i++){
            const code1 = s.charCodeAt(i);
            const code2 = s.charCodeAt(i + 1);
            
            sum += Math.abs(code1 - code2);
        }

        return sum;
    }
}
