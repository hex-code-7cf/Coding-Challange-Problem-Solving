const readline = require('readline');

const rl = readline.createInterface({
    input:process.stdin,
    output:process.stdout
});


rl.question('',(input)=>{
    let n = parseInt(input);
    let total = 4 + 3*(n-1);
    console.log(total);
    rl.close();
})