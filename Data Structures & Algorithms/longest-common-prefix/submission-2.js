class Solution {
    /**
     * @param {string[]} strs
     * @return {string}
     */
    longestCommonPrefix(strs) {
        if(!strs?.length) return '';

        let result = '';
        const wordLength = strs[0].length;

        for(let i = 0; i < wordLength; i++){
            const word = strs[0];
            const char = word[i];

            for(let j = 1; j < strs.length; j++){
                if(char !== strs[j][i]) return result;
            }

            result += char;
        }

        return result;
    }
}
