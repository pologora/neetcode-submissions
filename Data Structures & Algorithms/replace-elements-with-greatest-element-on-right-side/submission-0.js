class Solution {
    /**
     * @param {number[]} arr
     * @return {number[]}
     */
    replaceElements(arr) {
        // for(let i = 0; i < arr.length - 1; i++){
        //     let max = arr[i + 1];

        //     for(let j = i + 1; j < arr.length; j++){
        //         max = Math.max(max, arr[j]);
        //     }

        //     arr[i] = max;
        // }

        // arr[arr.length - 1] = -1;

        // return arr;

        let max = arr.at(-1);
        for(let i = arr.length - 2; i >= 0; i--){
            const temp = arr[i];
            arr[i] = max;
            max = Math.max(max, temp);
        }

        arr[arr.length - 1] = -1;

        return arr;
    }
}
