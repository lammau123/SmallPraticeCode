// quick find solution to conectivity problem
const prompt = require('async-prompt');

function quickFind(arr, p, q){
    let i = 0;
    if(arr[p] === arr[q]) return i;
    for(const t = arr[p]; i < arr.length; i++){
        if(arr[i] === t){
            arr[i] = arr[q];
        }
    }
    return i;
}

async function quickFindProgram(){
    const arr = Array.from({length: 10}).map((v, i) => i);
    try{
        while(true){
            const p = await prompt('p: ');
            const q = await prompt('q: ');
            console.log("times: ", quickFind(arr, p, q));
            console.log(`${p} -> ${q} : ${arr}`);
        }
    } catch(err){
        console.log(err);
    }
}

quickFindProgram();