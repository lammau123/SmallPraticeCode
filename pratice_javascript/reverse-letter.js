function reverseLetters(str){
    let arr = Array.from(str);
    for(let i = 0, j = arr.length-1; i < j; i++, j-- ){
        for(; !isLetter(arr[i]) && i < j; i++);
        for(; !isLetter(arr[j]) && i < j; j--);
        if(i < j){
            [arr[i], arr[j]] = [arr[j], arr[i]];
        }
    }
    return arr.join("");
}

function isLetter(char){
    return char.toUpperCase() != char.toLowerCase();
}

console.log(reverseLetters("a-sd2hjlld"));