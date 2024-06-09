const readline = require('readline');

const rl = readline.createInterface({
    input:process.stdin,
    output:process.stdout
});


rl.question('',(input)=>{
    number = parseInt(input);
    console.log(number);
    rl.close();
});