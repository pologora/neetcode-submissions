class Solution {
    /**
     * @param {string[]} operations
     * @return {number}
     */
    calPoints(operations: string[]): number {
        const result = [];

        for(let i = 0; i < operations.length; i++){
            const opr = operations[i];

            switch(opr){
                case '+':
                    result.push(result.at(-1) + result.at(-2));
                    break;
                case 'D': 
                    result.push(result.at(-1) * 2);
                    break;
                case 'C': result.pop();
                    break;
                default:
                    result.push(Number(opr));
            }

        }

        return result.reduce((acc, num) => acc + Number(num),0);
    }
}
