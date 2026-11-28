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

       for(const s of students) s === 0 ? st0++ : st1++;

       
    for(let i = 0; i < sandwiches.length; i++){
        const sand = sandwiches[i];

            if(sand === 1){
                if(st1 <= 0){
                    return sandwiches.length - i;
                }

                st1--;
            } else {
                if(st0 <= 0){
                    return sandwiches.length - i;
                }

                st0--;
            }
    }

    return 0;
      
    }
}
