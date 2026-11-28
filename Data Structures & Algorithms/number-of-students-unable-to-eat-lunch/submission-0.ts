class Solution {
    /**
     * @param {number[]} students
     * @param {number[]} sandwiches
     * @return {number}
     */
    countStudents(students: number[], sandwiches: number[]): number {
        if(students.length !== sandwiches.length) throw new Error('Bad data');

        let st1 = 0;
        let st0 = 0;

        for(let i = 0; i < students.length; i++){
            const student = students[i];

           if(student === 0){
            st0++;
           }else {
            st1++;
           }
        }

        while(true){
            const sand = sandwiches[0];

            if(sand === 1){
                if(st1 <= 0){
                    return sandwiches.length;
                }

                st1--;
            }else {
                if(st0 <= 0){
                    return sandwiches.length;
                }

                st0--;
            }

            sandwiches.shift();
        }
    }
}
