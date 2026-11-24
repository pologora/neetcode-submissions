class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isSubsequence(s, t) {
        let idx = 0;

        for(let i = 0; i < t.length; i++){
            const charS = s[idx];
            const charT = t[i];

            if(charS === charT){
                idx++;
            }
        }

        return idx === s.length;
    }
}
