class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isValid(s: string): boolean {
        const closing = '}])';
        const stack = [];
        const map = {
            ")":'(',
            "]":'[',
            "}":'{',
        }

        for(let i = 0; i < s.length; i++){
            const char = s[i];

            if(closing.includes(char)){
                const open = stack.pop();
                if(map[char]!==open){
                    return false;
                }
            }else{
                stack.push(char);
            }
        }

        return stack.length === 0;
    }
}
