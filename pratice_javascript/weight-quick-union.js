// quick union solution to conectivity problem
const prompt = require('async-prompt');

function weightQuickUninon(arr, weight, p, q){
    let i, j;
    for(i = p; i != arr[i]; i = arr[i]);
    for(j = p; j != arr[j]; j = arr[i]);
    if(weight[i] < weight[j]){
        arr[i] = j;
        weight[j] += weight[i];
    } else {
        arr[j] = i;
        weight[i] += weight[j];
    }
    
}

async function weightQuickUninonProgram(){
    const arr = Array.from({length: 10}).map((v, i) => i);
    const weight = new Array(10).fill(1);
    try{
        while(true){
            const p = await prompt('p: ');
            const q = await prompt('q: ');
            weightQuickUninon(arr, p, q);
            console.log(p, q, arr);
        }
    } catch(err){
        console.log(err);
    }
}

weightQuickUninonProgram();