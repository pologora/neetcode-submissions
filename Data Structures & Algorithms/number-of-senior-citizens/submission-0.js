class Solution {
    /**
     * @param {string[]} details
     * @return {number}
     */
    countSeniors(details) {
        if(!details?.length) return 0;
        const SENIOR_AGE = 60;
        let seniorsCount = 0;

        for(const detail of details){
            const age = `${detail[11]}${detail[12]}`;
            console.log(age)
            if(age > SENIOR_AGE){
                seniorsCount++;
            }
        }

        return seniorsCount;
    }
}
