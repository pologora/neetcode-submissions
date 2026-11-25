class LinkedListNode<T> {
    constructor(val:T){
        this.val = val;
    }

    prev: LinkedListNode<T>;
    next: LinkedListNode<T>;
    val: T;
}

class MyLinkedList {
    tail: LinkedListNode<number>;
    head: LinkedListNode<number>;
    size: number = 0;
  

    constructor() {}

    /**
     * @param {number} index
     * @return {number}
     */
    get(index: number): number {
        if(index >= this.size) return -1;

        let iIndex = index;
        let node = this.head;

        while(iIndex){
            iIndex--;
            node = node.next;
        }

        return node.val;
    }

    /**
     * @param {number} val
     * @return {void}
     */
    addAtHead(val: number): void {
        const newNode = new LinkedListNode(val);

        if (this.size === 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }

            this.size++;
    }

    /**
     * @param {number} val
     * @return {void}
     */
    addAtTail(val: number): void {
        const newNode = new LinkedListNode(val);

        if(this.size === 0){
            this.head = newNode;
            this.tail = newNode;
        }else{
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
        }

        this.size++;
    }

    /**
     * @param {number} index
     * @param {number} val
     * @return {void}
     */
    addAtIndex(index: number, val: number): void {
        if(index > this.size) return;
        if(index === this.size) return this.addAtTail(val);
        if(index === 0) return this.addAtHead(val);

        let node = this.head;
        let idx = index - 1;

        while(idx){
            idx--;
            node = node.next;
        }

        const newNode = new LinkedListNode(val);
        const temp = node.next;
        node.next = newNode;
        newNode.prev = node;
        newNode.next = temp;
        temp.prev = newNode;

        this.size++
    }

    /**
     * @param {number} index
     * @return {void}
     */
    deleteAtIndex(index: number): void {
        if(index >= this.size) return;

        if(this.size === 1){
            this.head = null;
            this.tail = null;
            this.size--;
            return;
        }

        if(index === 0){
            this.head = this.head.next;
            this.head.prev = null;
            this.size--;
            return;
        }

        if(index === this.size - 1){
            this.tail = this.tail.prev;
            this.tail.next = null;
            this.size--;
            return;
        }

        let idx = index - 1;
        let node = this.head;

        while(idx){
            idx--;
            node = node.next;
        }

       node.next.next.prev = node;
       node.next = node.next.next;
       this.size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * var obj = new MyLinkedList()
 * var param_1 = obj.get(index)
 * obj.addAtHead(val)
 * obj.addAtTail(val)
 * obj.addAtIndex(index,val)
 * obj.deleteAtIndex(index)
 */
