const {MinHeapQ} = require('./heap');

function processData(input) {
    //Enter your code here
    const arr = input.split("\r\n");
    const minheapQ = MinHeapQ.heapify([]);
    for(let i = 1; i < arr.length; i++){
        const queries = arr[i].split(' ');
        switch(queries[0]){
            case '1':
                console.log("b1", minheapQ.heap);
                minheapQ.add(parseInt(queries[1]));
                console.log("a1", minheapQ.heap);
            break;
            case '2':
                console.log("b2", minheapQ.heap);
                minheapQ.poll(parseInt(queries[1]));
                console.log("a2", parseInt(queries[1]), minheapQ.heap);
            break;
            case '3':
                console.log(minheapQ.peek());
                console.log(3, minheapQ.heap);
            break;
            default:
            break;
        }
    }
} 

//processData("5\r\n1 4\r\n1 9\r\n3\r\n2 4\r\n3");
//processData("4\r\n1 3\r\n1 65\r\n2 65\r\n3");
//processData("3\r\n1 189076\r\n2 189076\r\n1 193865\r\n2 193865\r\n1 -419921\r\n1 429676\r\n3\r\n2 429676\r\n3\r\n1 21716\r\n1 551843\r\n1 950119\r\n1 63171\r\n3\r\n1 841804\r\n1 170054\r\n1 835419\r\n2 835419\r\n2 950119\r\n3\r\n1 258308\r\n1 -734231\r\n1 569347\r\n1 52941\r\n1 777770\r\n2 -734231\r\n1 355316\r\n3\r\n1 415025\r\n1 754479\r\n2 777770\r\n1 -744898\r\n2 551843\r\n1 509662\r\n3\r\n3765746\r\n3\r\n1 809282\r\n2 -744898\r\n3");
