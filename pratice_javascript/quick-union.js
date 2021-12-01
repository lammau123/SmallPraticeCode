// quick union solution to conectivity problem
const prompt = require('async-prompt');

function quickUninon(arr, p, q){
    let i, j;
    for(i = p; i != arr[i]; i = arr[i]);
    for(j = p; j != arr[j]; j = arr[i]);
    arr[i] = arr[j];
}

async function quickUnionProgram(){
    const arr = Array.from({length: 10}).map((v, i) => i);
    try{
        while(true){
            const p = await prompt('p: ');
            const q = await prompt('q: ');
            quickUninon(arr, p, q);
            console.log(p, q, arr);
        }
    } catch(err){
        console.log(err);
    }
}

quickUnionProgram();