function luckerNumber(numArr){
    const map = {};
    numArr.forEach(element => {
        map[element] = map[element] ? map[element] + 1 : 1;
    });
    let max = -1;
    for(const [key, value] of Object.entries(map)){
        if(key == value) max = Math.max(max, value);
    }
    return max;
}

console.log(luckerNumber([1,2,3,4,5,5,5,5,5]));