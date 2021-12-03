///number >= 0
function lsb(num){
    return num & (-num);
}

function removeMostOneLeftBit(num){
    return num - lsb(num);
}

exports.lsb = lsb;
exports.removeMostOneLeftBit = removeMostOneLeftBit;