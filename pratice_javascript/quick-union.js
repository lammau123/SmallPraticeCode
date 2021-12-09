// quick union solution to conectivity problem
const prompt = require('async-prompt');

function quickUninon(arr, p, q){
    let i, j, count = 0;
    for(i = p; i != arr[i]; i = arr[i]) count++;
    for(j = q; j != arr[j]; j = arr[j]) count++;
    console.log("Test: ", i, j);
    arr[i] = j;
    return count;
}

async function quickUnionProgram(){
    const arr = Array.from({length: 10}).map((v, i) => i);
    try{
        while(true){
            const p = await prompt('p: ');
            const q = await prompt('q: ');
            console.log("times : ", quickUninon(arr, parseInt(p), parseInt(q)));
            console.log(p, q, arr);
        }
    } catch(err){
        console.log(err);
    }
}

quickUnionProgram();