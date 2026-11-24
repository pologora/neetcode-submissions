class MinStack {
    stack = []; //2, 5, 3, 1, 10, 4, -2, -3
    min = []; // 2, 1, -2, -3

    constructor() {}

    /**
     * @param {number} val
     * @return {void}
     */
    push(val: number): void {
        this.stack.push(val);

        if(this.min.length <= 0){
            this.min.push(val);
            return;
        }
        
        if(val <= this.min.at(-1)){
            this.min.push(val);
        }
    }

    /**
     * @return {void}
     */
    pop(): void {
        const val = this.stack.pop();
        if(val === this.min.at(-1)) {this.min.pop();}
    }

    /**
     * @return {number}
     */
    top(): number {
        return this.stack.at(-1);
    }

    /**
     * @return {number}
     */
    getMin(): number {
        return this.min.at(-1);
    }
}
