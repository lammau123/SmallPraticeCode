// quick find solution to conectivity problem
const prompt = require('async-prompt');

function quickFind(arr, p, q){
    if(arr[p] === arr[q]) return;
    for(let i = 0; i < arr.length; i++){
        const t = arr[p];
        if(arr[i] === t){
            arr[i] = arr[q];
        }
    }
}

async function quickFindProgram(){
    const arr = Array.from({length: 10}).map((v, i) => i);
    try{
        while(true){
            const p = await prompt('p: ');
            const q = await prompt('q: ');
            quickFind(arr, p, q);
            console.log(p, q, arr);
        }
    } catch(err){
        console.log(err);
    }
}

quickFindProgram();