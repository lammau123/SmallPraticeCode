//const arr = [10,2,4,5,6,-7];

class HeapQ{
    constructor(compare){
        this.heap = [];
        this.compare = compare;
    }

    float(){
        //left = 2pos + 1, right = 2psos + 2 => pos = (right - 2) / 2
        if(this.heap.length > 1){
            let childIndex = this.heap.length - 1;
            while(childIndex > 0){
                let parentIndex = Math.floor(((childIndex + 1) - 2)/2);
                if(this.compare(this.heap[childIndex], this.heap[parentIndex]) > 0){
                    [this.heap[childIndex], this.heap[parentIndex]] = [this.heap[parentIndex], this.heap[childIndex]];
                }
                childIndex = parentIndex;
            }
        }
    }

    sink(index){
        if(this.heap.length > 1){
            let parentIndex = index || 0;
            let leftIndex = 2*parentIndex + 1;
            let rightIndex = 2*parentIndex + 2;
            while(leftIndex < this.heap.length){
                let swapIndex = leftIndex;
                if(rightIndex < this.heap.length && this.compare(this.heap[rightIndex], this.heap[swapIndex]) > 0){
                    swapIndex = rightIndex;
                }
                if(this.compare(this.heap[swapIndex], this.heap[parentIndex]) > 0){
                    [this.heap[swapIndex], this.heap[parentIndex]] = [this.heap[parentIndex], this.heap[swapIndex]];
                }
                parentIndex = swapIndex;
                leftIndex = 2*parentIndex + 1;
                rightIndex = 2*parentIndex + 2;
            }
        }
    }
    
    add(e){
        this.heap.push(e);
        this.float();
    }

    peek(){
        if(this.heap.length >= 0){
            return this.heap[0];
        }
        return undefined;
    }

    poll(value){
        if(value === 551843){
            console.log(value);
        }
        const index = value ? this.heap.findIndex((element) => element === value): 0;
        if(index >= 0){
            const data = this.heap[index];
            if(this.heap.length - 1 !== index){
                this.heap[index] = this.heap.pop();
                this.sink(index);
            } else {
                this.heap.pop();
            }
            return data;
        }
        return undefined;
    }

    pollAll(){
        const rs = [];
        while(this.heap.length > 0){
            rs.push(this.poll());
        }
        return rs;
    }
}

class MinHeapQ extends HeapQ {
    constructor(compare){
        super(compare);
    }
    //arr: array of number
    //compare: compare number
    static heapify(arr){
        const minheapQ = new MinHeapQ((a, b) => b - a);
        for(let i = 0; i < arr.length; i++){
            minheapQ.add(arr[i]);
        }
        return minheapQ;
    }
}

class MaxHeapQ extends HeapQ {
    constructor(compare){
        super(compare);
    }
    //arr: array of number
    //compare: compare number
    static heapify(arr){
        const maxheapQ = new MaxHeapQ((a, b) => a - b);
        for(let i = 0; i < arr.length; i++){
            maxheapQ.add(arr[i]);
        }
        return maxheapQ;
    }
}
    
//const maxheapQ = MaxHeapQ.heapify([4,3,-6,1,2]);
//const minheapQ = MinHeapQ.heapify([3, 65, 65]);

//console.log(maxheapQ.pollAll());
//console.log(minheapQ.pollAll());

exports.MaxHeapQ = MaxHeapQ;
exports.MinHeapQ = MinHeapQ;


