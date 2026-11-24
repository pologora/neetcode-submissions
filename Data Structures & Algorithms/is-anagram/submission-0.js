class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        if(s.length !== t.length) return false;

        const map = new Map();

        for(let i = 0; i < s.length; i++){
            const charOne = s[i];
            const charTwo = t[i];

            map.set(charOne, (map.get(charOne) ?? 0) + 1);
            map.set(charTwo, (map.get(charTwo) ?? 0) - 1);
        }

        for(const [_, value] of map.entries()){
            if(value) return false;
        }

        return true;
    }
}
